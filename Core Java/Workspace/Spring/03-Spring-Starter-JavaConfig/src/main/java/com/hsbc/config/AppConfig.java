package com.hsbc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.hsbc.model.Student;

@Configuration
public class AppConfig {
	
	@Bean(name = "student")
	@Scope(scopeName = "prototype")
	public Student getStudent() {
		Student student = new Student();
		return student;
	}
	
}
