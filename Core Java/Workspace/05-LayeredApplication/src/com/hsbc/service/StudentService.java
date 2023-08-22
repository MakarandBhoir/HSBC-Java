package com.hsbc.service;

import com.hsbc.model.Student;

public interface StudentService {
	public boolean addStudent(Student student);
	public Student findStudent(int studentId);
}
