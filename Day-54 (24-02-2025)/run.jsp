<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.lang.reflect.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<%! 
	public String suppress(String line) {
		StringBuffer buf = new StringBuffer();
		boolean yn = true;
		char c;
		for(int i=line.length()-1; i>=0; i--) {
			c = line.charAt(i);
			switch(c) {
			case '.': yn = false; break;
			case ' ': yn = true; break;
			case ',': yn = true; break;
			case '(': yn = true; break;
			case ')': yn = true; break;
			case '[': yn = true; break;
			case ']': yn = true; break;
			}
			if(yn) {
				buf.insert(0,c);
			}
		}
		return buf.toString();
	}
	%>
</head>
<body>
	<tt>
	<%
	try {
	    String cName = "java.lang.String";

	    Class obj = Class.forName(cName);
	    Field[] f = obj.getDeclaredFields();
	    Constructor[] c = obj.getDeclaredConstructors();
	    Method[] m = obj.getDeclaredMethods();

	    // Print heading
	    out.println("<big><u>"+cName+"</u></big><br>");

	    // Print field list
	    if(f.length>0) {
	    	out.println("FIELDS:<br>");
	        for(int i=0; i<f.length; i++) {
	            out.println((i+1)+": "+suppress(f[i].toString()) + "<br>");
	        }
	    }

	    // Print Constructors list
	    if(c.length>0) {
	    	out.println("CONSTRUCTOR:<br>");
	        for(int i=0; i<c.length; i++) {
	            out.println((i+1)+": "+suppress(c[i].toString()) + "<br>");
	        }
	    }

	    // Print Methods list
	    if(m.length>0) {
	    	out.println("METHODS:<br>");
	        for(int i=0; i<m.length; i++) {
	            out.println((i+1)+": "+suppress(m[i].toString()) + "<br>");
	        }
	    }
	} catch(ClassNotFoundException e) {
		out.println("Class Not Found Exception");
	} catch(Exception e) {
		out.println("General Exception");
	}
	%>
	</tt>
</body>
</html>