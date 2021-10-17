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

@WebServlet( "/mouseController")
public class mouseController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	CustomerModel model = new CustomerModel();
	ArrayList<Product>	list =	model.getmouseDetails();
	RequestDispatcher rd = request.getRequestDispatcher("mouse.jsp");
		request.setAttribute("LIST", list);
		rd.forward(request, response);
		
   		
   		
   	}
   		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
   		
   			
   			
   			
   			
   			
   			
   		}  			
}
