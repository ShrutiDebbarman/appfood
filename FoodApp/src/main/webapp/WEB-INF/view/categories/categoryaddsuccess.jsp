<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.*,org.foodapp.model.*"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<!DOCTYPE html>
<html lang="en">
  <head>
      <head>
          <!-- Required meta tags -->
          <meta charset="utf-8">
          <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
          <title>Dingo</title>
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
          <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
      </head>
  </head>
  <body>
  <%@include file="../../header.jsp" %>

  <div class="alert alert-primary alert-dismissible fade show" role="alert" data-tor="show:scale.from(0)" style="margin-top: 100px;">
    Category Saved Successfully !
    <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
  </div>
  <div class="alert alert-success alert-dismissible fade in">
    <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
    <strong>Success!</strong>New Category Has Been Added!
  </div>

  <div class="container" style="margin-top: 100px;margin-bottom: 20px;padding: 20px;height: 300px;">
    <div class="row">
      <form:form action="addcategoryprocess" method="post" modelAttribute="categories">
        <div class="form-group">
          <label for="name">Category Name</label>
          <form:input path="categoryName" class="form-control" id="name"/>
        </div>
        <br>
        <div class="form-group">
            <button type="submit" class="btn btn-primary">Save Category</button>
        </div>

      </form:form>
    </div>
  </div>
 
  <%@include file="../../footer.jsp" %>

</body>
</html>