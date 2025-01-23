package com.jdbc;

import java.sql.*;

public class Attendance {
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	private ResultSetMetaData rsmd;
	
	public Attendance() {
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance18", "root", "root");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT a.attn_id AS 'ID', s.stu_name AS 'Student-Name', c.cls_desc AS 'Class' , e.sec_desc AS 'Section', b.br_desc AS 'Branch' FROM attendance AS a LEFT JOIN student AS s ON a.stu_id=s.stu_id LEFT JOIN class   AS c ON s.cls_id=c.cls_id LEFT JOIN section AS e ON s.sec_id=e.sec_id LEFT JOIN branch  AS b ON s.br_id=b.br_id");
			rsmd = rs.getMetaData();

			int colCount = rsmd.getColumnCount();
			System.out.print("| ");
			for(int i=1; i<=colCount; i++) {
				System.out.print(rsmd.getColumnLabel(i)+" | ");
			}
			System.out.println();

			System.out.print("| ");
			for(int i=1; i<=colCount; i++) {
				System.out.print(rsmd.getColumnName(i)+" | ");
			}
			System.out.println();

			while(rs.next()) {
				System.out.print("| ");
				System.out.println(
					rs.getString("ID")+" | "+
					rs.getString("Student-Name")+" | "+
					rs.getString("Class")+" | "+
					rs.getString("Section")+" | "+
					rs.getString("Branch")+" |");
			}
			
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
		new Attendance();
	}

}
