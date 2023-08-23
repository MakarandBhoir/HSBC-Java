package com.hsbc.dao;

import com.hsbc.exceptions.NoSuchStudentException;
import com.hsbc.model.Student;

public class StudentDaoImpl implements StudentDao {

	private static Student students[] = new Student[10];
	private static int index = -1;
	
	static {
		students[++index] = new Student(1, "Sunidhi", 85);
		students[++index] = new Student(2, "Sakshi G", 85);
		students[++index] = new Student(3, "Sakshi S", 87);
		students[++index] = new Student(4, "Alayaka", 84);
		students[++index] = new Student(5, "Deepali", 86);
	}
	@Override
	public boolean createStudent(Student student) {
		boolean result = false;
		if(index < students.length-1) {
			students[++index] = student;
			result = true;
		}
		return result;
	}

	@Override
	public Student readStudent(int studentId) throws NoSuchStudentException{
		Student result = null;
		for(Student student : students) {
			if(student != null && student.getStudentId() == studentId) {
				result = student;
				return result;
			}
		}
		throw new NoSuchStudentException();
	}

	@Override
	public boolean deleteStudent(int studentId) {
		return false;
	}

	@Override
	public Student updateStudent(int studentId, Student student) {
		// TODO Auto-generated method stub
		return null;
	}

}
