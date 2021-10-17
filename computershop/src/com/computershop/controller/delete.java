package com.computershop.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shop.dto.Product;
import com.shop.modeldao.CustomerModel;

@WebServlet("/delete")
public class delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String id =	request.getParameter("id");
	String phone =	request.getParameter("phone");
	
	CustomerModel model = new CustomerModel();
	int i =	model.deleteitem(id);
	
	ArrayList<Product> list1 = model.getusercartdetail(phone);

	
	if(i!=0) {
		
		RequestDispatcher rd = request.getRequestDispatcher("cart.jsp");
		request.setAttribute("msg", "Item Deleted from your cart");
		request.setAttribute("details", list1);
		rd.forward(request, response);
	}
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
