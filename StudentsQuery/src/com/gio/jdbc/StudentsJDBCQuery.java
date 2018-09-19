package com.gio.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentsJDBCQuery {
	
	private String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	private String DATABASE_URL = "jdbc:mysql://localhost/vaadin?serverTimezone=UTC";
	private String USER = "vaadin";
	private String PASSWORD = "vaadin";
	
	public void readDatabase() {
		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;
		
		try {
			Class.forName(JDBC_DRIVER);
			
			connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
			
			statement = connection.createStatement();
			
			String sqlCommand = "Select * From Students";
			rs = statement.executeQuery(sqlCommand);
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				Student student = new Student(id,name,age);
				System.out.println(student);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}

}
