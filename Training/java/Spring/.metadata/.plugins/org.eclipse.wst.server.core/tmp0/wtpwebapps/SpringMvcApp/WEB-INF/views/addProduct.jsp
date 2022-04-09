<%@page import="com.jocata.model.Product"%>
<%@page import="com.jocata.model.Category"%>
<%@page import="com.jocata.util.ServiceManager"%>
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
		<h2>Add new Product</h2>
		<form action = "/SpringMvcApp/saveProduct" method="POST">
		Product Name: <input type="text" name="pName" /><br/>
		Category Id: <input type="text" name="catId" /><br/>
		Product Price: <input type="text" name="price" /><br/>
		Product Quantity: <input type="text" name="quantity" /><br/>
		Product Description: <input type="text" name="description" /><br/><br/>
		
		               <input type="submit" value="Add Product" />
		 </form>
		 
		 <h3>Existing Product</h3>
		 <%
		 	List<Product> productList = null;
		    
		 	if(request.getAttribute("productList") != null)
		 		productList = (List<Product>)request.getAttribute("productList");
		 	
		 	if(productList != null && productList.size() > 0){
		 		for(Product product : productList){
		 	
		 %>
		     <hr>
		 	   <b> Product Name : </b><%= product.getpName() %> <br/><br/>
		 	    <b>Category Id : </b><%= product.getCatId() %> <br/><br/>
		 	    <b>Price : </b><%= product.getPrice() %> <br/><br/>
		 	    <b>Quantity : </b><%= product.getQuantity() %> <br/><br/>
		 	    <b>Description : </b><%= product.getDescription() %> <br/><br/>
		 	
		 <%
		 		}
		 	}
		 	else{
		 %>
		 	<b>--No Products to Show--</b>
		 <%
		 	}
		 %>
		              
	</center>
</body>
</html>