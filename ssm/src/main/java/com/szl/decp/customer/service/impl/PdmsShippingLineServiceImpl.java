package com.szl.decp.customer.service.impl;

import org.springframework.stereotype.Service;

import com.szl.decp.customer.manager.PdmsShippingLineManager;
import com.szl.decp.customer.service.PdmsShippingLineService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;


/**
 * Title: PdmsShippingLineServiceImpl.java<br>
 * Description: <br>
 * Copyright: Copyright (c) 2017<br>
 * 
 * @author szl
 */
@Service
public class PdmsShippingLineServiceImpl  implements PdmsShippingLineService{
    
    @Autowired
    private PdmsShippingLineManager pdmsShippingLineManager;


}
