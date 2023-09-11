package com.hsbc.dao;

import java.util.List;

import com.hsbc.exceptions.NoSuchStudentException;
import com.hsbc.model.Student;

public interface StudentDao {
	public boolean createStudent(Student student);
	public Student readStudent(int studentId)throws NoSuchStudentException;
	public boolean deleteStudent(int studentId);
	public Student updateStudent(int studentId, Student student);
	public List<Student> readAllStudents();
}

//C - Create
//R - Read
//U - Update
//D - Delete