package com.hsbc.crosscutting;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class StudentLogging {
	
	@Before("execution(* com.hsbc.service.StudentService.studentService(..))")
	public void logMessage1() {
		System.out.println("logging message - before advice");
	}
	
	@After("execution(* com.hsbc.service.StudentService.studentService(..))")
	public void logMessage2() {
		System.out.println("logging message - after advice");
	}
	
	@Around("execution(* com.hsbc.service.StudentService.studentService(..))")
	public String logMessage3(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("logging message - around advice");
		String str = (String) jp.proceed();
		System.out.println("logging message - around advice");
		return str;
	}
	
	@AfterReturning("execution(* com.hsbc.service.StudentService.studentService(..))")
	public void logMessage4() {
		System.out.println("logging message - afterReturning advice");
	}
	
	@AfterThrowing("execution(* com.hsbc.service.StudentService.studentService(..))")
	public void logMessage5() {
		System.out.println("logging message - - afterThrowing advice");
	}
	

}
