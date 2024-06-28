<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>This is simple jsp file.</h1>

<form action="addUser" method="post">
    First Name :
    <input type="text" placeholder="Enter your name" name="name"/>
    <br><br>
    Email :
    <input type="email" placeholder="Enter your email" name="email"/>
    <br><br>
    Password :
    <input type="password" placeholder="Enter your password" name="password"/>
    <br><br>

    <input type="submit" value="Submit">
</form>

</body>
</html>