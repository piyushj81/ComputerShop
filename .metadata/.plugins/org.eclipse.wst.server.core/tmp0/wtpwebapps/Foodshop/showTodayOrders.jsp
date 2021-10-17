<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <link rel="shortcut icon" type="image/x-icon" href="images/zappy-logo.ico" />
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Todays Order</title>
<style type="text/css">
table { 
  width: 100%; 
  border-collapse: collapse; 
}
/* Zebra striping */
tr:nth-of-type(odd) { 
  background: #eee; 
}
/* Zebra striping */
tr:nth-of-type(even) { 
  background: #eee; 
}
th { 
  background: #333; 
  color: white; 
  font-weight: bold; 
}
td, th { 
  padding: 6px; 
  border: 1px solid #ccc; 
  text-align: left; 
}
@media 
only screen and (max-width: 760px),
(min-device-width: 768px) and (max-device-width: 1024px)  {

	/* Force table to not be like tables anymore */
	table, thead, tbody, th, td, tr { 
		display: block; 
	}
	
	/* Hide table headers (but not display: none;, for accessibility) */
	thead tr { 
		position: absolute;
		top: -9999px;
		left: -9999px;
	}
	
	tr { border: 1px solid #ccc; }
	
	td { 
		/* Behave  like a "row" */
		border: none;
		border-bottom: 1px solid #eee; 
		position: relative;
		padding-left: 50%; 
	}
	
	td:before { 
		/* Now like a table header */
		position: absolute;
		/* Top/left values mimic padding */
		top: 6px;
		left: 6px;
		width: 45%; 
		padding-right: 10px; 
		white-space: nowrap;
	}
	

}
</style>
</head>
<body bgcolor=#e0e0eb >
<form action="Admin.jsp" method="">
<input type="submit" value="Home" /></form>
</p1>
<p1 align="right">
<form action="adminlogout.jsp" method="">

<input type="submit" value="LogOut" /></form></p1>

<pre>
<center>
<img src="images/zappy-logo.png"></img>

<p><h1 style="background-color:white">PENDING ORDERS</h1></p>
<h1><font color="green"><%String m=(String)request.getAttribute("msg");
  if(m!=null)
  out.println(m);
 %>    
</font></h1>
<%@page import="java.util.ArrayList,bean.Product" %>
<%
ArrayList<Product> ar1=(ArrayList<Product>)request.getAttribute("LIST");
if(ar1.isEmpty())
{
%><h1 style="background-color:white">There are No Orders For Today</h1>
<% 	
}
if(ar1!=null)
{	int a2=0;
	%><table border="1" width=80%><%
			for(Product cc:ar1)
			{
				
			if(a2%4==0)
			{
			out.println("<tr>");
		    %>
     <form action="AdminOperation" method="post">
   <td>
    <center><h4>Order Id     :<%=cc.getOrderid()%></h4></center>
    <center><h4>Product Id   :<%=cc.getPid()%></h4></center>
    <center><h4>Product Name :<%=cc.getPname()%></a></h4></center>
    <center><b>Price</b>     : <%=cc.getPrice()%> Rs.<br/></center>
    <center><img src="images/<%=cc.getImage()%>" heigth="150" width="150" /></center>
    <center><b>Details</b>   : <%=cc.getDetails()%><br/></center>
    <center><b>Quantity</b>  : <%=cc.getQuantity()%></center>
 <center><b>Total Amount</b> :<%=cc.getTamount()%></center>
        <%  int st=0;
      String status="";
      st=cc.getStatus(); 
      if(st==1)
      {
    	  status="Dispatched";
      }
      else if(st==0)
      {
    	  status="Pending";
      }
      else if(st==2)
      {
    	  status="Cancelled";
      }
      else if(st==3)
      {
    	  status="Delivered";
      }
      %>
   <input type="hidden" value="<%=cc.getOrderid()%>" name="oid">
 <input type="hidden" value="<%=cc.getPname()%>" name="pname" />
   <center><b>Status</b>  :<%=status%></center>
    <center><b>To</b>     :<%=cc.getEmail()%></center>
    <center><input type="submit" value="Dispatch" name="op"/> <input type="submit" value="Cancel" name="op"/>
   </center>
   </td> 				
		</form>
	<%
			}else{
				%>

 <form action="AdminOperation" method="post">
 <td>
    <center><h4>Order Id     :<%=cc.getOrderid()%></h4></center>
    <center><h4>Product Id   :<%=cc.getPid()%></h4></center>
    <center><h4>Product Name :<%=cc.getPname()%></a></h4></center>
    <center><b>Price</b>     : <%=cc.getPrice()%> Rs.<br/></center>
    <center><img src="images/<%=cc.getImage()%>" heigth="150" width="150" /></center>
    <center><b>Details</b>   : <%=cc.getDetails()%><br/></center>
    <center><b>Quantity</b>  : <%=cc.getQuantity()%></center>
 <center><b>Total Amount</b> :<%=cc.getTamount()%></center>
    
      <%  int st=0;
      String status="";
      st=cc.getStatus(); 
      if(st==1)
      {
    	  status="Dispatched";
      }
      else if(st==0)
      {
    	  status="Pending";
      }
      else if(st==2)
      {
    	  status="Cancelled";
      }
      else if(st==3)
      {
    	  status="Delivered";
      }
      %>
      
 <input type="hidden" value="<%=cc.getPname()%>" name="pname" />
    <input type="hidden" value="<%=cc.getOrderid()%>" name="oid">
    <center><b>Status</b>  :<%=status%></center> 
    <center><b>To</b>  :<%=cc.getEmail()%></center> 
    <center><input type="submit" value="Dispatch" name="op"/> <input type="submit" value="Cancel" name="op"/>
   </center>
    </td>
</form>
				<%
			if(a2%4==3)
				out.println("</tr>");
			    	
		    }		
			a2++;

		}
%>
		</table>				
	<%
}
%>
<%
  response.addHeader("pragma", "no-cache");
  response.addHeader("cache-control", "no-store");
  response.addHeader("expire", "0");
  String admin=(String)session.getAttribute("admin");
  if(admin==null)
   response.sendRedirect("AdminLogin.jsp");
  %>

<footer class="container-fluid text-center">
  <p><h2 style="background-color:white">@ Copyright Zappy FoodShop Powered and Developed By Infoviaan</h2></p>
</footer>
</center>
</pre>
</body>
</html>