/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.24
 * Generated at: 2024-10-11 05:39:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import model.Product;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class updateData_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(11);
    _jspx_imports_classes.add("model.Product");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("javax.persistence.Query");
    _jspx_imports_classes.add("javax.persistence.Persistence");
    _jspx_imports_classes.add("java.sql.SQLException");
    _jspx_imports_classes.add("java.sql.Connection");
    _jspx_imports_classes.add("javax.persistence.EntityManagerFactory");
    _jspx_imports_classes.add("java.sql.ResultSet");
    _jspx_imports_classes.add("javax.persistence.EntityManager");
    _jspx_imports_classes.add("java.sql.PreparedStatement");
    _jspx_imports_classes.add("java.sql.DriverManager");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

String email = (String) session.getAttribute("email");
String password = (String) session.getAttribute("password");

if (email == null || password == null) {
	RequestDispatcher rd = request.getRequestDispatcher("adminLogin.jsp");
	request.setAttribute("error", "Logged Out");
	rd.forward(request, response);
} else {
	try {
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager
		.getConnection("jdbc:postgresql://localhost:5432/shopkeeper?user=postgres&password=root");
		PreparedStatement ps = con.prepareStatement("select * from users where user_email=?");
		ps.setString(1, email);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
	String dbPassword = rs.getString("user_password");
	if (password.equals(dbPassword)) {

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Update Data</title>\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("	font-family: Arial, sans-serif;\r\n");
      out.write("	margin: 0;\r\n");
      out.write("	padding: 0;\r\n");
      out.write("	background-color: #f9f9f9;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".admin-container {\r\n");
      out.write("	max-width: 1200px;\r\n");
      out.write("	margin: 40px auto;\r\n");
      out.write("	padding: 20px;\r\n");
      out.write("	background-color: #fff;\r\n");
      out.write("	border: 1px solid #ddd;\r\n");
      out.write("	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".admin-header {\r\n");
      out.write("	background-color: #337ab7;\r\n");
      out.write("	color: #fff;\r\n");
      out.write("	padding: 30px 10px;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	border-bottom: 1px solid #337ab7;\r\n");
      out.write("	position: relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".admin-header h1 {\r\n");
      out.write("	margin-top: 0;\r\n");
      out.write("	font-size: 24px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".logout-button {\r\n");
      out.write("	position: absolute;\r\n");
      out.write("	top: 10px;\r\n");
      out.write("	right: 10px;\r\n");
      out.write("	background-color: #e74c3c;\r\n");
      out.write("	color: #fff;\r\n");
      out.write("	padding: 10px 20px;\r\n");
      out.write("	border: none;\r\n");
      out.write("	font-size: 16px;\r\n");
      out.write("	cursor: pointer;\r\n");
      out.write("	border-radius: 5px;\r\n");
      out.write("	box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".logout-button:hover {\r\n");
      out.write("	background-color: #c0392b;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* new css for tables */\r\n");
      out.write(".table-container {\r\n");
      out.write("	overflow-x: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table {\r\n");
      out.write("	border-collapse: collapse;\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	border: 1px solid #ddd;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("th, td {\r\n");
      out.write("	border: 1px solid #ddd;\r\n");
      out.write("	padding: 10px;\r\n");
      out.write("	text-align: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("th {\r\n");
      out.write("	background-color: #3498db;\r\n");
      out.write("	color: #fff;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("tr:nth-child(even) {\r\n");
      out.write("	background-color: #f9f9f9;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("tr:hover {\r\n");
      out.write("	background-color: #f2f2f2;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("img {\r\n");
      out.write("	width: 100px;\r\n");
      out.write("	height: 100px;\r\n");
      out.write("	border-radius: 5%;\r\n");
      out.write("	margin: 10px;\r\n");
      out.write("	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".update-button {\r\n");
      out.write("	background-color: #337ab7;\r\n");
      out.write("	color: #fff;\r\n");
      out.write("	padding: 10px 20px;\r\n");
      out.write("	border: none;\r\n");
      out.write("	font-size: 16px;\r\n");
      out.write("	cursor: pointer;\r\n");
      out.write("	border-radius: 5px;\r\n");
      out.write("	box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".update-button:hover {\r\n");
      out.write("	background-color: #23527c;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".admin-footer {\r\n");
      out.write("	background-color: #f0f0f0;\r\n");
      out.write("	padding: 10px;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	clear: both;\r\n");
      out.write("	border-top: 1px solid #ddd;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".admin-footer p {\r\n");
      out.write("	margin-bottom: 0;\r\n");
      out.write("	font-size: 14px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn {\r\n");
      out.write("	padding: 10px 20px;\r\n");
      out.write("	border-radius: 10px;\r\n");
      out.write("	border: none;\r\n");
      out.write("	color: white;\r\n");
      out.write("	cursor: pointer;\r\n");
      out.write("	background-color: #4CAF50;\r\n");
      out.write("	width: 48%;\r\n");
      out.write("	font-size: 16px;\r\n");
      out.write("	margin: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn:hover {\r\n");
      out.write("	background-color: #3e8e41;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".success {\r\n");
      out.write("	color: #2ecc71;\r\n");
      out.write("	font-size: 18px;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("	margin-bottom: 20px;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".error {\r\n");
      out.write("	color: #e74c3c;\r\n");
      out.write("	font-size: 16px;\r\n");
      out.write("	margin-bottom: 10px;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"admin-container\">\r\n");
      out.write("		<div class=\"admin-header\">\r\n");
      out.write("			<h1>Update Data</h1>\r\n");
      out.write("			<p>This page allows you to update data in the database.</p>\r\n");
      out.write("			<a href=\"logout\" class=\"logout-button\">Logout</a>\r\n");
      out.write("		</div>\r\n");
      out.write("		<h3 class=\"success\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${operation}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h3>\r\n");
      out.write("		<h3 class=\"error\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${error}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h3>\r\n");
      out.write("		<div class=\"table-container\">\r\n");
      out.write("			<table class=\"data-table\">\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th>ID</th>\r\n");
      out.write("					<th>Category</th>\r\n");
      out.write("					<th>Image</th>\r\n");
      out.write("					<th>Name</th>\r\n");
      out.write("					<th>Price</th>\r\n");
      out.write("					<th>Quantity</th>\r\n");
      out.write("					<th>Quantity Unit</th>\r\n");
      out.write("					<th>Update</th>\r\n");
      out.write("				</tr>\r\n");
      out.write("				");

				EntityManagerFactory emf = Persistence.createEntityManagerFactory("shop");
				EntityManager em = emf.createEntityManager();
				Query query = em.createQuery("select p from Product p");
				List<Product> productList = query.getResultList();
				if (productList != null) {
					for (Product product : productList) {
				
      out.write("\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td>");
      out.print(product.getId());
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(product.getCategory());
      out.write("</td>\r\n");
      out.write("					<td><img src=\"");
      out.print(product.getImage());
      out.write("\" alt=\"Product Image\"></td>\r\n");
      out.write("					<td>");
      out.print(product.getName());
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(product.getPrice());
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(product.getQuantity());
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(product.getQuantityUnit());
      out.write("</td>\r\n");
      out.write("					<td>\r\n");
      out.write("					<form action=\"updateProduct.jsp\" method=\"post\">\r\n");
      out.write("							<input type=\"hidden\" name=\"id\" value=\"");
      out.print(product.getId());
      out.write("\">\r\n");
      out.write("							<input type=\"hidden\" name=\"category\" value=\"");
      out.print(product.getCategory());
      out.write("\">\r\n");
      out.write("							<input type=\"hidden\" name=\"image\" value=\"");
      out.print(product.getImage());
      out.write("\">\r\n");
      out.write("							<input type=\"hidden\" name=\"name\" value=\"");
      out.print(product.getName());
      out.write("\">\r\n");
      out.write("							<input type=\"hidden\" name=\"price\" value=\"");
      out.print(product.getPrice());
      out.write("\">\r\n");
      out.write("							<input type=\"hidden\" name=\"quantity\" value=\"");
      out.print(product.getQuantity());
      out.write("\">\r\n");
      out.write("							<input type=\"hidden\" name=\"quantityunit\" value=\"");
      out.print(product.getQuantityUnit());
      out.write("\">\r\n");
      out.write("							<button class=\"update-button\" type=\"submit\">Update</button>\r\n");
      out.write("						</form>\r\n");
      out.write("					\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				");

				}
				}
				
      out.write("\r\n");
      out.write("			</table>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<button class=\"btn\" onclick=\"location.href='adminHome.jsp'\">");
      out.print("<");
      out.write("</button>\r\n");
      out.write("		<button class=\"btn\" onclick=\"location.href='updateData.jsp'\">&#10227;</button>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"admin-footer\">\r\n");
      out.write("			<p>Made With ❤ &copy; 2024 GloceryNow</p>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");

} else {
RequestDispatcher rd = request.getRequestDispatcher("adminLogin.jsp");
request.setAttribute("error", "Invalid email or password");
rd.forward(request, response);
}
} else {
RequestDispatcher rd = request.getRequestDispatcher("adminLogin.jsp");
request.setAttribute("error", "Invalid email or password");
rd.forward(request, response);
}
} catch (ClassNotFoundException | SQLException e) {
e.printStackTrace();
}
}

    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
