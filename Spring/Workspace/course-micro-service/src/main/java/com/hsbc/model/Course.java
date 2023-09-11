package com.hsbc.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName="prototype")
public class Course {
	private int courseId;
	private String courseName;
	private double courseFees;
	private int studentId;
	public Course() {
		
	}
	public Course(int courseId, String courseName, double courseFees, int studentId) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseFees = courseFees;
		this.studentId = studentId;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getCourseFees() {
		return courseFees;
	}
	public void setCourseFees(double courseFees) {
		this.courseFees = courseFees;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
}
