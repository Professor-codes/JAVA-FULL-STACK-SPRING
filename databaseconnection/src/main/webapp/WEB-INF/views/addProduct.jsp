<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Add New Product</h1>
<hr>
<br>

<form action="saveproduct" method="post">
	Product name : <input type="text" name="productName" value="${productBean.getProductName()}"/>
	<span style="color:red">${productNameError}</span>
	<br>
	<br>
	Product category : <input type="text" name="productCategory" value="${productBean.getProductCategory()}"/>
	<span style="color:red">${productCategoryError}</span>
	<br>
	<br>
	Product quantity : <input type="text" name="productQuantity" value="${productBean.getProductQuantity()}"/>
	<span style="color:red">${productQuantityError}</span>
	<br>
	<br>
	Product price : <input type="text" name="productPrice" value="${productBean.getProductPrice()}"/>
	<span style="color:red">${productPriceError}</span>
	<br>
	<br>
	
	<input type="submit" value="Add Product" />
</form>

</body>
</html>