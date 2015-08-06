package com.lxp.spring.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.lxp.spring.dao.BaseDao;
import com.lxp.spring.dao.StudentDao;
import com.lxp.spring.vo.Student;

/**
 * @Package com.lxp.spring.dao.impl
 * @Class com.lxp.spring.dao.impl.StudentDaoImpl
 * @Description: TODO
 * @Author LiXiaoPeng
 * @Date 2015年8月5日 下午11:53:43
 * @Version V1.0
 * Copyright  Corporation 2015
 */
@Repository(value="stuDao")
public class StudentDaoImpl extends BaseDao implements StudentDao, RowMapper<Student> {

	@Override
	public void save(Student student) {
		String sql = "INSERT INTO STUDENT(STUNAME, STUAGE) VALUES(?, ?)";
		super.getJdbcTemplate().update(sql, new Object[]{student.getStuName(), student.getStuAge()});
	}

	@Override
	public Student findById(int id) {
		String sql = "SELECT STUID, STUNAME, STUAGE FROM STUDENT WHERE STUID = ?";
		return (Student) this.getJdbcTemplate().query(sql, new Object[]{id}, this);
	}

	@Override
	public void delete(int id) {
		String sql = "DELETE FROM STUDENT WHERE STUID = ?";
		super.getJdbcTemplate().update(sql, new Object[]{id});
	}

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setStuID(rs.getInt("STUID"));
		student.setStuName(rs.getString("STUNAME"));
		student.setStuAge(rs.getInt("STUAGE"));
		return student;
	}

}
