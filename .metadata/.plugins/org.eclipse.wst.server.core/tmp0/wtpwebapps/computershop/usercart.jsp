<%@page import="com.shop.dto.Cart"%>
<%@page import="com.shop.dto.Customer"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.shop.dto.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>user cart details</title>
<link rel="stylesheet" href="computershop.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
	integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx"
	crossorigin="anonymous"></script>

</head>
<body>
<div>
<% String user = (String)session.getAttribute("admin"); 
	if(user != null)
	out.println(  "welcome admin  " +user);
	else
		response.sendRedirect("adminLogin.jsp");

	response.addHeader("pragma ", "no-cache ");
	response.addHeader(" cache-control", "nostore");
	response.addHeader("expire ", "0");

	%>

<a href="adminlogoutController" ><button class="btn btn-danger" type="button"  style= "float: right; margin-right:-500px;"   > LOG OUT</button></a>
</div>

<h1 style="color:red;">User Cart Details </h1>
<%

Class.forName("com.mysql.jdbc.Driver");
Customer cst = null;
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop", "root", "root");
try {
	PreparedStatement ps = con.prepareStatement("Select * from customerlogin where username= ? ");
	ps.setString(1, (String) session.getAttribute("user"));

	ResultSet rs = ps.executeQuery();
	if (rs.next()) {
		cst = new Customer(rs.getString("username"), rs.getString("phone"), rs.getString("password"));
	}
} catch (Exception e) {
	e.printStackTrace();
}

ArrayList<Cart> list2 = (ArrayList<Cart>) request.getAttribute("list2");
						if(!(list2 == null) || !(list2.isEmpty())) {
			

					%>
				
				<table style="width:175%;text-align:center; color:yellow;"    class="table table-hover table-dark tablesm"   >
					<tr>
						<th>PHONE</th>
						<th>IMAGE</th>
						<th>PRODUCT ID</th>
						<th>PRODUCT NAME</th>
						<th>MODEL NUMBER</th>
						<th>PRICE</th>
					
					</tr>
					<%
					for (Cart ct : list2) {
					%>

					<tr>
					
						<td><%=ct.getPhone() %></td>
						<td> <img alt="" src="<%=ct.getPic()%>"style ="max-height:50%; max-width:70%"> </td>
						<td><%=ct.getId() %></td>
						<td><%=ct.getPname() %></td>
						<td><%=ct.getModel()%></td>
						<td><%=ct.getPrice()%></td>
			
	
				</tr>			
									
													
					<%
					}
					%>


				</table>

				<%
			}else {
				out.println("LIST NOT AVAILAIBLE");

				}
				%>
		</body>
</html>