package com.hsbc.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.hsbc.exceptions.NoSuchStudentException;
import com.hsbc.model.Student;

@Repository("dao1")
public class StudentDaoImpl implements StudentDao {
	private static List<Student> studentDB = null;
	
	static {
		studentDB = new ArrayList<>();
	}
	
	@Override
	public boolean createStudent(Student student) {
		return studentDB.add(student);
	}
	@Override
	public Student readStudent(int studentId) throws NoSuchStudentException {
		for(Student student : studentDB) {
			if(student != null && studentId == student.getStudentId()) {
				return student;
			}
		}
		throw new NoSuchStudentException();
	}
	@Override
	public boolean deleteStudent(int studentId) {
		Iterator<Student> itr = studentDB.iterator();
		Student result = null;
		while(itr.hasNext()) {
			Student student = itr.next();
			if(student != null && student.getStudentId() == studentId) {
				result = student;
				break;
			}
		}
		return studentDB.remove(result);
	}
	@Override
	public Student updateStudent(int studentId, Student student) {
		
		return null;
	}
	@Override
	public List<Student> readAllStudents() {
		return studentDB;
	}

}
