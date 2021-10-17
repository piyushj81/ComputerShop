package com.computershop.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shop.dto.Customer;
import com.shop.modeldao.CustomerModel;

@WebServlet("/customerAdmit")
public class customerAdmit extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	
	
	}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String phone = request.getParameter("phone");
			String name = request.getParameter("name");
			String password = request.getParameter("password");
			Customer cst = new Customer(name, phone, password);
			CustomerModel model = new CustomerModel();
			int i =	model.admitCustomer(cst);
			RequestDispatcher rd = null;
			if(i!=0) {
				rd = request.getRequestDispatcher("customerAdmit.jsp");
				request.setAttribute("msg", "Customer Registred Succesful, Now you can login using this username and password");
			
			}else {
				rd = request.getRequestDispatcher("customerAdmit.jsp");
				request.setAttribute("msg", "Failed");
				
			}
		rd.forward(request, response);
		
		
		
		}

		
}
