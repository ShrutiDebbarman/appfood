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


  <div class="alert alert-success alert-dismissible fade in" style="margin-top: 100px;">
    <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
    <strong>Success!</strong>Category Updated Successfully!
  </div>

  <div class="container" style="margin-top: 100px;margin-bottom: 300px;padding: 20px;height: 300px;">
    <a href="/admin/categories/add" style="margin: 20px 0" class="btn btn-primary">Add Category</a>
                    
    <div class="row">
        <!-- list category -->
        <div>

          <table class="table table-striped table-inverse table-responsive">
            <thead class="thead-inerse">
                <tr>
                    <th scope="col">Category Id</th>
                    <th scope="col">Category Name</th>
                    <th scope="col">Delete</th>
                    <th scope="col">Update</th>
                </tr>
            </thead>
            <tbody>


                <%
                List<Category> list =(List<Category>)request.getAttribute("categories");
                for(Category category : list)
                {

                  out.println("<tr style = \"align: center;\">");
                    out.println("<td>" +category.getCatId()+ "</td> ");
                    out.println("<td>"+category.getCategoryName()+"</td>");
                    out.println("<td><a href=\"http://localhost:8080/admin/categories/deletecategoryprocess?catId="+category.getCatId()+"\" class=\"btn btn-danger\">Delete</a></td>");
                    out.println("<td><a href=\"http://localhost:8080/admin/categories/categorysearchformodification?catId="+category.getCatId()+"\" class=\"btn btn-warning\">Update</a></td>");
                    out.println("</tr>");
                }
                %>
                    
            </tbody>
          </table>
        </div> 
      </div>
    </div>
 
  <%@include file="../../footer.jsp" %>

</body>
</html>