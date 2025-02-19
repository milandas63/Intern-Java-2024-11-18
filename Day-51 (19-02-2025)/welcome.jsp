<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <h1 style='color:red;'>Welcome Java Stalwarts</h1>
   <%
       for(int i=1; i<5; i++) {
         out.println(i + " This is from jsp<br>");
       }
   %>
</body>
</html>