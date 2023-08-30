<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<%@include file="../header.jsp" %>

<div class="container" style="margin-top: 200px;margin-bottom: 20px;padding: 20px;height: 300px;">
    <div class="row">
      <form:form action="/restaurant/deleterestaurantprocess" method="post" modelAttribute="restaurant">
        
      <form:hidden path = "restId" value = "${restaurant.restId}" />
      
      <div class="form-group">
          <label for="name">Restaurant Name</label>
          <input type="text" disabled value = "${restaurant.restaurantName}" class="form-control" id="name">
        </div>
        <br>
        <div class="form-group">
          <button class="btn btn-primary">Delete Restaurant</button>
        </div>

      </form:form>
    </div>
  </div>

<%@include file="../footer.jsp" %>