package com.hsbc.service;

import java.util.List;

import com.hsbc.model.Student;

public interface StudentService {
	public List<Student> findAllStudents();
	public Student findStudentById(Integer studentId);
}
