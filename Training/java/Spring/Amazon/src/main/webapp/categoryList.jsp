<%@page import="java.util.List"%>
<%@page import="com.jocata.amazon.service.CategoryService"%>
<%@page import="com.jocata.amazon.service.impl.CategoryServiceImpl"%>
<%@page import="com.jocata.amazon.response.CategoryResponse"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
     <table>
                     <tr><a href="/Amazon/index.jsp">Home Page</a></tr>
                     <tr><h2 style="background-color:orange;font-family:courier;">Choose a category</h2></tr>
                    <%
                        CategoryService catService = new CategoryServiceImpl();
                        List<CategoryResponse> catList = catService.getCategorylist();
                        
                        if(catList != null && catList.size() > 0){
                              for(CategoryResponse cat:catList){
                    %>
                      
                      <tr>
                           <td width="10px" style="background-color:whitesomke;font-family:courier" align="center" >
                           <a href="/Amazon/productListByCategory.jsp?catId=<%= cat.getId() %>">  
                              <%= cat.getCatName() %>
                           </a>   
                      </tr>
                    
                    <%    	
                           }
                       }
                    %>
                </table>
</body>
</html>