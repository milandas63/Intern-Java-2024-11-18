<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Multiplication Tables</title>
</head>
<body>
	<c:out value="Milan Das" />
	<c:set var="name" value="IIG Varsity" scope="session" />
	<c:out value="${name}" />
	<table border="1">
	<tr>
	<c:forEach var="i" begin="2" end="10">
		<td>
		<table>
			<c:forEach var="j" begin="1" end="10">
			<tr>
				<td align="right"><c:out value="${i}" /></td>
				<td align="center">x</td>
				<td align="right"><c:out value="${j}" /></td>
				<td align="center">=</td>
				<td align="right"><c:out value="${i*j}" /></td>
			</tr>
			</c:forEach>
		</table>
		</td>
	</c:forEach>
	</tr>
	</table>
</body>
</html>
