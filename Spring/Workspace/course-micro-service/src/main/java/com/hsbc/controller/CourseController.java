package com.hsbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.model.Course;
import com.hsbc.service.CourseService;
@RestController
@RequestMapping(path="course")
public class CourseController {
	@Autowired
	private CourseService service;
	
	//http://localhost:9092/course/student/101
	@GetMapping(path="student/{stuId}")
	public List<Course> getCoursesByStudentId(@PathVariable("stuId") int studentId){
		return service.findCoursesByStudentId(studentId);
	}
}





