<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.shop.dto.Customer"%>
<%@page import="com.shop.dto.Cart"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>admin</title>
<%
response.addHeader("pragma ", "no-cache ");
response.addHeader(" cache-control", "nostore");
response.addHeader("expire ", "0");
%>
<link rel="stylesheet" href="computershop.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
    integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
    integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
    crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx"
    crossorigin="anonymous"></script>


</head>
<body><center>
<% String user = (String)session.getAttribute("admin"); 
	if(user != null)
	out.println(  "welcome admin  " +user);
	else
		response.sendRedirect("adminLogin.jsp");

	response.addHeader("pragma ", "no-cache ");
	response.addHeader(" cache-control", "nostore");
	response.addHeader("expire ", "0");

	
	%>

<h1> Admin Home</h1>
  <a href="adminlogoutController" ><button class="btn btn-danger" type="button"> LOG OUT</button></a>
</center>
<div class="peripheral">
<a href="shopproductcontroller"> <button type="button" class="btn btn-success"> USER SHOPPING PRODUCT DETAILS</button></a>
<a href="userCartdetailscontroller"><button type="button" class="btn btn-success">CART DETAILS of Users</button></a>
</div>

</body>
</html>