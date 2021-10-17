package com.computershop.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.shop.dto.Customer;
import com.shop.dto.Product;
import com.shop.modeldao.CustomerModel;

@WebServlet("/cart")
public class cart extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		
		response.addHeader("pragma ", "no-cache ");
		response.addHeader(" cache-control", "nostore");
		response.addHeader("expire ", "0");
		
		String id = request.getParameter("id");
		String phone = (String) request.getParameter("phone");
		Product pt = new Product();
		/*
		  Product pt1 = new Product(); Product pt2 = new Product(); Product pt3 = new
		  Product(); Product pt4 = new Product(); Product pt5 = new Product(); Product
		 * pt6 = new Product();
		 */
		CustomerModel model = new CustomerModel();
		System.out.println("Customer model object created ");
		if (id.startsWith("m")) {
			pt = model.selectdatafrommouseincart(id, phone);
		}
		if (id.startsWith("k")) {
			pt = model.selectdatafromkeyboardincart(id, phone);
		}
		if (id.startsWith("mb")) {
			pt = model.selectdatafrommotherboardincart(id, phone);
		}
		if (id.startsWith("c")) {
			pt = model.selectdatafromcpuincart(id, phone);
		}
		if (id.startsWith("mt")) {
			pt = model.selectdatafrommonitorincart(id, phone);
		}
		if (id.startsWith("f")) {
			pt = model.selectdatafromfanincart(id, phone);
		}
		if (id.startsWith("r")) {
			pt = model.selectdatafromramincart(id, phone);
		}

		int i = 0;
		if (pt != null)// || pt1 != null || pt2 != null || pt3 != null || pt4 != null || pt5 != null |
						// // pt6 != null) {
		{
			i = model.insertproductdata(pt, id, phone);
		}

		RequestDispatcher rd = null;

		if (i != 0) {
			ArrayList<Product> list1 = model.getusercartdetail(phone);
			request.setAttribute("details", list1);

			RequestDispatcher rd1 = request.getRequestDispatcher("cart.jsp");
			rd1.forward(request, response);

		} else {
			rd = request.getRequestDispatcher("cart.jsp");
			request.setAttribute("message", "Somethinng Went Wrong");
			rd.forward(request, response);

		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
