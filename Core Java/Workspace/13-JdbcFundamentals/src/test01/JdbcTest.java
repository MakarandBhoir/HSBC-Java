package test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTest {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded.");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "makarand@1234");
			System.out.println("Database is connected.");
		}
		catch(ClassNotFoundException ex) {
			System.out.println("Driver class not found.");
		}
		catch(SQLException ex) {
			System.out.println("SQL Exception.");
		}
	}
}
