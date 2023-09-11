package com.hsbc.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.hsbc.exceptions.NoSuchStudentException;
import com.hsbc.model.Student;

@Repository("dao2")
public class StudentDaoImpl2 implements StudentDao {
	private static Set<Student> studentDB = null;
	
	static {
		studentDB = new HashSet<>();
	}
	@Override
	public boolean createStudent(Student student) {
		return studentDB.add(student);
	}
	@Override
	public Student readStudent(int studentId) throws NoSuchStudentException {
		return null;
	}
	@Override
	public boolean deleteStudent(int studentId) {
		return false;
	}
	@Override
	public Student updateStudent(int studentId, Student student) {
		return null;
	}
	@Override
	public List<Student> readAllStudents() {
		List<Student> list = new ArrayList<>(studentDB);
		return list;
	}
}




