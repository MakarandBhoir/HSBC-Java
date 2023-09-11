package com.hsbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.hsbc.model.Student;

@SpringBootApplication
// @ComponentScan
// @Configuration
// @EnableAutoConfiguration
public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MainApp.class, args);
		String beanNames[] = context.getBeanDefinitionNames();
		System.out.println("================================================");
		for(String bean : beanNames) {
			System.out.println(bean);
		}
	}
	
	@Bean
	public Student getBean() {
		Student student = new Student();
		return student;
	}
}


