package com.computershop.controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.shop.modeldao.CustomerModel;
@WebServlet("/adminlogincontroller")
public class adminlogincontroller extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
	String adminusername = request.getParameter("adminusername");
	String pwd = request.getParameter("pwd");
	CustomerModel model = new CustomerModel();
	
	
		int i = model.checkadminlogin(adminusername,pwd);
		RequestDispatcher rd = null;
		if(i!=0) {
			HttpSession session = request.getSession();
			session.setMaxInactiveInterval(20000);
			session.setAttribute("admin",adminusername);
			response.sendRedirect("adminHome.jsp");
			response.addHeader("pragma ", "no-cache ");
			response.addHeader(" cache-control", "nostore");
			response.addHeader("expire ", "0");

						
		}else {
			rd = request.getRequestDispatcher("adminLogin.jsp");
			request.setAttribute("mesg", "Invalid User Name or Password");
			rd.forward(request, response);
			
			
		}
	
	
	}

}
