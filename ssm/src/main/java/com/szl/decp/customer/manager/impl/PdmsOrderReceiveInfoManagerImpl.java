package com.szl.decp.customer.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.szl.decp.customer.dao.PdmsOrderReceiveInfoDao;
import com.szl.decp.customer.manager.PdmsOrderReceiveInfoManager;
import com.szl.decp.customer.model.PdmsOrderReceiveInfo;

@Component
public class PdmsOrderReceiveInfoManagerImpl implements PdmsOrderReceiveInfoManager{

	@Autowired
    private PdmsOrderReceiveInfoDao pdmsOrderReceiveInfoDao;
	
	@Override
	public List<PdmsOrderReceiveInfo> queryListBeans(PdmsOrderReceiveInfo p) {
		return pdmsOrderReceiveInfoDao.queryList(p);
	}

}
