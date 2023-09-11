package com.hsbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.hsbc.service.StudentService;

@SpringBootApplication
//@EnableAspectJAutoProxy
// @ComponentScan
// @Configuration
// @EnableAutoConfiguration
public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(MainApp.class, args);
		StudentService service = context.getBean(StudentService.class);
		service.studentService();
	}
}


