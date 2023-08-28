package com.hsbc.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.hsbc.exceptions.NoSuchStudentException;
import com.hsbc.model.Student;

public class StudentDaoImpl2 implements StudentDao {
	private static Set<Student> studentDB = null;
	
	static {
		studentDB = new HashSet<>();
		studentDB.add(new Student(1, "Charoo2", 82));
		studentDB.add(new Student(2, "Deepali2", 81));
		studentDB.add(new Student(3, "Anwesha2", 80));
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




