<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@include file="category.jsp" %>
	
	<center><h3>Category Name: <%= request.getAttribute("catName").toString() %> </h3></center>
	
</body>
</html>