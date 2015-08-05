package com.lxp.spring.vo;

import java.io.Serializable;

/**
 * @Package com.lxp.spring.vo
 * @Class com.lxp.spring.vo.Student
 * @Description: TODO
 * @Author LiXiaoPeng
 * @Date 2015年8月5日 下午11:49:14
 * @Version V1.0
 * Copyright  Corporation 2015
 */
public class Student implements Serializable {

	private Integer stuID;
	private String stuName;
	private Integer stuAge;
	public Integer getStuID() {
		return stuID;
	}
	public void setStuID(Integer stuID) {
		this.stuID = stuID;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public Integer getStuAge() {
		return stuAge;
	}
	public void setStuAge(Integer stuAge) {
		this.stuAge = stuAge;
	}
	
}
