package com.hsbc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.model.Student;

@RestController
@RequestMapping(path = "students")
public class StudentController {
	
	private List<Student> students = new ArrayList<Student>();
	
	// http://localhost:9090/students - method - get
	@GetMapping
	public Student getStudent() {
		Student student = new Student(1, "Vishwajeet", 92);
		return student;
	}
	// http://localhost:9090/students - method - post
	@PostMapping
	public void addStudent(@RequestBody Student student) {
		System.out.println(student);
	}
	
}



