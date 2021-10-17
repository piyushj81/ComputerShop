<%@page import="com.shop.dto.Admin"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.shop.dto.Customer"%>
<%@page import="com.shop.dto.Cart"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

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

<title>Shopping Details</title>
</head>
<body>
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

<h1 style="color:red;" >User Purchased Product that are On Delivery</h1>


<% 
ArrayList<Admin> list2 = (ArrayList<Admin>) request.getAttribute("LIST");

		if (!(list2 != null) || !(list2.isEmpty())) {
		
		
			
		%>
			<table style="width:175%;text-align:center; color:yellow;"    class="table table-hover table-dark "   >
	<tr>
		<th>Product ID</th>
		<th>Phone</th>
		<th>Customer Name </th>
		<th>Pic</th>
		<th>Product Name</th>
		<th>Model</th>
		<th>Price</th>
		<th>Address</th>			
		<th>City</th>
		<th>State</th>
		
	</tr>
	<%
	for (Admin a : list2 ) {
	%>

	<tr>
	
		<td><%=a.getId() %></td>
		<td><%=a.getPhone() %></td>
		<td><%=a.getCname() %></td>
		<td> <img alt="" src="<%=a.getPic() %>" style ="max-height:50%; max-width:70%"> </td>
		<td><%=a.getPname() %></td>
		<td><%=a.getModel() %></td>
		<td><%=a.getPrice()  %></td>
		<td><%=a.getAddress() %></td>
		<td><%=a.getCity() %></td>
		<td><%=a.getState()%></td>
	
</tr>															

<%}	%>	
	
</table>	

		
	
	<%
}else {  %>
out.println("List not available");



	

<% }%>
	

</body>
</html>