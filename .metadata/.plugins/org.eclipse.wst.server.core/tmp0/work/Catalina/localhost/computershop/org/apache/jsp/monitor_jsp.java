/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2021-10-17 08:41:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.shop.dto.Customer;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import com.shop.dto.Product;
import java.util.ArrayList;

public final class monitor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.sql.Connection");
    _jspx_imports_classes.add("com.shop.dto.Product");
    _jspx_imports_classes.add("java.sql.ResultSet");
    _jspx_imports_classes.add("com.shop.dto.Customer");
    _jspx_imports_classes.add("java.util.HashMap");
    _jspx_imports_classes.add("java.sql.PreparedStatement");
    _jspx_imports_classes.add("java.sql.DriverManager");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"computershop.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\"\r\n");
      out.write("\tintegrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\"\r\n");
      out.write("\tcrossorigin=\"anonymous\">\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"\r\n");
      out.write("\tintegrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\"\r\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("\tintegrity=\"sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx\"\r\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("<title>monitor</title>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");

response.addHeader("pragma ", "no-cache ");
response.addHeader(" cache-control", "nostore");
response.addHeader("expire ", "0");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write(" <h2style=\"color: red;\">\r\n");

	String s = (String)request.getAttribute("message");
	if (s != null)
	out.println(s);
      out.write("\r\n");
      out.write("\t</h2> \r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<div class=\"left\">\r\n");
      out.write("\t\t\t<header class=\"header\">\r\n");
      out.write("\t\t\t\t<!---- left class for logo -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<a href=\"home.jsp\">HOME</a> &nbsp;&nbsp;&nbsp; <a href=\"about.jsp\">ABOUT\r\n");
      out.write("\t\t\t\t\tUS</a>&nbsp;&nbsp;&nbsp; <a href=\"contact.jsp\">CONTACT</a>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t<a href=\"help.jsp\">HELP</a>&nbsp;&nbsp;&nbsp; <a\r\n");
      out.write("\t\t\t\t\thref=\"adminLogin.jsp\">\r\n");
      out.write("\t\t\t\t\t<button class=\"leftright\" type=\"button\">Admin LOG IN</button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!---- mid bar for navbar -->\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"mid\">\r\n");
      out.write("\t\t<img src=\"images/logo.jpg\" alt=\"\" height=\"50px\" width=\"50px\"\r\n");
      out.write("\t\t\tstyle=\"float: left;\">\r\n");
      out.write("\r\n");
      out.write("\t\t<ul class=\"navbar\">\r\n");
      out.write("\t\t\t<div class=\"btn-group\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-danger dropdown-toggle\"\r\n");
      out.write("\t\t\t\t\tdata-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("\t\t\t\t\tPC COMPONENT</button>\r\n");
      out.write("\t\t\t\t<div class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t<a class=\"dropdown-item\" href=\"#\">KeyBoard</a> <a\r\n");
      out.write("\t\t\t\t\t\tclass=\"dropdown-item\" href=\"#\">MOUSE</a> <a class=\"dropdown-item\"\r\n");
      out.write("\t\t\t\t\t\thref=\"#\">MOTHERBOARD</a> <a class=\"dropdown-item\" href=\"#\">RAM</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<a class=\"dropdown-item\" href=\"#\">HARD DISK</a> <a\r\n");
      out.write("\t\t\t\t\t\tclass=\"dropdown-item\" href=\"#\"></a>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-divider\"></div>\r\n");
      out.write("\t\t\t\t\t<a class=\"dropdown-item\" href=\"#\">Separated link</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t<li><a href=\"#\">GAMING ZONE</a></li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t<li><a href=\"#\">TOP BRANDS</a></li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t<li><a href=\"#\">OFFERS</a></li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t<li><a href=\"#\">EXPIERIENCE ZONE</a>\r\n");
      out.write("\t\t\t<li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t<li><a href=\"#\">BLOG</a></li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t<a href=\"#\"><button class=\"leftright\" type=\"button\">\r\n");
      out.write("\t\t\t\t\tYOUR CART</button></a>\r\n");
      out.write("\t\t\t<a href=\"login.jsp\"><button class=\"leftright\" type=\"button\">\r\n");
      out.write("\t\t\t\t\tLOG OUT</button></a>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"peripheral\">\r\n");
      out.write("\t\t<center>\r\n");
      out.write("\t\t\t<h2>\r\n");
      out.write("\t\t\t\t");

				String user = (String) session.getAttribute("user");
				if (user != null)
					out.println("Welcome  " + user);
				else
					response.sendRedirect("login.jsp");

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
				
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</h2>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<u>\r\n");
      out.write("\t\t\t\t<h2>MONITOR</h2>\r\n");
      out.write("\t\t\t</u>\r\n");
      out.write("\t\t</center>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<div >\r\n");
      out.write("\t\r\n");
      out.write("\t\t<h2>\r\n");
      out.write("\t\t\t");

			ArrayList<Product> lst = (ArrayList<Product>) request.getAttribute("LIST");
			if (!(lst == null) || !(lst.isEmpty())) {
			
      out.write("\r\n");
      out.write("\t\t</h2>\r\n");
      out.write("\t\t\t\t<table style=\"width:175%;text-align:center; color:white;\"    class=\"table table-hover table-dark\"   >\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>PRODUCT ID</th>\r\n");
      out.write("\t\t\t\t<th>IMAGES</th>\r\n");
      out.write("\t\t\t\t<th>PRODUCT NAME</th>\r\n");
      out.write("\t\t\t\t<th>MODEL NUMBER</th>\r\n");
      out.write("\t\t\t\t<th>PRICE</th>\r\n");
      out.write("\t\t\t\t<th>ADD TO CART</th>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");

			for (Product pt : lst) {
			
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(pt.getId());
      out.write("</td>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t<td> <img alt=\"\" src=\"");
      out.print(pt.getPic());
      out.write("\" style=\"max-height:50%; max-width:70%\"> </td>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<td>");
      out.print(pt.getPname());
      out.write("</td>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t<td>");
      out.print(pt.getModel());
      out.write("</td>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t<td>");
      out.print(pt.getPrice());
      out.write("</td>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<td><a class=\"btn btn-warning\"\r\n");
      out.write("\t\t\t\t\thref=\"cart?id=");
      out.print(pt.getId());
      out.write("&phone=");
      out.print(cst.getPhone());
      out.write("\">ADD\r\n");
      out.write("\t\t\t\t\t\tTO CART</a>&nbsp;&nbsp;&nbsp;&nbsp;<br>\r\n");
      out.write("\t\t\t\t\t <br></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");

			}
			
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t");

		} else {
		out.println("MONITOR NOT AVAILAIBLE");

		}
		
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</h2>\r\n");
      out.write("  \r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
