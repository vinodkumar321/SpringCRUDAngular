<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body align="center">
    <h3>Add Product</h3>
    <form action="Dispatcher?target=product" method="post">
        <label for="catId" name="catId">Category id</label>
        <input type="text" name="catId" id="catId"><br/><br/>
        <label for="productName" name="productName">Product Name</label>
        <input type="text" name="productName" id="productName"><br/><br/>
        <label for="productPrice" name="productPrice">Product Price</label>
        <input type="text" name="productPrice" id="productPrice"><br/><br/>
        <label for="productQuantity" name="productQuantity">Product Quantity</label>
        <input type="text" name="productQuantity" id="productQuantity"><br/><br/>
        <label for="productDescription" name="productDescription">Product Description</label>
        <input type="text" name="productDescription" id="productDescription"><br/><br/>
        <input type="submit" value="Add Product" name="submit" ><br/><br/> 
        
    </form>
    <a href="/Amazon/adminHome.jsp">Back to AdminHome</a><br/>
</body>
</html>