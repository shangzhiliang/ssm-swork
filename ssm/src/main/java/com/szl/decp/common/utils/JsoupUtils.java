package com.szl.decp.common.utils;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.Connection.Method;

public class JsoupUtils {

	/**
	 * 重试次数
	 */
	private static final int RETRY_COUNT = 1;
	
	/**
	 * 根据指定url获取返回html源码
	 * @param url
	 * @return
	 * @throws IOException
	 */
	public static String getHtmlByUrl(String url,String charsetName) throws IOException{
		//重试三次
		int retry = 0;
		
		while(retry < RETRY_COUNT){
			try {
				 Connection.Response response = Jsoup
							.connect(url)
							.header("User-Agent",
								"Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.85 Safari/537.36")
							.method(Method.GET)
							.execute();
				 if(response.statusCode() == 200){
					return new String(response.bodyAsBytes(),charsetName);
				 } else {
					 break;
				 }
			} catch (Exception e){
				retry = retry + 1;
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
				}
			}
		}
		return null;
	}
	
	/**
	 * 测试入口
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		String str = getHtmlByUrl("http://api.map.baidu.com/routematrix/v2/driving?output=json&origins=40.45,116.34|40.54,116.35&destinations=40.34,116.45|40.35,116.46&ak=BG3zpwcTFTuWrS4HbweA1SGndAVobszQ","UTF-8");
		System.out.println(str);
	}
}
