package com.lxp.advice.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lxp.service.UserService;
import com.lxp.service.impl.UserServiceImpl;

/**
 * @Package com.lxp.advice.test
 * @Class com.lxp.advice.test.TestAdvice
 * @Description: TODO
 * @Author LiXiaoPeng
 * @Date 2015年8月5日 下午2:56:31
 * @Version V1.0
 * Copyright  Corporation 2015
 */
public class TestAdvice {
	
	private UserService userService;
	
	@Before
	public void setUp() throws Exception {
		userService = new UserServiceImpl();
	}

	@After
	public void tearDown() throws Exception {
		userService = null;
	}

	@Test
	public void test() {
		userService.save("张三");
	}

}
