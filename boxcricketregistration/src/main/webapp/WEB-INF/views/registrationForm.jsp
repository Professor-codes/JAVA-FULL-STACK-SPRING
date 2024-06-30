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
		Name : <input type="text" name="name" value="${nameValue}" />
		<p style="display: inline; color: red">${nameError}</p>
		<br>
		<br> 
		
		Type : <input type="radio" name="playertype" value="Batsman" ${playertypeValue=="Batsman"?"checked":""} />Batsman
			   <input type="radio" name="playertype" value="Bowller" ${playertypeValue=="Bowller"?"checked":""}/>Bowller 
			   <input type="radio" name="playertype" value="All Rounder" ${playertypeValue=="All Rounder"?"checked":""}/>All Rounder
		<p style="display: inline; color: red">${playertypeError}</p>
		<br>
		<br> 
		
		Food : <select name="food">
			<option value="-1">Select Your Food</option>
			<option value="Regular" ${foodValue.equals("Regular")?"selected":""}>Regular</option>
			<option value="Vegetarian" ${foodValue.equals("Vegetarian")?"selected":""}>Veg</option>
			<option value="Non Vegetarian" ${foodValue.equals("Non Vegetarian")?"selected":""}>Non Veg</option>
			<option value="Jain" ${foodValue.equals("Jain")?"selected":""}>Jain</option>
		</select>
		<p style="display: inline; color: red">${foodError}</p>
		<br>
		<br> 
		
		Drink : <input type="checkbox" name="drink" value="Redbool" ${drinkValue.contains("Redbool")?"checked":""} />Redbool
				<input type="checkbox" name="drink" value="Muntain dew" ${drinkValue.contains("Muntain dew")?"checked":""}/>Muntain dew
				<input type="checkbox" name="drink" value="Thumbs up" ${drinkValue.contains("Thumbs up")?"checked":""}/>Thumbs up 
				<input type="checkbox" name="drink" value="Lemon Juice" ${drinkValue.contains("Lemon Juice")?"checked":""}/>Lemon Juice 
				<input type="checkbox" name="drink" value="Coca cola" ${drinkValue.contains("Coca cola")?"checked":""}/>Coca cola
		<p style="display: inline; color: red">${drinkError}</p>
		<br>
		<br> 
		
		<input type="submit" value="Register" />
	</form>
</body>
</html>