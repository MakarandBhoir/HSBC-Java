package com.hsbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hsbc.model.Course;
import com.hsbc.model.Student;
import com.hsbc.service.StudentService;
@RestController
@RequestMapping(path="students")
public class StudentController {
	@Autowired
	private StudentService service;
	
	@Autowired
	private RestTemplate template;
	
	//http://localhost:9091/students
	@GetMapping
	public List<Student> getAllStudents(){
		List<Student> students = service.findAllStudents();
		for(Student student : students) {
			List<Course> courses = template.getForObject("http://localhost:9092/course/student/"+student.getStudentId(), List.class);
			student.setCourse(courses);
		}
		return students;
	}
	//http://localhost:9091/students/101
	@GetMapping(path="{studentId}")
	public Student getByStudentId(@PathVariable("studentId") int studentId) {
		Student student = service.findStudentById(studentId);
		List<Course> courses = template.getForObject("http://localhost:9092/course/student/"+studentId, List.class);
		student.setCourse(courses);
		return student;
	}
}





