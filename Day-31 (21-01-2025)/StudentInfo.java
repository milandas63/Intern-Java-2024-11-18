package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentInfo {
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	public StudentInfo() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java18", "root", "root");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT slno,name,gender,dob FROM participants");
			while(rs.next()) {
				System.out.println(
					rs.getInt("slno")+" "+
					rs.getString("name")+" "+
					rs.getString("gender")+" "+
					rs.getDate("dob")
				);
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch(ClassNotFoundException e) {
			System.out.println("Driver not found");
		} catch(SQLException e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		new StudentInfo();
	}

}
