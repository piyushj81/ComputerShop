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
<body>

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

<%
response.addHeader("pragma ", "no-cache ");
response.addHeader(" cache-control", "nostore");
response.addHeader("expire ", "0");
%>


</div>
  <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<center>
<div class=" peripheral">
<div class="thankyou-page">
    <div class="_header">
        <div class="logo">
            <img src="https://codexcourier.com/images/banner-logo.png" alt="">
        </div>
        <h1><% String user1 = (String)session.getAttribute("user"); 
	if(user1 != null){
	out.println( "Thank you " +user1+ " ,for Shopping" );
			}
	else
		response.sendRedirect("LogoutController");

%>
        </h2>
    </div>
    <div class="_body">
        <div class="_box">
            <h2>
                <strong>Please check your Cart</strong> 
            </h2>
            <p>
             Your Product Will be Deliver Soon    <%out.println(user1); %>.
            </p>
        </div>
    </div>
    <div class="_footer">
        <p>Having trouble? <a href="contact.jsp">Contact us</a> </p>
        <a class="btn" href="login.jsp">Log out</a>
    </div>
</div>
</div>
</center>
</body>



</html>