<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<%@include file="../header.jsp" %>


<div class="container" style="margin-top: 200px;margin-bottom: 20px;padding: 20px;height: 300px;">
    <div class="row">
      <form:form action="/category/addcategoryprocess" method="post" modelAttribute="category">
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

<%@include file="../footer.jsp" %>