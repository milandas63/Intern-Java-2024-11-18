package com.report;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SQLReport extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	private ResultSetMetaData rsmd;

	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		String sql_command = req.getParameter("sql");
		
		try {
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			
			Class.forName("org.gjt.mm.mysql.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact18","root","root");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql_command);
			rsmd = rs.getMetaData();
			
			out.println("<html>");
			out.println("<body>");
			out.println("<table border='1'>");
			out.println("<tr>");
			for(int i=1; i<=rsmd.getColumnCount(); i++) {
				out.println("<th>"+rsmd.getColumnLabel(i)+"</th>");
			}
			out.println("</tr>");
			while(rs.next()) {
				out.println("<tr>");
				for(int i=1; i<=rsmd.getColumnCount(); i++) {
					out.println("<td>"+rs.getString(i)+"</td>");
				}
				out.println("</tr>");
			}
			out.println("</table>");
			out.println("</body>");
			out.println("</html>");
			
		} catch(IOException e) {
		} catch(ClassNotFoundException e) {
			System.out.println("Class Not Found "+e);
		} catch(Exception e) {
		}
	}
}
