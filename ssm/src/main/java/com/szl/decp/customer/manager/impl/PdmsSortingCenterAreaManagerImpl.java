package com.szl.decp.customer.manager.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.szl.decp.customer.dao.PdmsSortingCenterAreaDao;
import com.szl.decp.customer.manager.PdmsSortingCenterAreaManager;
import com.szl.decp.customer.model.PdmsSortingCenterArea;


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
public class PdmsSortingCenterAreaManagerImpl  implements PdmsSortingCenterAreaManager{
	@SuppressWarnings("unused")
	private Logger logger = Logger.getLogger(PdmsSortingCenterAreaManagerImpl.class);
    @Autowired
    private PdmsSortingCenterAreaDao pdmsSortingCenterAreaDao;
	@Override
	public int selectByPrimaryKey(PdmsSortingCenterArea t) {
		return pdmsSortingCenterAreaDao.selectByPrimaryKey(t);
	}
	@Override
	public long count(PdmsSortingCenterArea p) {
		return pdmsSortingCenterAreaDao.count(p);
	}
	@Override
	public List<PdmsSortingCenterArea> selectByColumn(PdmsSortingCenterArea p) {
		return pdmsSortingCenterAreaDao.selectByColumn(p);
	}
	@Override
	public List<PdmsSortingCenterArea> queryList(PdmsSortingCenterArea p) {
		return pdmsSortingCenterAreaDao.queryList(p);
	}


}
