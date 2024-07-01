<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Signup Page</h1>
	<hr>
	<br>

	<form action="usersignup" method="post">
		First name : <input type="text" name="username" value="${userNameValue}"/> 
		<span style="color: red">${userNameError}</span>
		<br>
		
		<br> Email : <input type="email" name="email" value="${userEmailValue}"/> 
		<span style="color: red">${userEmailError}</span>
		<br>
		
		<br> Password : <input type="password" name="password" value="${userPasswordValue}"/> 
		<span style="color: red">${userPasswordError}</span>
		<br>
		<br> <input type="submit" value="Signup">
	</form>
</body>
</html>