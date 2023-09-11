package com.hsbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.RowMapper;

import com.hsbc.model.Student;

public class StudentRowMapper implements RowMapper<Student> {
//	@Autowired
//	ApplicationContext context;
	
	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		
		student.setStudentId(rs.getInt("Student_Id"));
		student.setStudentName(rs.getString("Student_Name"));
		student.setStudentScore(rs.getDouble("Student_Score"));
		
		return student;
	}

}
