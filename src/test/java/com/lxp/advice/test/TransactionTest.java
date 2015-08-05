package com.lxp.advice.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lxp.spring.service.StudentService;
import com.lxp.spring.vo.Student;

/**
 * @Package com.lxp.advice.test
 * @Class com.lxp.advice.test.TransactionTest
 * @Description: TODO
 * @Author LiXiaoPeng
 * @Date 2015年8月6日 上午12:21:23
 * @Version V1.0
 * Copyright  Corporation 2015
 */
public class TransactionTest {
	private StudentService studentService;
	
	@Before
	public void setUp() throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		studentService = ctx.getBean("stuService", StudentService.class);
	}

	@After
	public void tearDown() throws Exception {
		studentService = null;
	}

	@Test
	public void test() {
		Student student = new Student();
		student.setStuName("并没有");
		student.setStuAge(23);
		studentService.save(student);
	}

}
