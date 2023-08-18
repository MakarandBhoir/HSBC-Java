package com.hsbc.service;

import com.hsbc.Student;

public class StudentService {
	public static Student[] findStudentByCourse(String course, Student[] students) {
		Student []result = new Student[students.length];
		int index = 0;
		for(Student student : students) {
			if(course.equalsIgnoreCase(student.getCourseName())) {
				result[index] = student;
				index++;
			}
		}
		return result;
	}
}
