package com.szl.decp.customer.service.impl;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.szl.decp.customer.model.User;
import com.szl.decp.customer.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
public class UserServiceImplTest {

//	private ApplicationContext ac = null;  
	
	@Before  
  public void before() {  
//      ac = new ClassPathXmlApplicationContext("applicationContext.xml");  
//      userService = (IUserService) ac.getBean("userService");  
  }  
	@Resource
	private IUserService userService;
	
	@Test
	public void test() {
		User user = userService.getUserById(1);
		
		System.out.println(user.getUserName());
	}

}
