<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.shop.dto.Customer"%>
<%@page import="com.shop.dto.Product"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
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
<title><%String n = (String)session.getAttribute("user");  %>
	</title>
    
<body>
<%
response.addHeader("pragma ", "no-cache ");
response.addHeader(" cache-control", "nostore");
response.addHeader("expire ", "0");
%>
  <div>
    <div class="left">
      <header class="header">
        <!---- left class for logo -->

        <a href="home.jsp">HOME</a> &nbsp;&nbsp;&nbsp;

        <a href="about.jsp">ABOUT US</a>&nbsp;&nbsp;&nbsp;

        <a href="contact.jsp">CONTACT</a>&nbsp;&nbsp;&nbsp;
        <a href="help.jsp">HELP</a>&nbsp;&nbsp;&nbsp;
    
      <a href="adminLogin.jsp" >  <button class="leftright" type="button"> Admin LOG IN</button>
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
          <a class="dropdown-item" href="#">KeyBoard</a>
          <a class="dropdown-item" href="#">MOUSE</a>
          <a class="dropdown-item" href="#">MOTHERBOARD</a>

          <a class="dropdown-item" href="#">RAM</a>

          <a class="dropdown-item" href="#">HARD DISK</a>

          <a class="dropdown-item" href="#"></a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">Separated link</a>
        </div>
      </div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;


      <li><a href="#">GAMING ZONE</a></li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <li> <a href="#">TOP BRANDS</a></li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <li><a href="#">OFFERS</a></li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <li> <a href="#">EXPIERIENCE ZONE</a>
      <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <li> <a href="#">BLOG</a></li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

      <div>
           <a href="#" ><button class="leftright" type="button"> YOUR CART</button></a>
              <a href="LogoutController" ><button class="leftright" type="button"> LOG OUT</button></a>
         </ul>
  </div>
  </div>
  <div class="peripheral">
    <center>
      
      <h2>
  <% String user = (String)session.getAttribute("user"); 
	if(user != null)
	out.println(  "YOUR CART   " +user);
	else
		response.sendRedirect("mouse.jsp");

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
</div>
<div >
<%
ArrayList<Product> list1 =(ArrayList<Product>) request.getAttribute("details");
	String ms = (String)request.getParameter("msg"); 
	if(ms!=null)
		out.println("<h2>" + ms + "</h2>");
				if(!(list1 == null) || !(list1.isEmpty())) {
					%>
				</h2>
				<table style="width:175%;text-align:center; color:white;"    class="table table-hover table-dark" >
					<tr>
						<th>PHONE</th>
						<th>CUSTOMER NAME</th>
						<th>IMAGE</th>
						<th>PRODUCT ID</th>
						<th>PRODUCT NAME</th>
						<th>MODEL NUMBER</th>
						<th>PRICE</th>
						<th>SHOP NOW</th>
						<th>DELETE ITEM</th>
						
					</tr>
					<%
					for (Product pt : list1) {
					%>

					<tr>
						<td><%=cst.getPhone()%></td>&nbsp;&nbsp;
						<td><%=cst.getName() %></td>&nbsp;&nbsp;
						<td> <img alt="" src="<%=pt.getPic()%>" style="max-height:50%; max-width:70%"> </td>
						<td><%=pt.getId()%></td>&nbsp;&nbsp;
						<td><%=pt.getPname()%></td>&nbsp;&nbsp;
						<td><%=pt.getModel()%></td>&nbsp;&nbsp;
						<td><%=pt.getPrice()%></td>&nbsp;&nbsp;
				<td><a class="btn btn-danger" href="shopnow?id=<%=pt.getId()%>&cname=<%=cst.getName()%>">SHOP NOW</a></td>
	<td><a class="btn btn-warning" href="delete?id=<%=pt.getId()%>&phone=<%=cst.getPhone()%>" onclick="return confirm('Are you sure, Do you want to delete ')">DELETE ITEM</a></td>
	
				</tr>			
									
													
					<%
					}
					%>


				</table>

				<%
				} else {
				out.println("CART NOT AVAILAIBLE");

				}
				%>

</div>

		</h2>

    </center>
  </div>
  </h2>


  <br>
  <div class="right">

  </div>

  <br>
<%
response.addHeader("pragma ", "no-cache ");
response.addHeader(" cache-control", "nostore");
response.addHeader("expire ", "0");
%>
</body>
</html>