/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2021-10-16 13:32:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import com.shop.dto.Customer;

public final class shopnowform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("java.sql.ResultSet");
    _jspx_imports_classes.add("com.shop.dto.Customer");
    _jspx_imports_classes.add("java.sql.PreparedStatement");
    _jspx_imports_classes.add("java.sql.DriverManager");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Delivery form</title>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"computershop.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\"\r\n");
      out.write("    integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\r\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"\r\n");
      out.write("    integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\"\r\n");
      out.write("    crossorigin=\"anonymous\"></script>\r\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("    integrity=\"sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx\"\r\n");
      out.write("    crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("  <body  style=\"background-color: yellow;\">\r\n");

response.addHeader("pragma ", "no-cache ");
response.addHeader(" cache-control", "nostore");
response.addHeader("expire ", "0");

      out.write("\r\n");
      out.write("\r\n");

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
      out.write("<div>\r\n");
      out.write("    <div class=\"left\">\r\n");
      out.write("      <header class=\"header\">\r\n");
      out.write("        <!---- left class for logo -->\r\n");
      out.write("\r\n");
      out.write("        <a href=\"home.jsp\">HOME</a> &nbsp;&nbsp;&nbsp;\r\n");
      out.write("\r\n");
      out.write("        <a href=\"about.jsp\">ABOUT US</a>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\r\n");
      out.write("        <a href=\"contact.jsp\">CONTACT</a>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("        <a href=\"help.jsp\">HELP</a>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("       <a href=\"#\" ><button class=\"leftright\" type=\"button\"> YOUR CART</button></a>\r\n");
      out.write("              <a href=\"LogoutController\" ><button class=\"leftright\" type=\"button\"> LOG OUT</button></a>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!---- mid bar for navbar -->\r\n");
      out.write("\r\n");
      out.write("  <div class=\"mid\">\r\n");
      out.write("    <img src=\"images/logo.jpg\" alt=\"\" height=\"50px\" width=\"50px\" style=\"float: left;\">\r\n");
      out.write("\r\n");
      out.write("    <ul class=\"navbar\">\r\n");
      out.write("      <div class=\"btn-group\">\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-danger dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("          aria-expanded=\"false\">\r\n");
      out.write("          PC COMPONENT\r\n");
      out.write("        </button>\r\n");
      out.write("        <div class=\"dropdown-menu\">\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"keyboardController\">KeyBoard</a>\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"mouseController\">MOUSE</a>\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"motherboardController\">MOTHERBOARD</a>\r\n");
      out.write("\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"ramController\">RAM</a>\r\n");
      out.write("\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"monitorController\">MONITOR</a>\r\n");
      out.write("\r\n");
      out.write("           </div>\r\n");
      out.write("      </div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <li><a href=\"#\">GAMING ZONE</a></li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("      <li> <a href=\"#\">TOP BRANDS</a></li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("      <li><a href=\"#\">OFFERS</a></li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("      <li> <a href=\"#\">EXPIERIENCE ZONE</a>\r\n");
      out.write("      <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("      <li> <a href=\"#\">BLOG</a></li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<center>\r\n");
      out.write(" <div class=\"peripheral\">\r\n");
      out.write("<h1>Delivery Location Form </h1>\r\n");
      out.write(" <h2 style=\"color: red;\">\r\n");
	String m = (String)request.getAttribute("mesg");
	if (m != null)
	out.println(m);
      out.write("\r\n");
      out.write("\t</h2>\r\n");
      out.write(" \r\n");
      out.write(" <form  action=\"shopnow\" method=\"post\"  >\r\n");
      out.write(" <div class=\"form-group\">\r\n");
      out.write("    <label for=\"exampleInputEmail1\">Phone</label>\r\n");
      out.write("    <input type=\"text\" class=\"phone\" id=\"phone\"  name=\"phone\" readonly=\"readonly\" value=\"");
      out.print(cst.getPhone() );
      out.write("\">\r\n");
      out.write("   \r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"form-group\">\r\n");
      out.write("      <label for=\"exampleInputEmail1\">Delivery Address</label>\r\n");
      out.write("  \r\n");
      out.write("<input type=\"text\" class=\"address\" id=\"address\" name=\"address\" placeholder=\"Enter your address\" required>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"form-group\">\r\n");
      out.write("    <label for=\"exampleInputEmail1\">Pincode</label>\r\n");
      out.write("  \r\n");
      out.write("   <input type=\"text\" class=\"pincode\" name=\"pincode\" id=\"pincode\"  placeholder=\"Enter your pincode\" autocomplete=\"pin\" required > </div>\r\n");
      out.write("\r\n");
      out.write("   <div class=\"form-group\">\r\n");
      out.write("    \r\n");
      out.write("<label for=\"city\"  id=\"city\" name=\"city\"  class=\"city\">City </label>\r\n");
      out.write("<select id=\"city\" name=\"city\" class=\"city\" required>\r\n");
      out.write("  <option value=\"indore\">Indore</option>\r\n");
      out.write("  <option value=\"delhi\">Delhi</option>\r\n");
      out.write("  <option value=\"bhopal\">Jhansi</option>\r\n");
      out.write("  <option value=\"bangalore\">Bangalore</option>\r\n");
      out.write("</select>  \r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("<label for=\"State\" id=\"state\" name=\"state\" class=\"state\">State</label>\r\n");
      out.write("  \r\n");
      out.write("<select id=\"state\" name=\"state\" class=\"state\" required>\r\n");
      out.write("  <option value=\"mp\">Madhya pradesh</option>\r\n");
      out.write("  <option value=\"delhi\">Delhi</option>\r\n");
      out.write("  <option value=\"up\">Jhansi</option>\r\n");
      out.write("  <option value=\"kranataka\">karnataka</option>\r\n");
      out.write("</select>  \r\n");
      out.write(" \r\n");
      out.write("  </div>\r\n");
      out.write(" \r\n");
      out.write("  <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\r\n");
      out.write("</form>\r\n");
      out.write(" </div>\r\n");
      out.write("</center>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
