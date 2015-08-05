package com.lxp.service.impl;

import com.lxp.service.UserService;

/**
 * @Package com.lxp.service.impl
 * @Class com.lxp.service.impl.UserServiceImpl
 * @Description: TODO
 * @Author LiXiaoPeng
 * @Date 2015年8月5日 下午2:16:54
 * @Version V1.0
 * Copyright  Corporation 2015
 */
public class UserServiceImpl implements UserService {

	@Override
	public void save(String name) {
		System.out.println("保存"+name);
	}

	@Override
	public void update(String name) {
		System.out.println("更新"+name);
	}

}
