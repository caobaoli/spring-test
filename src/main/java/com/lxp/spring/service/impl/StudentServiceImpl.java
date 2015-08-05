package com.lxp.spring.service.impl;

import com.lxp.spring.dao.StudentDao;
import com.lxp.spring.service.StudentService;
import com.lxp.spring.vo.Student;

/**
 * @Package com.lxp.spring.service.impl
 * @Class com.lxp.spring.service.impl.StudentServiceImpl
 * @Description: TODO
 * @Author LiXiaoPeng
 * @Date 2015年8月6日 上午12:09:33
 * @Version V1.0
 * Copyright  Corporation 2015
 */
public class StudentServiceImpl implements StudentService {

	private StudentDao studentDao;
	
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}


	@Override
	public void save(Student student) {
		studentDao.save(student);
		//查询一个数据库里面根本不存在的值
		Student tempStudent = studentDao.findById(200);
		studentDao.delete(tempStudent.getStuID());
	}

}
