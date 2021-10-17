<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.shop.dto.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delivery form</title>
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
  <body  style="background-color: yellow;">
<%
response.addHeader("pragma ", "no-cache ");
response.addHeader(" cache-control", "nostore");
response.addHeader("expire ", "0");
%>

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
%>
<div>
    <div class="left">
      <header class="header">
        <!---- left class for logo -->

        <a href="home.jsp">HOME</a> &nbsp;&nbsp;&nbsp;

        <a href="about.jsp">ABOUT US</a>&nbsp;&nbsp;&nbsp;

        <a href="contact.jsp">CONTACT</a>&nbsp;&nbsp;&nbsp;
        <a href="help.jsp">HELP</a>&nbsp;&nbsp;&nbsp;
       <a href="#" ><button class="leftright" type="button"> YOUR CART</button></a>
              <a href="LogoutController" ><button class="leftright" type="button"> LOG OUT</button></a>
    </div>
  </div>
  <!---- mid bar for navbar -->

  <div class="mid">
    <img src="images/logo.jpg" alt="" height="50px" width="50px" style="float: left;">

    <ul class="navbar">
      <div class="btn-group">
        <button type="button" class="btn btn-danger dropdown-toggle" data-toggle="dropdown" aria-haspopup="true"
          aria-expanded="false">
          PC COMPONENT
        </button>
        <div class="dropdown-menu">
          <a class="dropdown-item" href="keyboardController">KeyBoard</a>
          <a class="dropdown-item" href="mouseController">MOUSE</a>
          <a class="dropdown-item" href="motherboardController">MOTHERBOARD</a>

          <a class="dropdown-item" href="ramController">RAM</a>

          <a class="dropdown-item" href="monitorController">MONITOR</a>

           </div>
      </div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;


      <li><a href="#">GAMING ZONE</a></li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <li> <a href="#">TOP BRANDS</a></li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <li><a href="#">OFFERS</a></li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <li> <a href="#">EXPIERIENCE ZONE</a>
      <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <li> <a href="#">BLOG</a></li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

      
    </ul>
  </div>
  </div>



<center>
 <div class="peripheral">
<h1>Delivery Location Form </h1>
 <h2 style="color: red;">
<%	String m = (String)request.getAttribute("mesg");
	if (m != null)
	out.println(m);%>
	</h2>
 
 <form  action="shopnow" method="post"  >
 <div class="form-group">
    <label for="exampleInputEmail1">Phone</label>
    <input type="text" class="phone" id="phone"  name="phone" readonly="readonly" value="<%=cst.getPhone() %>">
   
  </div>
  
  <div class="form-group">
      <label for="exampleInputEmail1">Delivery Address</label>
  
<input type="text" class="address" id="address" name="address" placeholder="Enter your address" required>
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Pincode</label>
  
   <input type="text" class="pincode" name="pincode" id="pincode"  placeholder="Enter your pincode" autocomplete="pin" required > </div>

   <div class="form-group">
    
<label for="city"  id="city" name="city"  class="city">City </label>
<select id="city" name="city" class="city" required>
  <option value="indore">Indore</option>
  <option value="delhi">Delhi</option>
  <option value="bhopal">Jhansi</option>
  <option value="bangalore">Bangalore</option>
</select>  
</div>

    <div class="form-group">
<label for="State" id="state" name="state" class="state">State</label>
  
<select id="state" name="state" class="state" required>
  <option value="mp">Madhya pradesh</option>
  <option value="delhi">Delhi</option>
  <option value="up">Jhansi</option>
  <option value="kranataka">karnataka</option>
</select>  
 
  </div>
 
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
 </div>
</center>
</body>
</html>