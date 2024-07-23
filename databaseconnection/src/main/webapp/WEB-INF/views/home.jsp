<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
@import
	url('https://fonts.googleapis.com/css2?family=Poppins:wght@400;600&display=swap')
	;

* {
	box-sizing: border-box;
	margin: 0;
	padding: 0;
	font-family: 'Poppins', sans-serif;
}

body {
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

.container {
	display: flex;
	justify-content: center;
	align-items: center;
	width: 100%;
	height: 100%;
}

.glass-card {
	background: rgba(255, 255, 255, 0.15);
	border-radius: 15px;
	padding: 20px;
	width: 350px;
	backdrop-filter: blur(10px);
	-webkit-backdrop-filter: blur(10px);
	box-shadow: 0 4px 30px rgba(0, 0, 0, 0.1);
	border: 1px solid rgba(255, 255, 255, 0.3);
}

.card-header {
	display: flex;
	justify-content: flex-end;
	gap: 10px;
	margin-bottom: 20px;
}

.control-btn {
	width: 12px;
	height: 12px;
	border-radius: 50%;
	background: #ff5f56;
}

.control-btn.maximize {
	background: #ffbd2e;
}

.control-btn.minimize {
	background: #27c93f;
}

.card-content h1 {
	text-align: center;
	font-weight: 600;
	margin-bottom: 10px;
}

.card-content p {
	text-align: center;
	margin-bottom: 30px;
}

.button-container {
	display: flex;
	flex-direction: column;
	gap: 20px;
}

a {
	color: black;
	text-decoration: none;
}

.button {
	position: relative;
	display: inline-block;
	padding: 15px 30px;
	font-size: 16px;
	text-transform: uppercase;
	color: #000000;
	border: none;
	outline: none;
	cursor: pointer;
	border-radius: 10px;
	overflow: hidden;
	transition: 0.5s;
	font-weight: 600;
	box-shadow: 0 0 15px rgba(255, 255, 255, 0.1);
}
</style>
</head>
<body>
	<div class="container">
		<div class="glass-card">
			<div class="card-header">
				<div class="control-btn close"></div>
				<div class="control-btn maximize"></div>
				<div class="control-btn minimize"></div>
			</div>
			<div class="card-content">
				<div class="button-container">
					<button class="button btn-2">
						<a href="#">Signup</a>
					</button>
					<button class="button btn-2">
						<a href="addproduct">Add product</a>
					</button>
					<button class="button btn-3">
						<a href="productlist">List product</a>
					</button>
				</div>
			</div>
		</div>
	</div>


</body>
</html>