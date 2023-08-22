package com.hsbc.ui;

import com.hsbc.dao.StudentDao;
import com.hsbc.dao.StudentDaoImpl;
import com.hsbc.model.Student;
import com.hsbc.service.StudentServiceImpl;

public class StudentApplication {
	public static void main(String[] args) {
		StudentServiceImpl service = new StudentServiceImpl();
		StudentDao dao = new StudentDaoImpl();
		
		service.setDao(dao); // setup dependency
		
		Student student = new Student(6, "Aditya", 82);
		service.addStudent(student);
		
		
		Student result =  service.findStudent(3);
		if(result != null) {
			System.out.println(result);
		}else {
			System.out.println("Student Not Found!");
		}
	}
}
