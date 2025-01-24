package com.jdbc;

import java.sql.*;

public class MoveCursor {
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	private ResultSetMetaData rsmd;
	
	public MoveCursor() {
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance18", "root", "root");
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = stmt.executeQuery("SELECT * FROM student");
			rsmd = rs.getMetaData();
			
			System.out.println("Move downward:");
			while(rs.next()) {
				for(int i=1; i<=rsmd.getColumnCount(); i++) {
					System.out.print(rs.getString(i)+" ");
				}
				System.out.println();
			}
			System.out.println();
			
			System.out.println("Move upward:");
			while(rs.previous()) {
				for(int i=1; i<=rsmd.getColumnCount(); i++) {
					System.out.print(rs.getString(i)+" ");
				}
				System.out.println();
			}
			System.out.println();

			System.out.println("Print 3rd row:");
			rs.absolute(3);
			for(int i=1; i<=rsmd.getColumnCount(); i++) {
				System.out.print(rs.getString(i)+" ");
			}
			System.out.println();
			System.out.println(rs.getRow());

			rs.last();
			rs.updateString("stu_name", "Adit");
			rs.updateRow();
			
			rs.close();
			stmt.close();
			conn.close();
		} catch(ClassNotFoundException e) {
		} catch(SQLException e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		new MoveCursor();
	}
}
