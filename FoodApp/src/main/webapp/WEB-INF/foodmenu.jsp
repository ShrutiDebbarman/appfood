<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.*,org.foodapp.model.*"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<!-- food_menu start-->
<section class="food_menu gray_bg">
    <div class="container">
        <div class="row justify-content-between">
            <div class="col-lg-5">
                <div class="section_tittle">
                    <p>Popular Menu</p>
                    <h2>Delicious Food Menu</h2>
                </div>
            </div>
            <div class="col-lg-6">
                <div class="nav nav-tabs food_menu_nav" id="myTab" role="tablist">
                    <%
                    List<Category> list =(List<Category>)request.getAttribute("categories");
                    for(Category category : list)
                    {
                        
                        out.println("<a id=\""+ category.getCategoryName()+"-tab\" data-toggle=\"tab\" href=\"#"+ category.getCategoryName()+"\" role=\"tab\" aria-controls=\"Launch\"");
                        out.println(" aria-selected=\"false\">" +category.getCategoryName()+ "<img src=\"img/icon/play.svg\" alt=\"play\"></a>");
                    }
                    %>
                </div>

            </div>
            

            <div class="col-lg-12">
                <div class="tab-content" id="myTabContent">
                    <div class="tab-pane fade show active single-member" id="Special" role="tabpanel"
                        aria-labelledby="Special-tab">
                        <div class="row">
                            <div class="col-sm-6 col-lg-6">
                                <%
                                    List<Item> itemlist = (List<Item>)request.getAttribute("items");
                                    for(Item item :itemlist){
                                            out.println("<div class=\"single_food_item media\">");
                                            out.println("<img src=\"img/food_menu/single_food_1.png\" class=\"mr-3\" alt=\"...\">");
                                            out.println("<div class=\"media-body align-self-center\">");
                                            out.println("<h3>"+item.getItemName()+"</h3>");
                                            //out.println("<p>They're wherein heaven seed hath nothing</p>");
                                            out.println("<h5>$"+item.getCost()+"</h5>");
                                            out.println("</div>");
                                            out.println("</div>");
                                        }
                                    
                                %>
                                <div class="single_food_item media">
                                    <img src="img/food_menu/single_food_3.png" class="mr-3" alt="...">
                                    <div class="media-body align-self-center">
                                        <h3>Summer Cooking</h3>
                                        <p>They're wherein heaven seed hath nothing</p>
                                        <h5>$40.00</h5>
                                    </div>
                                </div>
                            </div>
                            <div class="col-sm-6 col-lg-6">
                                <div class="single_food_item media">
                                    <img src="img/food_menu/single_food_4.png" class="mr-3" alt="...">
                                    <div class="media-body align-self-center">
                                        <h3>Easter Delight</h3>
                                        <p>They're wherein heaven seed hath nothing</p>
                                        <h5>$40.00</h5>
                                    </div>
                                </div>
                                <div class="single_food_item media">
                                    <img src="img/food_menu/single_food_5.png" class="mr-3" alt="...">
                                    <div class="media-body align-self-center">
                                        <h3>Tiener Schnitze</h3>
                                        <p>They're wherein heaven seed hath nothing</p>
                                        <h5>$40.00</h5>
                                    </div>
                                </div>
                                <div class="single_food_item media">
                                    <img src="img/food_menu/single_food_6.png" class="mr-3" alt="...">
                                    <div class="media-body align-self-center">
                                        <h3>Chicken Roast</h3>
                                        <p>They're wherein heaven seed hath nothing</p>
                                        <h5>$40.00</h5>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>