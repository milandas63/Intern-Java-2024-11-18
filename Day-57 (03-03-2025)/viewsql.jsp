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
	String sqlString = request.getParameter("sql");
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact18","root","root");
	Statement stmt = conn.createStatement();
	ResultSet rs = stmt.executeQuery(sqlString);
	ResultSetMetaData rsmd = rs.getMetaData();
	%>
	<h1>Good Work</h1>
	<table border='1'>
		<tr>
			<% for(int i=1; i<=rsmd.getColumnCount(); i++) { %>
				<th><%=rsmd.getColumnLabel(i) %></th>
			<% } %>
		</tr>
		<% while(rs.next()) { %>
			<tr>
				<% for(int i=1; i<=rsmd.getColumnCount(); i++) { %>
					<td><%=rs.getString(i) %></td>
				<% } %>
			</tr>
		<% } %>
	</table>
	<%
	rs.close();
	stmt.close();
	conn.close();
	%>
</body>
</html>
