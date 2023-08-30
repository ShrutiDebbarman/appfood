<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<!DOCTYPE html>
<html lang="en">
<head>
	<head>
		<!-- Required meta tags -->
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<title>Dingo</title>
		<link rel="icon" href="../../img/favicon.png">
		<!-- Bootstrap CSS -->
		<link rel="stylesheet" href="../../css/bootstrap.min.css">
		<!-- animate CSS -->
		<link rel="stylesheet" href="../../css/animate.css">
		<!-- owl carousel CSS -->
		<link rel="stylesheet" href="../../css/owl.carousel.min.css">
		<!-- themify CSS -->
		<link rel="stylesheet" href="../../css/themify-icons.css">
		<!-- flaticon CSS -->
		<link rel="stylesheet" href="../../css/flaticon.css">
		<!-- font awesome CSS -->
		<link rel="stylesheet" href="../../css/magnific-popup.css">
		<!-- swiper CSS -->
		<link rel="stylesheet" href="../../css/slick.css">
		<link rel="stylesheet" href="../../css/gijgo.min.css">
		<link rel="stylesheet" href="../../css/nice-select.css">
		<link rel="stylesheet" href="../../css/all.css">
		<!-- style CSS -->
		<link rel="stylesheet" href="../../css/style.css">
	</head>
</head>				
<body>
    <div class="jumbotron text-center" >
        <h1 class="display-4" style="margin-top: 100px;">Welcome back, Admin</h1>
        <p>Easily manage your data from this admin <mark>CMS</mark></p>
    </div>

	<%@include file="../header.jsp" %>

    <div class="container" style="margin: 30px 20% 30px 20%">
        <div class="row">
            <div class="card-deck" >
                <div class="card" style="background-color:white;">
                    <div class="card-body">
                        <h4 class="card-title">Categories</h4>
                        <p class="card-text">Manage the categories section here.</p>
                        <a href="admin/categories" th:href="@{/admin/categories}" class="card-link btn btn-primary">Manage</a>
    
                    </div>
                </div>
                <div class="card" style="background-color:white;">
                    <div class="card-body">
                        <h4 class="card-title">Items</h4>
                        <p class="card-text">Manage all the products here.</p>
                        <a href="admin/items" th:href="@{/admin/products}" class="card-link btn btn-primary">Manage</a>
    
                    </div>
                </div>
                <div class="card" style="background-color:white;">
                    <div class="card-body">
                        <h4 class="card-title">Restaurants</h4>
                        <p class="card-text">Manage all the restaurants here.</p>
                        <a href="#" th:href="@{/admin/restaurant}" class="card-link btn btn-primary">Manage</a>
    
                    </div>
                </div>
                <div class="card" style="background-color:white;">
                    <div class="card-body">
                        <h4 class="card-title">Restaurants</h4>
                        <p class="card-text">Manage all the restaurants here.</p>
                        <a href="#" th:href="@{/admin/restaurant}" class="card-link btn btn-primary">Manage</a>
    
                    </div>
                </div>
            </div>
        </div>
    </div>

	<%@include file="../footer.jsp" %>
</body>
</html>