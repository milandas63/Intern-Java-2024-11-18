<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Prime Numbers</h1>
	<hr>
	<%
		int start = 1000;
		int end = 3000;
		boolean yn = false;
		int count = 0;

		out.println("<table border='1' cellpadding='5' cellspacing='1'>");
		out.println("<tr>");
		
		for(int i=start; i<=end; i++) {
			yn = true;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					yn = false;
					break;
				}
			}
			if(yn) {
				out.println("<td>");
				out.println(i);
				out.println("</td>");
				count++;
				if(count>10) {
					count = 0;
					out.println("</tr>");
					out.println("<tr>");
				}
			}			
		}
		out.println("</tr>");
		out.println("</table>");
	%>
</body>
</html>