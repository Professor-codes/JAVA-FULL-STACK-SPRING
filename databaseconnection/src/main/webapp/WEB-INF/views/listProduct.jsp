<%@page import="com.bean.ProductBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Product List</h1>
	<hr>
	<br>

	<button>
		<a href="addproduct" style="color: black; text-decoration: none;">Add
			Product </a>
	</button>
	<button>
		<a href=deleteproductbyname style="color: black; text-decoration: none;">Delete
			Product </a>
	</button>
	<br>
	<br>

	<%
	List<ProductBean> productData = (List<ProductBean>) request.getAttribute("products");
	%>

	<table border="1">
		<tr>
			<th>Name</th>
			<th>Category</th>
			<th>Quantity</th>
			<th>Price</th>
			<th>Action</th>
		</tr>

		<%
		for (ProductBean products : productData) {
			out.print("<tr>");
			out.print("<td>" + products.getProductName() + "</td><td>" + products.getProductCategory() + "</td><td>"
			+ products.getProductQuantity() + "</td><td>" + products.getProductPrice()
			+ "</td><td><a href='deleteproduct?productId=" + products.getProductId() + "'>Delete</a></td>");
			out.print("</tr>"); 
		}
		%>
	</table>
</body>
</html>