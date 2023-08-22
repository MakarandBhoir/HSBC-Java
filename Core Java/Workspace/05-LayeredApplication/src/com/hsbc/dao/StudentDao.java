package com.hsbc.dao;

import com.hsbc.model.Student;

public interface StudentDao {
	public boolean createStudent(Student student);
	public Student readStudent(int studentId);
}

//C - Create
//R - Read
//U - Update
//D - Delete