package com.hsbc.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DataServlet1")
public class DataServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String data = "{\"studentId\":\"1\", \"studentName\": \"Test\", \"studentScore\":\"60\"}";
		response.setContentType("application/json");
		response.getWriter().println(data);
	}

}
