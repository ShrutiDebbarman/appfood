<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<%@include file="../header.jsp" %>


<div class="container" style="margin-top: 200px;margin-bottom: 20px;padding: 20px;height: 300px;background-image: url(s.jpg);">
    <div class="row">
      <form:form action="/restaurant/addrestaurantprocess" method="post" modelAttribute="restaurant">
        <div class="form-group">
          <label for="name">Restaurant Name</label>
          <form:input path="restaurantName" class="form-control" id="name"/>
        </div>
        <br>
        <div class="form-group">
          <button type="submit" class="btn btn-primary">Save Restaurant</button>
        </div>

      </form:form>
    </div>
  </div>

<%@include file="../footer.jsp" %>