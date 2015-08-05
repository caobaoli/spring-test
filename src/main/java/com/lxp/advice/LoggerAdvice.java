package com.lxp.advice;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.apache.log4j.Logger;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * @Package com.lxp.advice
 * @Class com.lxp.advice.LoggerAdvice
 * @Description: TODO
 * @Author LiXiaoPeng
 * @Date 2015年8月5日 下午2:20:20
 * @Version V1.0
 * Copyright  Corporation 2015
 */
public class LoggerAdvice implements MethodBeforeAdvice {
	private Logger log = Logger.getLogger(LoggerAdvice.class);

	@Override
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		log.info("method:"+method.getName());
		log.info("args:"+Arrays.toString(args));
		log.info("target:"+target.getClass().getName());
		log.info("方法"+method.getName()+"调用之前");
	}
	
}
