<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
	import="java.util.*,org.foodapp.model.*"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Context-Type" content="text/html; charset=ISO-8859-1">
    <title></title>
</head>
    <body>
        <%
            String email = request.getParameter("email");
            String password = request.getParameter("password");

            if((emai.equals("admin")&&password.equals("admin"))){
                response.sendRedirect("admin")
            }
            else{
                response.send
            }
        %>
    </body>
</html>