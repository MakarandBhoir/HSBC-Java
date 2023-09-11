package com.hsbc.ui;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hsbc.model.Student;
import com.hsbc.service.StudentService;

public class StudentApplication2 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Student student = context.getBean(Student.class);
		student.setStudentId(100);
		student.setStudentName("Deepali");
		student.setStudentScore(92);

		StudentService service = context.getBean(StudentService.class);

		service.addStudent(student);
		List<Student> students = service.findAllStudents();

		students.stream().forEach(System.out::println);
	}
}







