package com.hsbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.model.Student;
import com.hsbc.service.StudentService;

@RestController
@RequestMapping(path = "students")
public class StudentController {
	@Autowired
	private StudentService service;
	
	// http://localhost:9090/students - get
	@GetMapping
	public List<Student> findAllStudents(){
		return service.findAllStudents();
	}
	// http://localhost:9090/students - post
	@PostMapping
	public void addStudent(@RequestBody Student student) {
		service.addStudent(student);
	}
}




