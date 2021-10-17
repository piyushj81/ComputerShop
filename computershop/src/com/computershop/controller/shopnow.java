package com.computershop.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shop.dto.Form;
import com.shop.dto.Shop;
import com.shop.modeldao.CustomerModel;

@WebServlet("/shopnow")
public class shopnow extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			String id = request.getParameter("id");
			String cname = (String)request.getParameter("cname");
			
			Shop s = new Shop();
			
			CustomerModel model = new CustomerModel();
			   s = model.selectshoppingDetailsfromcarttable(id,cname);
			int i = model.insertshoppingDetails(id,cname,s); 
			if(i!=0) {
			response.sendRedirect("shopnowform.jsp");
						
			}
	}
	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);

		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String pincode = request.getParameter("pincode");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		Form f = new Form(phone, address, pincode, city, state);
		
		System.out.println(address+ "  " +pincode+ " "+city+" "+state+" "+phone);
		CustomerModel model = new CustomerModel();
		int i = model.updatedetailsinshopping(f);

		if(i!=0)
		{
			RequestDispatcher rd = request.getRequestDispatcher("thankyou.jsp");
			request.setAttribute("msg", "Product has been purachased and soon it will be delivered to your Location");
			rd.forward(request, response);
	
				}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("shopnowform.jsp");
			request.setAttribute("mesg", "Form should contains small word length");
			rd.forward(request, response);
	
			
		}


		
	
	}

}
