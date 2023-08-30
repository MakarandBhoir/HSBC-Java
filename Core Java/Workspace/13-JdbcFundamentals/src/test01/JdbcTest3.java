package test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcTest3 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "makarand@1234");
			
			connection.setAutoCommit(false);
			String query = "insert into students values(?, ?, ?, ?)";			
			PreparedStatement pstmt = connection.prepareStatement(query);
			int studentId = 34;
			String studentName = "Test";
			double studentScore = 40;
			int deptId = 10;
			
			pstmt.setInt(1, studentId);
			pstmt.setString(2, studentName);
			pstmt.setDouble(3, studentScore);
			pstmt.setInt(4, deptId);
			int result = pstmt.executeUpdate();
			
			connection.commit();
			
			if(result == 1)
				System.out.println("Data inserted successfully.");
			
		}
		catch(ClassNotFoundException ex) {
			System.out.println("Driver class not found.");
		}
		catch(SQLException ex) {
			System.out.println("SQL Exception.");
		}
	}
}
