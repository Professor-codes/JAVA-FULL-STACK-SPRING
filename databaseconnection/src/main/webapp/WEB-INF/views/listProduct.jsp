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

	<%
	List<ProductBean> productData = (List<ProductBean>) request.getAttribute("products");
	%>

	<table border="1">
		<tr>
			<th>Name</th>
			<th>Category</th>
			<th>Quantity</th>
			<th>Price</th>
		</tr>

		<%
		for (ProductBean products : productData) {
			out.print("<tr>");
			out.print("<td>" + products.getProductName() + "</td><td>" + products.getProductCategory() + "</td><td>"
			+ products.getProductQuantity() + "</td><td>" + products.getProductPrice() + "</td>");
			out.print("</tr>");
		}
		%>
	</table>
</body>
</html>