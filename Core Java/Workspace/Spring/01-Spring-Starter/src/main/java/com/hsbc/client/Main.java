package com.hsbc.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hsbc.service.HelloService;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		HelloService service1 = (HelloService) context.getBean("service");
		HelloService service2 = (HelloService) context.getBean("service");
		HelloService service3 = (HelloService) context.getBean("service");
		
		String message =  service1.helloService();
		System.out.println(message);
		
		System.out.println("===========================================");
		
		System.out.println(service1.hashCode());
		System.out.println(service2.hashCode());
		System.out.println(service3.hashCode());
		
	}
}
