package com.szl.decp.dubbo.service.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:dubbo/provider.xml"})  
public class DemoServiceImplTest {

	@Test
	public void testSayHello() {
		fail("Not yet implemented");
	}

}
