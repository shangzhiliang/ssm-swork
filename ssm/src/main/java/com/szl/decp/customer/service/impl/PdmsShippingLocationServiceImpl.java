package com.szl.decp.customer.service.impl;

import org.springframework.stereotype.Service;

import com.szl.decp.customer.manager.PdmsShippingLocationManager;
import com.szl.decp.customer.service.PdmsShippingLocationService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;


/**
 * Title: PdmsShippingLocationServiceImpl.java<br>
 * Description: <br>
 * Copyright: Copyright (c) 2017<br>
 * 
 * @author szl
 */
@Service
public class PdmsShippingLocationServiceImpl implements PdmsShippingLocationService{
    
    @Autowired
    private PdmsShippingLocationManager pdmsShippingLocationManager;

}
