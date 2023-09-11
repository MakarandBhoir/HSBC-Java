package com.hsbc.service;

import java.util.List;

import com.hsbc.exceptions.NoSuchStudentException;
import com.hsbc.model.Student;

public interface StudentService {
	public boolean addStudent(Student student);
	public Student findStudent(int studentId)throws NoSuchStudentException;
	public List<Student> findAllStudents();
}
