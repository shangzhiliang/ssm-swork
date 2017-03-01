package com.szl.decp.customer.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.szl.decp.common.utils.JsoupUtils;
import com.szl.decp.customer.model.PdmsOrderReceiveInfo;
import com.szl.decp.customer.query.PdmsOrderReceiveInfoQuery;
import com.szl.decp.customer.service.PdmsOrderReceiveInfoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
public class PdmsOrderReceiveInfoServiceImplTest {

	private static final Logger logger = Logger.getLogger(PdmsOrderReceiveInfoServiceImplTest.class);
	
	@Resource
	public PdmsOrderReceiveInfoService pdmsOrderReceiveInfoService;

	private static final String prefix = "http://api.map.baidu.com/routematrix/v2/driving?output=json";
	
	private static final String afterFix = "&ak=BG3zpwcTFTuWrS4HbweA1SGndAVobszQ";
	
	private static final int worker_count = 30; //初始化固定线程池个数
	
	private static final int EXEC_TIMES_PER_TYPE = 1;//每种类型任务重复执行的次数
	
	private static final int MAX_RECORD = 20000; //并发处理总记录数
	
	@Test
	public void test() {
		PdmsOrderReceiveInfoQuery p = new PdmsOrderReceiveInfoQuery();
		p.setSortName("id");
		List<PdmsOrderReceiveInfo>  pList = pdmsOrderReceiveInfoService.queryListBeans(p);
		List<PdmsOrderReceiveInfo> filerList = pList.stream().filter(o -> !o.getReceiveLongitude().equals(""))
											   .filter(o -> !o.getReceiveLatitude().equals(""))
											   .filter(o -> !o.getReceiveLongitude().equals("undefined"))
											   .collect(Collectors.toList());
		List<String> laList = new ArrayList<>();
		for (Iterator<PdmsOrderReceiveInfo> iterator = filerList.iterator(); iterator.hasNext();) {
			PdmsOrderReceiveInfo pdmsOrderReceiveInfo = (PdmsOrderReceiveInfo) iterator.next();
			BigDecimal longitude = new BigDecimal(Double.valueOf(pdmsOrderReceiveInfo.getReceiveLongitude()));
			BigDecimal latitude = new BigDecimal(Double.valueOf(pdmsOrderReceiveInfo.getReceiveLatitude()));
			laList.add(scaleAndString(latitude,3)+","+scaleAndString(longitude,3));
		}
		
		logger.info(filerList.size());
		//&origins=40.45,116.34|40.54,116.35&destinations=40.34,116.45|40.35,116.46
		//http://api.map.baidu.com/routematrix/v2/driving?output=json&origins=40.45,116.34|40.54,116.35&destinations=40.34,116.45|40.35,116.46&ak=BG3zpwcTFTuWrS4HbweA1SGndAVobszQ
		// 1*50 = 50
		
		laList = laList.stream().distinct().collect(Collectors.toList());
		
		logger.info("-->can use resource :"+laList.size());
		
		List<String> urlTempList = new ArrayList<>();
		
		packageUrlList2(laList, urlTempList);
		
//		requestPerTime(urlTempList);
		
		logger.info("-->total_size :"+urlTempList.size());
		
		//执行并发访问请求。
		submitExecuteTask(urlTempList);
		
		logger.info("------------------------------------------执行完成！！！！");
	}

	/**
	 * 每次请求一条记录，顺序执行
	 */
	private void requestPerTimePrintln(List<String> urlTempList) {
		urlTempList.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				logger.info(t);
				try {
//					String result = JsoupUtils.getHtmlByUrl(t, "UTF-8");
//					logger.info(result);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * 采用顺序取值算法，取满足1*50,2*25,5*10三种情况拼接的url地址集合。
	 * 比如：1*50 类型的，取第一条做源计算地址，第2~51条作为目的地址，计算这50条线路距离，发送给百度api计算。
	 *     然后第52条做源，后推50条做目的地址，拼接url地址。库中待测试数据47595，可做 47595/51 = 933条不重复线路计算
	 * @param srcList
	 * @param desUrltList
	 */
	private void packageUrlList(List<String> srcList, List<String> desUrltList) {
		int execCount = 0;
		while(execCount < EXEC_TIMES_PER_TYPE ){
			for (int i = 0,size = srcList.size(); i < size; i+=51) {
				StringBuffer originStr = new StringBuffer("&origins="); 
				StringBuffer destinationStr = new StringBuffer("&destinations=");
				originStr.append(srcList.get(i));
				for (int j = i+1; j < i+50 && j < size; j++) {
					destinationStr.append(srcList.get(j)+"|");
				}
				
				String afterStr = destinationStr.toString();
				if(afterStr.endsWith("|")){
					afterStr = afterStr.substring(0,afterStr.length()-1);
				}
				desUrltList.add(prefix+""+originStr.toString()+""+afterStr+afterFix);
			}
			
			execCount ++;
		}

		//2*25 = 50
		execCount = 0;
		while(execCount < EXEC_TIMES_PER_TYPE ){
			for (int i = 0,size = srcList.size(); i < size-1; i+=27) {
				StringBuffer originStr = new StringBuffer("&origins="); 
				StringBuffer destinationStr = new StringBuffer("&destinations=");
				originStr.append(srcList.get(i)+"|"+srcList.get(i+1));
				
				for (int j = i+2; j < i+25 && j < size; j++) {
					if(j == size-1){
						destinationStr.append(srcList.get(j));
						break;
					}
					destinationStr.append(srcList.get(j)+"|");
				}
	
				String afterStr = destinationStr.toString();
				if(afterStr.endsWith("|")){
					afterStr = afterStr.substring(0,afterStr.length()-1);
				}
				
				String beforeStr = originStr.toString();
				if(beforeStr.endsWith("|")){
					beforeStr = beforeStr.substring(0,beforeStr.length()-1);
				}
				
//				desUrltList.add(prefix+""+beforeStr+""+afterStr+afterFix);
				originStr = new StringBuffer("&origins=");
				destinationStr = new StringBuffer("&destinations=");
			}
			execCount++;
		}
		//5*10 = 50

		execCount = 0;
		while(execCount < EXEC_TIMES_PER_TYPE ){
			for (int i = 0,size = srcList.size(); i < size-5; i+=15) {
				StringBuffer originStr3 = new StringBuffer("&origins="); 
				StringBuffer destinationStr3 = new StringBuffer("&destinations=");
				originStr3.append(srcList.get(i)+"|"+srcList.get(i+1)+"|"+srcList.get(i+2)+"|"+srcList.get(i+3)+"|"+srcList.get(i+4));
				
				for (int j = i+5; j < i+15 && j < size; j++) {
					if(j == size-1){
						destinationStr3.append(srcList.get(j));
						break;
					}
					destinationStr3.append(srcList.get(j)+"|");
				}
	
				String afterStr = destinationStr3.toString();
				if(afterStr.endsWith("|")){
					afterStr = afterStr.substring(0,afterStr.length()-1);
				}
				
				String beforeStr = originStr3.toString();
				if(beforeStr.endsWith("|")){
					beforeStr = beforeStr.substring(0,beforeStr.length()-1);
				}
				
//				desUrltList.add(prefix+""+beforeStr+""+afterStr+afterFix);
				originStr3 = new StringBuffer("&origins=");
				destinationStr3 = new StringBuffer("&destinations=");
			}
			
			execCount ++;
		}
	}

	private void packageUrlList2(List<String> srcList, List<String> desUrltList){
		int size = srcList.size() > 20000 ? 20000: srcList.size();
		for (int i = 0; i < size; i++) {
			StringBuffer originStr = new StringBuffer("&origins="); 
			StringBuffer destinationStr = new StringBuffer("&destinations=");
			originStr.append(srcList.get(i));
			for (int j = i + 1; j <  i + 51 && j < size; j++) {
				destinationStr.append(srcList.get(j)+"|");
			}
			
			String afterStr = destinationStr.toString();
			if(afterStr.endsWith("|")){
				afterStr = afterStr.substring(0,afterStr.length()-1);
			}
			desUrltList.add(prefix+""+originStr.toString()+""+afterStr+afterFix);
			
		}
	}
	
	/**
	 * 提交执行任务
	 * @param urlTempList
	 */
	private void submitExecuteTask(List<String> urlTempList) {
		long beginTime = System.currentTimeMillis();//纳秒
		Map<String,Integer> countMap = new ConcurrentHashMap<>();
		
		ExecutorService exec = Executors.newFixedThreadPool(worker_count);
		
		urlTempList.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				exec.submit(new RunaableExec(t,countMap));
			}
		});
		
		 exec.shutdown();
		 try {
			exec.awaitTermination(3, TimeUnit.MINUTES);
		 } catch (InterruptedException e) {
			e.printStackTrace();
		 }
		
		int size = urlTempList.size();
		long endtime = System.currentTimeMillis();
		logger.info("-->本次测试发送总请求数:["+size+"] ，其中失败请求数：["+countMap.get("fail")+"],开启线程个数："+worker_count);
		long totalCostTime = endtime - beginTime;
		logger.info("-->首个任务提交 time:["+beginTime+"] 毫秒，最后一个任务完成时间：["+endtime+"] 毫秒。 总耗时：["+totalCostTime+"] 毫秒。");
		
		double oneCostTime = (totalCostTime / size);
		
		logger.info("-->平均单次请求耗时:["+oneCostTime+"] 毫秒！");
	}
	
	final class RunaableExec implements Runnable{

		private String url = null;
		private Map<String,Integer> countMap = null;
		
		public RunaableExec(String url,Map<String,Integer> count){
			this.url = url;
			this.countMap = count;
		}
		
		@Override
		public void run() {
			try {
				String result = JsoupUtils.getHtmlByUrl(url, "UTF-8");
				JSONObject jsonObject = JSON.parseObject(result);
				String status = jsonObject.getString("status");
				String message = jsonObject.getString("message");
				logger.info("返回状态："+status+", 返回消息："+message);
				if(!status.equals("0")){
					if(countMap.get("fail") == null){
						countMap.put("fail", new Integer(1));
					} else {
						Integer total = countMap.get("fail");
						total = total.intValue() + 1;
						countMap.put("fail",total);
					}
					logger.error("---->excute fail:"+countMap.get("fail"));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	/**
	 * 精确小数点后指定位数，并转化成字符串数字
	 * @param bd
	 * @param scale
	 * @return
	 */
	private static String scaleAndString(BigDecimal bd,int scale){
		return bd.setScale(scale,BigDecimal.ROUND_HALF_UP).toString();
	}

}
