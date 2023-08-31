package com.hsbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.hsbc.exceptions.NoSuchStudentException;
import com.hsbc.exceptions.StudentAlreadyExistsException;
import com.hsbc.exceptions.TechnicalException;
import com.hsbc.model.Student;

public class StudentDaoImpl3 implements StudentDao {
	private Connection connection = null;
	private Statement stmt = null;
	
	private void openResources() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb?useSSL=false", "root", "makarand@1234");
		stmt = connection.createStatement();
	}
	private void closeResources() throws SQLException {
		stmt.close();
		connection.close();
	}
	
	@Override
	public boolean createStudent(Student student) { // Insert
		try {
			openResources();
			connection.setAutoCommit(false);
			String query = "Insert into students(student_id, student_name, student_score) values(?, ?, ?)";
			PreparedStatement pstmt = connection.prepareStatement(query);
			pstmt.setInt(1, student.getStudentId());
			pstmt.setString(2, student.getStudentName());
			pstmt.setDouble(3, student.getStudentScore());
			pstmt.executeUpdate();
			connection.commit();
			closeResources();
		}
		catch(ClassNotFoundException ex) {
			throw new TechnicalException();
		}
		catch(SQLException ex) {
			throw new StudentAlreadyExistsException("Student already present in database.", ex);
		}
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
				return result;
			}
			rs.close();
			closeResources();
		}catch(ClassNotFoundException | SQLException ex) {
			throw new TechnicalException();
		}
		throw new NoSuchStudentException("Student Not found with id "+studentId);
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
