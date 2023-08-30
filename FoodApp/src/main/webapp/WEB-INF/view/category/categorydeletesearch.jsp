<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<%@include file="../header.jsp" %>

<div class="container" style="margin-top: 200px;margin-bottom: 20px;padding: 20px;height: 300px;">
    <div class="row">
      <form:form action="/category/deletecategoryprocess" method="post" modelAttribute="category">
        
      <form:hidden path = "catId" value = "${category.catId}" />
      
      <div class="form-group">
          <label for="name">Category Name</label>
          <input type="text" disabled value = "${category.categoryName}" class="form-control" id="name">
        </div>
        <br>
        <div class="form-group">
          <button class="btn btn-primary">Delete Category</button>
        </div>

      </form:form>
    </div>
  </div>

<%@include file="../footer.jsp" %>