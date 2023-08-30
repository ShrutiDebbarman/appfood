<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<%@include file="../header.jsp" %>

<div class="container" style="margin-top: 200px;margin-bottom: 20px;padding: 20px;height: 300px;">
    <div class="row">
      <form:form action="/restaurant/restaurantsearchfordeletion" method="get" modelAttribute="restaurant">
        <div class="form-group">
          <label for="restId">Restaurant ID</label>
          <form:input path="restId" class="form-control" id="restId"/>
        </div>
        <br>
        <div class="form-group">
          <button type="submit" class="btn btn-primary">Search Restaurant</button>
        </div>
      </form:form>
    </div>
  </div>


<%@include file="../footer.jsp" %>