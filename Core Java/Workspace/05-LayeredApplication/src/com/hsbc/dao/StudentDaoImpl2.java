package com.hsbc.dao;

import com.hsbc.model.Student;

public class StudentDaoImpl2 implements StudentDao {

	private static Student students[] = new Student[10];
	private static int index = -1;
	
	static {
		students[++index] = new Student(1, "Sunidhi2", 85);
		students[++index] = new Student(2, "Sakshi2 G", 85);
		students[++index] = new Student(3, "Sakshi2 S", 87);
		students[++index] = new Student(4, "Alayaka2", 84);
		students[++index] = new Student(5, "Deepali2", 86);
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
	public Student readStudent(int studentId) {
		Student result = null;
		for(Student student : students) {
			if(student != null && student.getStudentId() == studentId) {
				result = student;
				break;
			}
		}
		return result;
	}

}
