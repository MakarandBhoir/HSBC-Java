package com.hsbc.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hsbc.model.Student;

public class Main {
	public static void main(String[] args) {
		//ApplicationContext context = new FileSystemXmlApplicationContext();
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		Student student = context.getBean("student", Student.class);
		
		System.out.println(student);
		System.out.println(student.getDept());
	}
}
