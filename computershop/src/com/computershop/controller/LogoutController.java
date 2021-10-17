package com.computershop.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LogoutController")
public class LogoutController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.addHeader("pragma ", "no-cache ");
		response.addHeader(" cache-control", "nostore");
		response.addHeader("expire ", "0");

		HttpSession session = request.getSession();
		session.invalidate();
	
		response.addHeader("pragma ", "no-cache ");
		response.addHeader(" cache-control", "nostore");
		response.addHeader("expire ", "0");

		response.sendRedirect("login.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
