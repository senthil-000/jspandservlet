package com.exmaple.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.io.*;

public class BeerSelect extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
							throws IOException,ServletException {

	reponse.setContentType("text/html");
	PrintWriter out = response.getWriter();
	out.println("Beer Selection Advise <br>");

	String c = request.getParameter ("color");

	out.println("<br> Got Beer color " + c );

	

	}



}


//C:\Program Files\Apache Software Foundation\Tomcat 9.0\lib