<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <center>
         <H1>Welcome to Spring MVC Web Application</H1><br><br>
         <h2>Product Details</h2><br>
         <form action="/SpringMvcApp/getProduct" method="get">
			<select id="pid" name="pid">
				<option value="1">1</option>
				<option value="2">2</option>
				<option value="3">3</option>
				<option value="4">4</option>
				<option value="5">5</option>
				<option value="6">6</option>
			</select>
			<input type="submit" value="Get Product Details" />
		</form> <br><br> 
        <h3><a href="/SpringMvcApp/addProductForm">Add new Product</a></h3><br><br> 
         
    </center>
</body>
</html>