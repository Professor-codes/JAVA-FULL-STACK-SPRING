<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Box Cricket Registration</h1>
	<hr>
	<br>
	
	<form action="registeruser" method="post">
		Name : <input type="text" name="name">
			   <p style="display:inline; color:red">${nameError}</p><br><br>
		
		Type : <input type="radio" name="playertype" value="Batsman"/>Batsman 
			   <input type="radio" name="playertype" value="Bowller"/>Bowller 
			   <input type="radio" name="playertype" value="All Rounder"/>All Rounder 
			   <p style="display:inline; color:red">${playertypeError}</p> <br><br>
		
		Food : <select name="food">
					<option value="-1">Select Your Food</option>
					<option value="Regular">Regular</option>
					<option value="Vegetarian">Veg</option>
					<option value="Non Vegetarian">Non Veg</option>
					<option value="Jain">Jain</option>
			   </select>
			   <p style="display:inline; color:red">${foodError}</p>
			   <br><br>
			   
		Drink : <input type="checkbox" name="drink" value="Redbool"/>Redbool	
				<input type="checkbox" name="drink" value="Muntain dew"/>Muntain dew	
				<input type="checkbox" name="drink" value="Thumbs up"/>Thumbs up	
				<input type="checkbox" name="drink" value="Lemon Juice"/>Lemon Juice	
				<input type="checkbox" name="drink" value="Coca cola"/>Coca cola	
				<p style="display:inline; color:red">${drinkError}</p>
				<br><br>
				
		<input type="submit" value="Register" /> 
	</form>
</body>
</html>