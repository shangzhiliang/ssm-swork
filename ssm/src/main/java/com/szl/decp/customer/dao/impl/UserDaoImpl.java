package com.szl.decp.customer.dao.impl;

import org.springframework.stereotype.Service;

import com.szl.decp.common.dao.AbstractMybatisDao;

@Service("userDaoImpl")
public class UserDaoImpl extends AbstractMybatisDao {

    protected static final String NAMESPACE = "customer";

    public String getIbatisMapperNamesapce() {
        return NAMESPACE;
    }
	
}
