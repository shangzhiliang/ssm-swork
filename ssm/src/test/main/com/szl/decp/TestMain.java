package com.szl.decp;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.szl.decp.common.utils.JsoupUtils;

public class TestMain {
	private static final Logger logger = Logger.getLogger(TestMain.class);
	
	public static void main(String[] args) {
		try {
			String url = "http://api.map.baidu.com/routematrix/v2/driving?output=json&origins=39.85,116.33&destinations=40.09,116.60&ak=BG3zpwcTFTuWrS4HbweA1SGndAVobszQ";
			String result = JsoupUtils.getHtmlByUrl(url, "UTF-8");
			logger.info(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
