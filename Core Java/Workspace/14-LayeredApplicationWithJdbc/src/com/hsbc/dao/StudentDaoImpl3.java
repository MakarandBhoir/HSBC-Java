package com.hsbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.hsbc.exceptions.NoSuchStudentException;
import com.hsbc.model.Student;

public class StudentDaoImpl3 implements StudentDao {
	private Connection connection = null;
	private Statement stmt = null;
	
	private void openResources() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "makarand@1234");
		stmt = connection.createStatement();
	}
	private void closeResources() {
		
	}
	
	@Override
	public boolean createStudent(Student student) { // Insert
		return false;
	}
	@Override
	public Student readStudent(int studentId) throws NoSuchStudentException { //Select
		Student result = null;
		try {
			openResources();
			
			String query = "Select * From Students Where Student_Id = "+studentId;
			ResultSet rs = stmt.executeQuery(query);
			if(rs.next()) {
				result = new Student(rs.getInt("student_id"), 
						rs.getString("student_name"), 
						rs.getDouble("student_score"));
			}
			rs.close();
			closeResources();
		}catch(ClassNotFoundException | SQLException ex) {
			throw new NoSuchStudentException();
		}
		return result;
	}
	@Override
	public boolean deleteStudent(int studentId) { // Delete
		return false;
	}
	@Override
	public Student updateStudent(int studentId, Student student) { // Update
		return null;
	}
	@Override
	public List<Student> readAllStudents() { // Select
		return null;
	}
}
