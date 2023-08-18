package com.hsbc.client;

import com.hsbc.Student;
import com.hsbc.service.StudentService;

public class StudentApplication {
	public static void main(String[] args) {
		Student student1 = new Student(1, "Hitha", "9876543210", "Java", 18000);
		Student student2 = new Student(2, "Arsh", "9876543212", "Python", 20000);
		Student student3 = new Student(3, "Urvi", "9876543213", "C++", 15000);
		Student student4 = new Student(4, "Aman", "9876543214", "Java", 18000);
		Student student5 = new Student(5, "Aashima", "9876543215", "ML", 25000);
		
		Student students[] = new Student[5];
		
		students[0] = student1;
		students[1] = student2;
		students[2] = student3;
		students[3] = student4;
		students[4] = student5;
		
		Student []result = StudentService.findStudentByCourse("c++", students);
		for(Student student : result) {
			if(student != null)
				student.displayStudent();
		}
	}
}





