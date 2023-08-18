package com.hsbc;

public class Student {
	private int studentId;
	private String studentName;
	private String contactNumber;
	private String courseName;
	private double courseFees;
	
	public Student(int studentId, String studentName, String contactNumber, 
			String courseName, double courseFees) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.contactNumber = contactNumber;
		this.courseName = courseName;
		this.courseFees = courseFees;
	}
	
	public void displayStudent() {
		System.out.println("Student Id = "+studentId);
		System.out.println("Student Name = "+studentName);
		System.out.println("Contact Number = "+contactNumber);
		System.out.println("Course Name = "+courseName);
		System.out.println("Course Fees = "+courseFees);
		System.out.println("---------------------------------------");
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

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
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
	
}
