package com.computershop.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.shop.modeldao.CustomerModel;


@WebServlet("/Logincontroller")
public class Logincontroller extends HttpServlet {
	   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.addHeader("pragma ", "no-cache ");
		response.addHeader(" cache-control", "nostore");
		response.addHeader("expire ", "0");
		
		String user = request.getParameter("username");
		String password = request.getParameter("password");
		CustomerModel model = new CustomerModel();
		int i = model.checkCustomerlogin(user, password);
		RequestDispatcher rd = null;
		if(i!=0) {
			response.addHeader("pragma ", "no-cache ");
			response.addHeader(" cache-control", "nostore");
			response.addHeader("expire ", "0");

			HttpSession session = request.getSession();
			session.setMaxInactiveInterval(20000);
			session.setAttribute("user", user);

			response.sendRedirect("loginHome.jsp");	
			
			
		} else
		{
			rd = request.getRequestDispatcher("login.jsp");
			request.setAttribute("msg", "Invalid User Name or Password");
			rd.forward(request, response);
			
		}
		
	}		
		
	}
	


