package com.lxp.spring.dao;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * @Package com.lxp.spring.dao
 * @Class com.lxp.spring.dao.BaseDao
 * @Description: TODO
 * @Author LiXiaoPeng
 * @Date 2015年8月5日 下午11:45:07
 * @Version V1.0
 * Copyright  Corporation 2015
 */
public class BaseDao extends JdbcDaoSupport {
	@Resource(name="dataSource")
	public void setMySqlDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	};
}
