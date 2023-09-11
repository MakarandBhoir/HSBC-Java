package com.hsbc.ui;

import java.util.List;
import java.util.Scanner;

import com.hsbc.dao.StudentDao;
import com.hsbc.factory.StudentDaoFactory;
import com.hsbc.model.Student;
import com.hsbc.service.StudentServiceImpl;

public class StudentApplication {
	public static void main(String[] args) {
		StudentServiceImpl service = new StudentServiceImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Where do you want to save your data: ");
		System.out.println("1. Array List");
		System.out.println("2. Hash Set");
		System.out.println("Enter your choice: ");
		int ch = sc.nextInt();
		
		StudentDao dao = StudentDaoFactory.createStudentDao(ch);
		
		//StudentDao dao = new StudentDaoImpl();
		service.setDao(dao); // setup dependency
		
		Student student4 = new Student(4, "Test", 40);
		service.addStudent(student4);
		List<Student> list = service.findAllStudents();
		
		for(Student student : list) {
			System.out.println(student);
		}
		
//		HashSet<Student> set = new HashSet<>(list);
	}
}







