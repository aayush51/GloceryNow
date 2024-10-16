
<%@page import="model.Product"%>
<%@page import="java.util.List"%>
<%@page import="javax.persistence.Query"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%
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
%>
<!DOCTYPE html>
<html>
<head>
<title>Update Data</title>
<style>
body {
	font-family: Arial, sans-serif;
	margin: 0;
	padding: 0;
	background-color: #f9f9f9;
}

.admin-container {
	max-width: 1200px;
	margin: 40px auto;
	padding: 20px;
	background-color: #fff;
	border: 1px solid #ddd;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

.admin-header {
	background-color: #337ab7;
	color: #fff;
	padding: 30px 10px;
	text-align: center;
	border-bottom: 1px solid #337ab7;
	position: relative;
}

.admin-header h1 {
	margin-top: 0;
	font-size: 24px;
}

.logout-button {
	position: absolute;
	top: 10px;
	right: 10px;
	background-color: #e74c3c;
	color: #fff;
	padding: 10px 20px;
	border: none;
	font-size: 16px;
	cursor: pointer;
	border-radius: 5px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
}

.logout-button:hover {
	background-color: #c0392b;
}

/* new css for tables */
.table-container {
	overflow-x: auto;
}

table {
	border-collapse: collapse;
	width: 100%;
	border: 1px solid #ddd;
}

th, td {
	border: 1px solid #ddd;
	padding: 10px;
	text-align: left;
}

th {
	background-color: #3498db;
	color: #fff;
	font-weight: bold;
}

tr:nth-child(even) {
	background-color: #f9f9f9;
}

tr:hover {
	background-color: #f2f2f2;
}

img {
	width: 100px;
	height: 100px;
	border-radius: 5%;
	margin: 10px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

.update-button {
	background-color: #337ab7;
	color: #fff;
	padding: 10px 20px;
	border: none;
	font-size: 16px;
	cursor: pointer;
	border-radius: 5px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
}

.update-button:hover {
	background-color: #23527c;
}

.admin-footer {
	background-color: #f0f0f0;
	padding: 10px;
	text-align: center;
	clear: both;
	border-top: 1px solid #ddd;
}

.admin-footer p {
	margin-bottom: 0;
	font-size: 14px;
}

.btn {
	padding: 10px 20px;
	border-radius: 10px;
	border: none;
	color: white;
	cursor: pointer;
	background-color: #4CAF50;
	width: 48%;
	font-size: 16px;
	margin: 10px;
}

.btn:hover {
	background-color: #3e8e41;
}

.success {
	color: #2ecc71;
	font-size: 18px;
	font-weight: bold;
	margin-bottom: 20px;
	text-align: center;
}

.error {
	color: #e74c3c;
	font-size: 16px;
	margin-bottom: 10px;
	text-align: center;
}
</style>
</head>
<body>
	<div class="admin-container">
		<div class="admin-header">
			<h1>Update Product</h1>
			<p>This page allows you to update product in the database.</p>
			<a href="logout" class="logout-button">Logout</a>
		</div>
		<h3 class="success">${operation}</h3>
		<h3 class="error">${error}</h3>
		<div class="table-container">

			<button class="btn" onclick="location.href='adminHome.jsp'"><%="<"%></button>
			<button class="btn" onclick="location.href='updateData.jsp'">&#10227;</button>
			<table class="data-table">
				<tr>
					<th>ID</th>
					<th>Category</th>
					<th>Image</th>
					<th>Name</th>
					<th>Price</th>
					<th>Quantity</th>
					<th>Quantity Unit</th>
					<th>Update</th>
				</tr>
				<%
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("shop");
				EntityManager em = emf.createEntityManager();
				Query query = em.createQuery("select p from Product p");
				List<Product> productList = query.getResultList();
				if (productList != null) {
					for (Product product : productList) {
				%>
				<tr>
					<%
					int id = product.getId();
					String productName = product.getName();
					double quantity = product.getQuantity();
					String quantityUnit = product.getQuantityUnit();
					double price = product.getPrice();
					String categoryName = null;
					try {
						categoryName = product.getCategory().getName();
					} catch (NullPointerException npe) {
					}
					String productImage = product.getImage();
					%>
					<td><%=id%></td>
					<td><%=categoryName%></td>
					<td><img src="<%=productImage%>" alt="Product Image"></td>
					<td><%=productName%></td>
					<td><%=price%></td>
					<td><%=quantity%></td>
					<td><%=quantityUnit%></td>
					<td>
						<form action="updateProduct.jsp" method="post">
							<input type="hidden" name="id" value="<%=id%>"> <input
								type="hidden" name="category" value="<%=categoryName%>">
							<input type="hidden" name="imageurl" value="<%=productImage%>">
							<input type="hidden" name="name" value="<%=productName%>">
							<input type="hidden" name="price" value="<%=price%>"> <input
								type="hidden" name="quantity" value="<%=quantity%>"> <input
								type="hidden" name="quantityunit" value="<%=quantityUnit%>">
							<button class="update-button" type="submit">Update</button>
						</form>

					</td>

				</tr>
				<%
				}
				}
				%>
			</table>
		</div>


		<div class="admin-footer">
			<p>Made With ❤ &copy; 2024 GloceryNow</p>
		</div>
	</div>
</body>
</html>

<%
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
%>