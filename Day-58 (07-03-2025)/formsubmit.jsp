<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String pid = request.getParameter("pid");
	String name = request.getParameter("name");
	String father = request.getParameter("father");
	String mobile = request.getParameter("mobile");
	String email = request.getParameter("email");
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java18","root","root");
	Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
	ResultSet rs = stmt.executeQuery("SELECT * FROM students");
	
	rs.moveToInsertRow();
	rs.updateString("pid",pid);
	rs.updateString("name",name);
	rs.updateString("father",father);
	rs.updateString("mobile",mobile);
	rs.updateString("email",email);
	rs.insertRow();
	rs.moveToCurrentRow();
	
	rs.close();
	stmt.close();
	conn.close();
	%>
	<h1>Data sucessfully saved!</h1>
</body>
</html>