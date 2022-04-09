<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.jocata.amazon.service.*" %>
<%@ page import="com.jocata.amazon.service.impl.CategoryServiceImpl" %>
<%@ page import="com.jocata.amazon.response.*" %>
<%@ page import="com.jocata.amazon.service.CategoryService" %>    
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Amazon</title>
</head>
<body>
   <table border="2" width="100%" height="100%" margin="auto">
      <tr>
           <td align="center" colspan="2">
              <h1>Welcome to Amazon Shopping App</h1>
     
           </td>
      </tr>
      <tr>
          <td align="right"> 
               <a href="/Amazon/adminHome.jsp" >Admin Task</a>
          </td>
      </tr>
      <tr>
           <td width="20%" >
                <%@include file="categoryList.jsp" %>
           </td>
           <td width="80%">
              <h2>Your List of Products Will be Displayed Here</h2>
           </td>
      </tr>
   </table>   
</body>
</html>