<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>SQL Browser Application</h1>
	<hr><br>
	<form action="/Welcome/viewsql.jsp">
		<label>Enter a SQL Statement:</label><br>
		<input type="text" name="sql" size="125" />
		<br><br>
		<input type="submit" value="Run">
		<br><br>
	</form>
</body>
</html>