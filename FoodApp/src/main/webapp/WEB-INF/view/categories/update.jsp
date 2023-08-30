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
		<title>FastEat</title>
		<link rel="icon" href="../../../img/favicon.png">
		<!-- Bootstrap CSS -->
		<link rel="stylesheet" href="../../../css/bootstrap.min.css">
		<!-- animate CSS -->
		<link rel="stylesheet" href="../../../css/animate.css">
		<!-- owl carousel CSS -->
		<link rel="stylesheet" href="../../../css/owl.carousel.min.css">
		<!-- themify CSS -->
		<link rel="stylesheet" href="../../../css/themify-icons.css">
		<!-- flaticon CSS -->
		<link rel="stylesheet" href="../../../css/flaticon.css">
		<!-- font awesome CSS -->
		<link rel="stylesheet" href="../../../css/magnific-popup.css">
		<!-- swiper CSS -->
		<link rel="stylesheet" href="../../../css/slick.css">
		<link rel="stylesheet" href="../../../css/gijgo.min.css">
		<link rel="stylesheet" href="../../../css/nice-select.css">
		<link rel="stylesheet" href="../../../css/all.css">
		<!-- style CSS -->
		<link rel="stylesheet" href="../../../css/style.css">
	</head>
</head>				
<body>

    <%@include file="../../header.jsp" %>

    <div class="container" style="margin-top: 200px;margin-bottom: 200px;padding: 20px;height: 300px;">
        <div class="row">
          <form:form action="updatecategoryprocess" method="post" modelAttribute="category">
            
          <form:hidden path = "catId" value = "${category.catId}" />
          
          <div class="form-group">
              <label for="name">Category Name</label>
              <form:input path="categoryName" value = "${category.categoryName}" class="form-control" id="name"/>
            </div>
            <br>
            <div class="form-group">
              <button class="btn btn-primary">Modify Category</button>
            </div>
    
          </form:form>
        </div>
      </div>

      <%@include file="../../footer.jsp" %>
</body>
</html>