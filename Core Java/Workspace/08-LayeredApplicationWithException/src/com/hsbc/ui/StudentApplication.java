package com.hsbc.ui;

import java.util.Scanner;

import com.hsbc.dao.StudentDao;
import com.hsbc.dao.StudentDaoImpl;
import com.hsbc.exceptions.NoSuchStudentException;
import com.hsbc.factory.StudentDaoFactory;
import com.hsbc.model.Student;
import com.hsbc.service.StudentServiceImpl;

public class StudentApplication {
	public static void main(String[] args) {
		StudentServiceImpl service = new StudentServiceImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Where do you want to save your data: ");
		System.out.println("1. Array");
		System.out.println("2. Database");
		System.out.println("Enter your choice: ");
		int ch = sc.nextInt();
		
		StudentDao dao = StudentDaoFactory.createStudentDao(ch);
		
		//StudentDao dao = new StudentDaoImpl();
		service.setDao(dao); // setup dependency
		
		try {
			Student result =  service.findStudent(1);
			System.out.println(result);
		}
		catch(NoSuchStudentException ex) {
			System.out.println("No such student avaiable!");
		}
	}
}
