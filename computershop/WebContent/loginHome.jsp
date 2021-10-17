<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <title>Computer Shop Management System</title>
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
<%
	response.addHeader("pragma ", "no-cache ");
	response.addHeader(" cache-control", "nostore");
	response.addHeader("expire ", "0");


%>



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
  <div class="peripheral">
    <center>
  <h2>
<% String user = (String)session.getAttribute("user"); 
	if(user != null)
	out.println("Welcome  " +user);
	else
		response.sendRedirect("login.jsp");

%>


</h2>

  
      <u>
        <h2>PERIPHERALS</h2>
      </u>
    </center>
  </div>


  <br>
  <div class=right>
  <div class="pic">
    <div class="image">
      <a href="mouseController"> <img src="images/1.jpg" alt="" id="myho">MOUSE PAD</a>&nbsp;&nbsp;&nbsp;&nbsp;

      <a href="motherboardController"> <img src="images/2.jpg" alt="" id="myho">MOTHER BOARD</a>&nbsp;&nbsp;&nbsp;&nbsp;

      <a href="cpuController"> <img src="images/3.jpg" alt="" id="myho">CPU</a>&nbsp;&nbsp;&nbsp;&nbsp;

     
      <a href="monitorController"> <img src="images/5.jpg" alt="" id="myho">MONITOR </a>&nbsp;&nbsp;&nbsp;&nbsp;

      <a href="ramController"> <img src="images/6.jpg" alt="" id="myho">RAM</a>&nbsp;&nbsp;&nbsp;&nbsp;

      <a href="fanController"> <img src="images/7.jpg" alt="" id="myho">FAN</a>&nbsp;&nbsp;&nbsp;&nbsp;

      <a href="cpuController"> <img src="images/8.jpg" alt="" id="myho">CPU</a>&nbsp;&nbsp;&nbsp;&nbsp;

      <a href="#"> <img src="images/9.jpg" alt="" id="myho">NETWORKING</a>&nbsp;&nbsp;&nbsp;&nbsp;

      <a href="#"> <img src="images/10.jpg" alt="" id="myho">BLOCKCHAIN</a>&nbsp;&nbsp;&nbsp;&nbsp;
	
	  <a href="keyboardController"> <img src="images/4.jpg" alt="" id="myho">KYBOARD</a>&nbsp;&nbsp;&nbsp;&nbsp;
	
    </div>
  </div>
</div>
  <br>
  <div class="footer">
    <div style="float: left; margin-left: 2px;"> <img src="images/logo.jpg" alt="" height="100px" width="100px"
        style="float: left;">

      <a href="#" "> <h3 style=" color:white;">PIYUSH COMPUTER SHOP</h3><br></a>
    </div>
    <center>
      <div style="text-align: center; float: left; " class="footerleft">
        <h3 style="color:red;">INFORMATION</h3>
        <ul>
          <li> <a href="#">Site map</a></li>
          <li> <a href="#">Bank Details</a></li>
          <li> <a href="#">Shipping & Delivery </a></li>
          <li><a href="#">Cancellation & Refund</a></li>
          <li><a href="#">Payment Method</a></li>
        </ul>
      </div>
    </center>
    <div>
      <center>
        <div class="centrediv" style="text-align: center; float: left;">
          <a href="https://www.facebook.com" class="fa fa-facebook"> </a>&nbsp;

          <a href="https://www.twitter.com" class="fa fa-twitter"></a>&nbsp;

          <a href="https://www.instagram.com" class="fa fa-instagram"> </a>&nbsp;

          <a href="https://www.linkedin.com" class="fa fa-linkedin"></a>&nbsp;

          <br> <br><br>
          <span class="fa fa-star checked"></span>
          <span class="fa fa-star checked"></span>
          <span class="fa fa-star checked"></span>
          <span class="fa fa-star"></span>
          <span class="fa fa-star"></span>
        </div>
      </center>

    </div>
    <div style="text-align: right; " class="footerright">
      <ul>
        <h3 style="color: red; ">CUSTOMER SERVICE</h3>
        <li> <a href="#">My Account</a></li>
        <li><a href="#">Order History</a></li>
        <li><a href="#">RETURNS </a></li>
        <li><a href="#">NEWS LETTER </a></li>
        <li><a href="#">GIFT CERTIFICATES </a></li>
      </ul>
    </div>
  </div>
</body>

</html>