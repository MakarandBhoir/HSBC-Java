package com.hsbc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "Welcome")
public class WelcomeController {
	// http://localhost:9090/Welcome/greet
	@GetMapping(path = "greet")
	public String greet() {
		System.out.println("Welcome To Spring MVC!");
		return "welcome";
	}
	
}
