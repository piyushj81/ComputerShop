/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2021-10-16 13:23:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"computershop.css\">\r\n");
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
      out.write("\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>CONTACTS </title>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  <div>\r\n");
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
      out.write("       <a href=\"adminLogin.jsp\" > <button class=\"leftright\" type=\"button\">Admin LOG IN</button>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("          <a class=\"dropdown-item\" href=\"#\">KeyBoard</a>\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">MOUSE</a>\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">MOTHERBOARD</a>\r\n");
      out.write("\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">RAM</a>\r\n");
      out.write("\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">HARD DISK</a>\r\n");
      out.write("\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\"></a>\r\n");
      out.write("          <div class=\"dropdown-divider\"></div>\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Separated link</a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <li><a href=\"#\">GAMING ZONE</a></li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("      <li> <a href=\"topbrand.jsp\">TOP BRANDS</a></li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("      <li><a href=\"#\">OFFERS</a></li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("      <li> <a href=\"#\">EXPIERIENCE ZONE</a>\r\n");
      out.write("      <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("      <li> <a href=\"#\">BLOG</a></li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\r\n");
      out.write("      <div>\r\n");
      out.write("        <form class=\"form-inline my-2 my-lg-0\">\r\n");
      out.write("          <a href=\"customerAdmit.jsp\" class=\"btn btn-outline-primary my-2 my-sm-0\">REGISTER</a>&nbsp;&nbsp;\r\n");
      out.write("          <a href=\"login.jsp\" class=\"btn btn-outline-danger my-2 my-sm-0\"> Login</a>\r\n");
      out.write("        </form>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"peripheral\">\r\n");
      out.write("    <center>\r\n");
      out.write("      <u>\r\n");
      out.write("        <h2>Contact</h2>\r\n");
      out.write("      </u>\r\n");
      out.write("    <div>  \r\n");
      out.write("  You can Email us at pjpiyush0712@gmail.com.<br>\r\n");
      out.write(" &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;call us at 24*7 6232642872,8664645798,8675757769<br><iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3679.3016431917385!2d75.89010099422897!3d22.75418432359952!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x396302a9220079c1%3A0xb47c202bce6b7c67!2sShri%20Parshwanath%20Digamber%20Jain%20Mandir!5e0!3m2!1sen!2sin!4v1631157982248!5m2!1sen!2sin\" width=\"400\" height=\"300\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\"></iframe>\r\n");
      out.write("    </div>\r\n");
      out.write("    </center>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <br>\r\n");
      out.write("  <br>\r\n");
      out.write("  <div class=\"footer\">\r\n");
      out.write("    <div style=\"float: left; margin-left: 2px;\"> <img src=\"images/logo.jpg\" alt=\"\" height=\"100px\" width=\"100px\"\r\n");
      out.write("        style=\"float: left;\">\r\n");
      out.write("\r\n");
      out.write("      <a href=\"#\" \"> <h3 style=\" color:white;\">PIYUSH COMPUTER SHOP</h3><br></a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <center>\r\n");
      out.write("      <div style=\"text-align: center; float: left; \" class=\"footerleft\">\r\n");
      out.write("        <h3 style=\"color:red;\">INFORMATION</h3>\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li> <a href=\"#\">Site map</a></li>\r\n");
      out.write("          <li> <a href=\"#\">Bank Details</a></li>\r\n");
      out.write("          <li> <a href=\"#\">Shipping & Delivery </a></li>\r\n");
      out.write("          <li><a href=\"#\">Cancellation & Refund</a></li>\r\n");
      out.write("          <li><a href=\"#\">Payment Method</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    </center>\r\n");
      out.write("    <div>\r\n");
      out.write("      <center>\r\n");
      out.write("        <div class=\"centrediv\" style=\"text-align: center; float: left;\">\r\n");
      out.write("          <a href=\"https://www.facebook.com\" class=\"fa fa-facebook\"> </a>&nbsp;\r\n");
      out.write("\r\n");
      out.write("          <a href=\"https://www.twitter.com\" class=\"fa fa-twitter\"></a>&nbsp;\r\n");
      out.write("\r\n");
      out.write("          <a href=\"https://www.instagram.com\" class=\"fa fa-instagram\"> </a>&nbsp;\r\n");
      out.write("\r\n");
      out.write("          <a href=\"https://www.linkedin.com\" class=\"fa fa-linkedin\"></a>&nbsp;\r\n");
      out.write("\r\n");
      out.write("          <br> <br><br>\r\n");
      out.write("          <span class=\"fa fa-star checked\"></span>\r\n");
      out.write("          <span class=\"fa fa-star checked\"></span>\r\n");
      out.write("          <span class=\"fa fa-star checked\"></span>\r\n");
      out.write("          <span class=\"fa fa-star\"></span>\r\n");
      out.write("          <span class=\"fa fa-star\"></span>\r\n");
      out.write("        </div>\r\n");
      out.write("      </center>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <div style=\"text-align: right; \" class=\"footerright\">\r\n");
      out.write("      <ul>\r\n");
      out.write("        <h3 style=\"color: red; \">CUSTOMER SERVICE</h3>\r\n");
      out.write("        <li> <a href=\"#\">My Account</a></li>\r\n");
      out.write("        <li><a href=\"#\">Order History</a></li>\r\n");
      out.write("        <li><a href=\"#\">RETURNS </a></li>\r\n");
      out.write("        <li><a href=\"#\">NEWS LETTER </a></li>\r\n");
      out.write("        <li><a href=\"#\">GIFT CERTIFICATES </a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
