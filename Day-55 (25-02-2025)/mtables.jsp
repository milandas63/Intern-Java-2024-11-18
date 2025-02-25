<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	int start = 2;
	int end = 35;
	int count = 0;
	%>
	<table border='1' cellspacing='1' cellpadding='5'>
		<tr>
		<% for(int i=start; i<=end; i++) { %>
			<td>
			<table>
			<% for(int j=1; j<=10; j++) { %>
				<tr>
					<td align='right'><%=i%></td>
					<td align='center'>x</td>
					<td align='right'><%=j%></td>
					<td align='center'>=</td>
					<td align='right'><%=(i*j)%></td>
				</tr>
			<% } %>
			</table>
			</td>
			<%
			count++;
			if(count>=6) {
				count = 0;
			%>
				</tr><tr>
			<%
			}
			%>
		<% } %>
		</tr>
	</table>
</body>
</html>
