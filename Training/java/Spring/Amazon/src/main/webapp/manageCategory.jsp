<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body align="center">
    <h3>Add category</h3>
    <form action="Dispatcher?target=category" method="post">
        <label for="categoryName" name="category">Category Name </label>
        <input type="text" name="catName" id="catName"><br/><br/>
        <input type="submit" value="Add category" name="submit"  ><br/><br/> 
        
    </form>
    <a href="/Amazon/adminHome.jsp">Back to AdminHome</a><br/>
</body>
</html>