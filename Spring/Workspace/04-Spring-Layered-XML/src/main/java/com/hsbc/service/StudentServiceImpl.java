package com.hsbc.service;

import java.util.List;

import com.hsbc.dao.StudentDao;
import com.hsbc.exceptions.NoSuchStudentException;
import com.hsbc.model.Student;

public class StudentServiceImpl implements StudentService {
	private StudentDao dao;
	
	public StudentServiceImpl() {
		
	}
	public StudentServiceImpl(StudentDao dao) {
		this.dao = dao;
	}
	public void setDao(StudentDao dao) {
		this.dao = dao;
	}
	@Override
	public boolean addStudent(Student student) {
		return dao.createStudent(student);
	}
	@Override
	public Student findStudent(int studentId)throws NoSuchStudentException {
		return dao.readStudent(studentId);
	}
	@Override
	public List<Student> findAllStudents() {
		return dao.readAllStudents();
	}
}
