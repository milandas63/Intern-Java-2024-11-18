package com.tables;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MTables extends HttpServlet {
	PrintWriter out;
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) {
		try {
			resp.setContentType("text/html");
			out = resp.getWriter();

			int count = 0;
			int start_no = Integer.parseInt(req.getParameter("start"));
			int end_no = Integer.parseInt(req.getParameter("end"));

			out.write("<html>");
			out.write("<body>");
			out.write("<table border='1'>");
			out.write("<tr>");
			for(int i=start_no; i<=end_no; i++) {
				out.write("<td>");
				out.write("<table>");
				for(int j=1; j<=10; j++) {
					out.write("<tr>");
					out.write("<td align='right'>"+i+"</td>");
					out.write("<td align='center'>x</td>");
					out.write("<td align='right'>"+j+"</td>");
					out.write("<td align='center'>=</td>");
					out.write("<td align='right'>"+(i*j)+"</td>");
					out.write("</tr>");
				}
				out.write("</table>");
				out.write("</td>");
				count++;
				if(count>=10) {
					count = 0;
					out.write("</tr>");
					out.write("<tr>");
				}
			}
			out.write("</tr>");
			out.write("</table>");
			out.write("</body>");
			out.write("</html>");
		} catch(IOException e) {
			
		}
	}

}
