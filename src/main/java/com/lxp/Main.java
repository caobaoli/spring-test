package com.lxp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lxp.service.UserService;

/**
 * @Package com.lxp
 * @Class com.lxp.Main
 * @Description: TODO
 * @Author LiXiaoPeng
 * @Date 2015年8月5日 下午3:06:39
 * @Version V1.0
 * Copyright  Corporation 2015
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		UserService userService=ctx.getBean("userService",UserService.class);
		
		userService.save("张三");
		
		userService.update("李四");
		
	}

}
