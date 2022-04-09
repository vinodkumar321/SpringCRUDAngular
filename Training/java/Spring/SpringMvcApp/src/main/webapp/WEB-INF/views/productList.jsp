<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
      <%@include file="product.jsp" %>
      <center>
           <h3>
                   Product Name: <%= request.getAttribute("pName").toString() %><br><br>
                   Category Name: <%= request.getAttribute("catName").toString() %><br><br>
                   Price: <%= request.getAttribute("price").toString() %><br><br>
                   Quantity: <%= request.getAttribute("quantity").toString() %><br><br>
                   Description: <%= request.getAttribute("description").toString() %><br><br> 
           </h3>
      </center>
      
</body>
</html>