package com.szl.decp.customer.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.szl.decp.customer.dao.impl.UserDaoImpl;
import com.szl.decp.customer.model.User;
import com.szl.decp.customer.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService{

	@Resource(name = "userDaoImpl")
    private UserDaoImpl userDaoImpl; 
	
	@Override
	public User getUserById(int userId) {
		return null;//this.userDaoImpl.selectByPrimaryKey(userId);
	}

}
