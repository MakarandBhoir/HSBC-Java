package test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest2 {
	public static void main(String[] args) {
		Connection connection = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "makarand@1234");
			stmt = connection.createStatement();
			String query = "select * from students";
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				int studentId = rs.getInt("student_id");
				String studentName = rs.getString("student_name");
				double studentScore = rs.getDouble("student_score");
				int deptId = rs.getInt("dept_id");
				
				System.out.println(studentId+", "+studentName+", "+studentScore+", "+deptId);
			}
		}
		catch(ClassNotFoundException ex) {
			System.out.println("Driver class not found.");
		}
		catch(SQLException ex) {
			System.out.println("SQL Exception.");
		}
		finally {
			try {
				if(rs != null)
					rs.close();
				if(stmt != null)
					stmt.close();
				if(connection != null)
					connection.close();
			}
			catch(SQLException ex) {
				System.out.println("Problem while closing connection.");
			}
		}
	}
}
