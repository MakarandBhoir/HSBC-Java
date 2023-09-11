package com.hsbc.crosscutting;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class StudentLogging {
	
	@Before("execution(* com.hsbc.service.StudentService.studentService(..))")
	public void logMessage() {
		System.out.println("logging message");
	}
	
}
