<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
	import="java.util.*,org.foodapp.model.*"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<!DOCTYPE html>
<html>
<head>
	<title>LogIn</title>
	<link rel="stylesheet" type="text/css" href="../../css/login.css">
<link href="https://fonts.googleapis.com/css2?family=Jost:wght@500&display=swap" rel="stylesheet">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Comfortaa:wght@400;600&family=Dosis&family=Jost:wght@300&family=Nunito:wght@300&family=Petrona:wght@200&family=Signika+Negative:wght@300&display=swap" rel="stylesheet">
</head>
<body>
	
	<div class="main">  	
		<input type="checkbox" id="chk" aria-hidden="true">

			<div  class="signup">
				<form method="post">
					<label for="chk" aria-hidden="true">Sign Up</label>
					<input type="text" name="txt" placeholder="Username" required="">
					<input type="email" name="email" placeholder="Email" required="">
					<input type="password" name="pswd" placeholder="Password" required="">
					<button>Sign Up</button>
				</form>
			</div>

			<div class="login">
				<form action="/login" method="post">
					<label for="chk" aria-hidden="true">Log In</label>
                    <div><h3>${error}</h3></div>
					<input type="email" name="email" placeholder="Email" required="">
					<input type="password" name="password" placeholder="Password" required="">
					<button>Log In</button>
				</form>
			</div>
	</div>



</body>
</html>