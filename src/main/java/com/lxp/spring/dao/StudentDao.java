package com.lxp.spring.dao;

import com.lxp.spring.vo.Student;

/**
 * @Package com.lxp.spring.dao
 * @Class com.lxp.spring.dao.StudentDao
 * @Description: TODO
 * @Author LiXiaoPeng
 * @Date 2015年8月5日 下午11:48:16
 * @Version V1.0
 * Copyright  Corporation 2015
 */
public interface StudentDao {
	public void save(Student student);
	public Student findById(int id);
	public void delete(int id);
}
