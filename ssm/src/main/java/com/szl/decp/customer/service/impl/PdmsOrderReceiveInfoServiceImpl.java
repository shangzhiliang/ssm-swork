package com.szl.decp.customer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.szl.decp.customer.manager.PdmsOrderReceiveInfoManager;
import com.szl.decp.customer.model.PdmsOrderReceiveInfo;
import com.szl.decp.customer.service.PdmsOrderReceiveInfoService;

@Component
public class PdmsOrderReceiveInfoServiceImpl implements PdmsOrderReceiveInfoService{

	@Autowired
    private PdmsOrderReceiveInfoManager pdmsOrderReceiveInfoManager;

	@Override
	public List<PdmsOrderReceiveInfo> queryListBeans(PdmsOrderReceiveInfo p) {
		return pdmsOrderReceiveInfoManager.queryListBeans(p);
	}
	
}
