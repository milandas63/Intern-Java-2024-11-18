package com.form;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormSubmit extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		try {
			String varName;
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			Enumeration<String> en = req.getParameterNames();
			out.write("<html>");
			out.write("<body>");
			out.write("<table border='1'>");
			while(en.hasMoreElements()) {
				varName = en.nextElement();
				out.write("<tr>");
				out.write("<td>"+varName+"</td>");
				out.write("<td>"+req.getParameter(varName)+"</td>");
				out.write("</tr>");
			}
			out.write("</table>");
			out.write("</body>");
			out.write("</html>");
		} catch(IOException e) {
		} catch(Exception e) {
		}

	}
}
