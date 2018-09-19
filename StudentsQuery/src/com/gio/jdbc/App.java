package com.gio.jdbc;

public class App {

	public static void main(String[] args) {
		
		StudentsJDBCQuery jdbc = new StudentsJDBCQuery();
		jdbc.readDatabase();
	}
	
}
