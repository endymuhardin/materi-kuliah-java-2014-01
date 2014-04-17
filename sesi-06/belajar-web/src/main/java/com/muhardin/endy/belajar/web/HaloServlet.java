package com.muhardin.endy.belajar.web;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
import java.io.IOException;

public class HaloServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		
		PrintWriter output = res.getWriter();
		output.println("");
		
		output.println("<html>");
		output.println("<head><title>Coba</title></head>");
		output.println("<body>	");
		output.println("<h1>Coba</h1>");	
		output.println("</body>");
		output.println("</html>");
		output.close();
	}
}