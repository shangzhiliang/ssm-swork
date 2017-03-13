package com.szl.decp.customer.manager.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.szl.decp.customer.dao.PdmsShippingLineDao;
import com.szl.decp.customer.manager.PdmsShippingLineManager;
import com.szl.decp.customer.model.PdmsShippingLine;

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
public class PdmsShippingLineManagerImpl implements PdmsShippingLineManager{
	@SuppressWarnings("unused")
	private Logger logger = Logger.getLogger(PdmsShippingLineManagerImpl.class);
    @Autowired
    private PdmsShippingLineDao pdmsShippingLineDao;
	@Override
	public int selectByPrimaryKey(PdmsShippingLine t) {
		return pdmsShippingLineDao.selectByPrimaryKey(t);
	}
	@Override
	public long count(PdmsShippingLine p) {
		return pdmsShippingLineDao.count(p);
	}
	@Override
	public List<PdmsShippingLine> selectByColumn(PdmsShippingLine p) {
		return pdmsShippingLineDao.selectByColumn(p);
	}
	@Override
	public List<PdmsShippingLine> queryList(PdmsShippingLine p) {
		return pdmsShippingLineDao.queryList(p);
	}


}
