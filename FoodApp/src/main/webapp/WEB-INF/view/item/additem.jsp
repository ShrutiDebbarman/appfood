<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<%@include file="../header.jsp" %>

<div class="container" style="margin-top: 200px;margin-bottom: 20px;padding: 20px;height: 300px;">
    <div class="row">
      <form:form action="/item/additemprocess" method="post" modelAttribute="item">
        <div class="form-group">
          <label for="name">Item Name</label>
          <form:input path="itemName" class="form-control" id="name"/>
        </div>
        <br>
        <div class="form-group">
          <label for="cat">Category</label>
          <form:input path="category" class="form-control" id="cat"/>
        </div>
        <br>
        <div class="form-group">
          <label for="cost">Cost</label>
          <form:input path="cost" class="form-control" id="cost"/>
        </div>
        <br>
        <div class="form-group">
          <button type="submit" class="btn btn-primary">Save Item</button>
        </div>

      </form:form>
    </div>
  </div>

<%@include file="../footer.jsp" %>