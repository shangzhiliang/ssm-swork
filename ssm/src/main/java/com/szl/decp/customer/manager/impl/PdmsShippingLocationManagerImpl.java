package com.szl.decp.customer.manager.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.szl.decp.customer.dao.PdmsShippingLocationDao;
import com.szl.decp.customer.manager.PdmsShippingLocationManager;
import com.szl.decp.customer.model.PdmsShippingLocation;


/**
 * Title: <br>
 * Description: <br>
 * Copyright: Copyright (c) 2016<br>
 * Company: 北京云杉世界信息技术有限公司<br>
 * 
 * @codeGenerator meicai.v20
 * @author szl
 * @date 2016-9
 */
@Component
public class PdmsShippingLocationManagerImpl implements PdmsShippingLocationManager{
	@SuppressWarnings("unused")
	private Logger logger = Logger.getLogger(PdmsShippingLocationManagerImpl.class);
    @Autowired
    private PdmsShippingLocationDao pdmsShippingLocationDao;
	@Override
	public int selectByPrimaryKey(PdmsShippingLocation t) {
		return pdmsShippingLocationDao.selectByPrimaryKey(t);
	}
	@Override
	public long count(PdmsShippingLocation p) {
		return pdmsShippingLocationDao.count(p);
	}
	@Override
	public List<PdmsShippingLocation> selectByColumn(PdmsShippingLocation p) {
		return pdmsShippingLocationDao.selectByColumn(p);
	}
	@Override
	public List<PdmsShippingLocation> queryList(PdmsShippingLocation p) {
		return pdmsShippingLocationDao.queryList(p);
	}


    
}
