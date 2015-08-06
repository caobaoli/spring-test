package com.lxp.advice.test;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class TransactionTest {
	@Resource(name="stuService")
	private StudentService studentService;
	

	@Test
	public void test() {
		Student student = new Student();
		student.setStuName("关羽");
		student.setStuAge(23);
		studentService.save(student);
	}

}
