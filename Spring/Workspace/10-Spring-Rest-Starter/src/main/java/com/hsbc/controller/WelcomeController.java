package com.hsbc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "welcome")
public class WelcomeController {
	// http://localhost:9090/welcome/greet
	@GetMapping(path = "greet")
	public String greet() {
		return "Welcome To Rest API!";
	}
}
