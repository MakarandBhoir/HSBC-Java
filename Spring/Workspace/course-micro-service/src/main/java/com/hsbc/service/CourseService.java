package com.hsbc.service;

import java.util.List;

import com.hsbc.model.Course;

public interface CourseService {
	public List<Course> findCoursesByStudentId(int studentId);
}
