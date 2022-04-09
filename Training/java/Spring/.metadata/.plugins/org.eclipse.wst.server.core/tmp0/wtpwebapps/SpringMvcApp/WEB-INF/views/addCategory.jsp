<%@page import="com.jocata.model.Category"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h2>Add new Category</h2>
		<form action = "/SpringMvcApp/saveCategory" method="POST">
		Category Name: <input type="text" name="catName" /><br/>
		               <input type="submit" value="Add Category" />
		 </form>
		 
		 <h3>Existing Categories</h3>
		 <%
		 	List<Category> catList = null;
		 	if(request.getAttribute("catList") != null)
		 		catList = (List<Category>)request.getAttribute("catList");
		 	
		 	if(catList != null && catList.size() >0){
		 		for(Category category : catList){
		 	
		 %>
		 
		 	<%= category.getCatName() %> <br/>
		 	
		 <%
		 		}
		 	}
		 	else{
		 %>
		 	<b>--No Categories to Show--</b>
		 <%
		 	}
		 %>
		              
	</center>
</body>
</html>