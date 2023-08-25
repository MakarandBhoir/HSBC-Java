package com.hsbc.service;

import com.hsbc.exceptions.NoSuchStudentException;
import com.hsbc.model.Student;

public interface StudentService {
	public boolean addStudent(Student student);
	public Student findStudent(int studentId)throws NoSuchStudentException;
}
