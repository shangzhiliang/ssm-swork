package com.szl.decp.customer.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.szl.decp.customer.manager.PdmsShippingLineManager;
import com.szl.decp.customer.manager.PdmsShippingLocationManager;
import com.szl.decp.customer.manager.PdmsSortingCenterAreaManager;
import com.szl.decp.customer.model.PdmsSortingCenterArea;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class PdmsShippingLocationServiceImplTest {
	private static final Logger logger = Logger.getLogger(PdmsShippingLocationServiceImplTest.class);
	@Autowired
	private PdmsSortingCenterAreaManager pdmsSortingCenterAreaManager;
	
	@Autowired
	private PdmsShippingLineManager pdmsShippingLineManager;
	
	@Autowired
	private PdmsShippingLocationManager pdmsShippingLocationManager;
	
	private final String inser_line_prefix = "INSERT INTO `pdms_shipping_line` "
			+ "(id,sys_code,code,show_code,sorting_center_area_show_code,"
			+ "sorting_center_id,region_code,sorting_center_area_id,"
			+ "loc_num,c_t,creater,u_t,updater) VALUES (";
	
	private final String insert_area_prefix = "INSERT INTO `pdms_sorting_center_area` "
			+ "(`sys_code`, `code`, `show_code`, `region_code`, `name`, `type`, `is_throw_line`,"
			+ " `temperature_layer`, `sorting_center_id`, `status`, `creater`, `c_t`, `updater`, `u_t`) VALUES";
	
	@Test
	public void testCenterArea(){
		Map<Integer,Integer> warehouseMap =  werehouseMap();
		Map<String,String> areaTypeMap = areaTypeMap();
		
		Iterator<Integer> iterHouse = warehouseMap.keySet().iterator();
		StringBuffer sbf = new StringBuffer();
/*		while(iterHouse.hasNext()){
			for (int i = 0,size = areaTypes.size(); i < size; i++) {
				String areaType = areaTypes.get(i);
				String code = areaType.substring(1);
				sbf.append("("+code+",");
				sbf.append(areaType+",");
				sbf.append(areaType+",");
			}
		}*/
	}
	
	@Test
	public void test() {
		PdmsSortingCenterArea psca = new PdmsSortingCenterArea();
		List<PdmsSortingCenterArea> areaList = pdmsSortingCenterAreaManager.queryList(psca);
		List<String> shippingLineInsertSqlList = new ArrayList<String>();
		List<String> areaTypes = new ArrayList<String>();
		areaTypes.add("FA");
		areaTypes.add("FB");
		areaTypes.add("FC");
		areaTypes.add("FD");
		areaTypes.add("FH");
		
		for (int i = 0,size = areaList.size(); i < size; i++) {
			
		}
		
		areaList.forEach(new Consumer<PdmsSortingCenterArea>() {
			@Override
			public void accept(PdmsSortingCenterArea t) {
				
				areaTypes.forEach( new Consumer<String>() {

					@Override
					public void accept(String t) {
						for (int i = 0; i < 500; i++) {
							
						}
					}
				});
				
			}	
		});
		
		logger.info("-------->");
	}
	
	private static Map<String,String> areaTypeMap(){
		Map<String,String> houseMap = new HashMap<String,String>();
		houseMap.put("FA", "蔬菜发货区");
		houseMap.put("FB", "标品发货区");
		houseMap.put("FC", "肉禽发货区");
		houseMap.put("FD", "蔬菜投线区");
		houseMap.put("FH", "站点发货区");
		return houseMap;
	}
	
	private static Map<Integer,Integer> werehouseMap(){
		Map<Integer,Integer> houseMap = new HashMap<Integer,Integer>();
		houseMap.put(1, 1);//北京1仓
		houseMap.put(2, 2);//北京2仓
		houseMap.put(3, 3);//上海1仓
		houseMap.put(4, 4);//成都1仓
		houseMap.put(5, 5);//天津1仓
		houseMap.put(6, 6);//广州1仓
		houseMap.put(7, 7);//重庆1仓
		houseMap.put(8, 8);//长沙1仓
		houseMap.put(9, 9);//杭州1仓
		houseMap.put(10, 10);//武汉1仓
		houseMap.put(11, 11);//深圳1仓
		houseMap.put(13, 13);//苏州1仓
		houseMap.put(14, 14);//郑州1仓
		houseMap.put(15, 15);//无锡1仓
		houseMap.put(16, 16);//西安1仓
		houseMap.put(17, 17);//合肥1仓
		houseMap.put(18, 18);//南京1仓
		houseMap.put(25, 25);//济南1仓
		houseMap.put(29, 29);//北京3仓
		
		houseMap.put(30, 30);//南京2仓
		houseMap.put(31, 31);//常州1仓
		houseMap.put(32, 32);//青岛1仓
		houseMap.put(33, 33);//温州1仓
		houseMap.put(35, 35);//杭州2仓
		houseMap.put(36, 36);//北京4仓
		houseMap.put(37, 37);//上海2仓
		houseMap.put(38, 38);//东莞1仓
		houseMap.put(39, 39);//武汉1仓
		
		houseMap.put(41, 41);//上海3仓
		houseMap.put(42, 42);//南京3仓
		houseMap.put(43, 43);//深圳2仓
		houseMap.put(44, 44);//武汉3仓
		houseMap.put(45, 45);//北京5仓
		return houseMap;
	}

}
