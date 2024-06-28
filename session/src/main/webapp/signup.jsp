<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Singup Page</h1>

	<form action="saveuser" method="post">
		User name : <input type="text" name="name"> <br>
		<br>Email : <input type="email" name="email"> <br>
		<br>Password : <input type="password" name="password"> <br>
		<br> <input type="submit" value="Submit">
	</form>
</body>
</html>