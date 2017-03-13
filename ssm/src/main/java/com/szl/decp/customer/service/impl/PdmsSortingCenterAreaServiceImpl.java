package com.szl.decp.customer.service.impl;

import org.springframework.stereotype.Service;

import com.szl.decp.customer.manager.PdmsSortingCenterAreaManager;
import com.szl.decp.customer.service.PdmsSortingCenterAreaService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;

/**
 * Title: PdmsSortingCenterAreaServiceImpl.java<br>
 * Description: <br>
 * Copyright: Copyright (c) 2017<br>
 * 
 * @author szl
 */
@Service
public class PdmsSortingCenterAreaServiceImpl implements PdmsSortingCenterAreaService{
    
    @Autowired
    private PdmsSortingCenterAreaManager pdmsSortingCenterAreaManager;

}
