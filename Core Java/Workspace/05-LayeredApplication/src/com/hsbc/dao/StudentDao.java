package com.hsbc.dao;

import com.hsbc.model.Student;

public interface StudentDao {
	public boolean createStudent(Student student);
	public Student readStudent(int studentId);
	public boolean deleteStudent(int studentId);
	public Student updateStudent(int studentId, Student student);
}

//C - Create
//R - Read
//U - Update
//D - Delete