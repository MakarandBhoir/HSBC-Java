package com.hsbc.ui;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.hsbc.model.Student;
import com.hsbc.service.StudentService;

@SpringBootApplication
@ComponentScan({"com.hsbc"})
public class StudentApplication2 {
	public static void main(String[] args) {
		ApplicationContext context = 
				SpringApplication.run(StudentApplication2.class, args);

		Student student1 = context.getBean(Student.class);
		Student student2 = context.getBean(Student.class);
		
		StudentService service = context.getBean(StudentService.class);
		
		student1.setStudentId(100);
		student1.setStudentName("Deepali");
		student1.setStudentScore(92);

		student2.setStudentId(102);
		student2.setStudentName("Charoo");
		student2.setStudentScore(92);
		

//		service.addStudent(student1);
//		service.addStudent(student2);
		
		System.out.println("Student added in database.");
		
		List<Student> students = service.findAllStudents();
		students.stream().forEach(System.out::println);
	}
}







