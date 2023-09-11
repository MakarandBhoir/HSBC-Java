package com.hsbc.model;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope(scopeName="prototype")
public class Student {
	private int studentId;
	private String studentName;
	private double studentScore;
	private List<Course> course;
	
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	
	public Student() {
		
	}
	public Student(int studentId, String studentName, double studentScore) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentScore = studentScore;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public double getStudentScore() {
		return studentScore;
	}
	public void setStudentScore(double studentScore) {
		this.studentScore = studentScore;
	}
}
