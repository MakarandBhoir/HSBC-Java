package com.hsbc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.hsbc.model.Student;
@Service
@Scope(scopeName="singleton")
public class StudentServiceImpl implements StudentService {
	private List<Student> dummyDatabase = new ArrayList<>();
	
	public StudentServiceImpl() {
		dummyDatabase.add(new Student(101, "Urvi", 85));
		dummyDatabase.add(new Student(102, "Arsh", 88));
		dummyDatabase.add(new Student(103, "Shrusti", 88));
	}
	
	@Override
	public List<Student> findAllStudents() {
		return dummyDatabase;
	}

	@Override
	public Student findStudentById(Integer studentId) {
		//Student student = dummyDatabase.stream().filter(s -> s.getStudentId() == studentId).findFirst().orElseThrow();
		Student student = dummyDatabase.stream().filter(s -> s.getStudentId() == studentId).findFirst().orElse(null);
		return student;
	}

}






