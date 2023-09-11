package com.hsbc.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hsbc.config.AppConfig;
import com.hsbc.model.Student;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Student student = context.getBean("student", Student.class);
		Student student2 = context.getBean("student", Student.class);
		
		System.out.println(student);
		System.out.println(student.getDept());
	}
}
