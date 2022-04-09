<%@page import="com.jocata.amazon.response.ProductResponse"%>
<%@page import="com.jocata.amazon.service.ProductService"%>
<%@page import="com.jocata.amazon.service.impl.ProductServiceImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <table border="2" width="100%" height="100%" margin="auto">
      <tr>
           <td align="center" colspan="2">
              <h1>Welcome to Amazon Shopping App</h1>
           </td>
      </tr>
      <tr>
           <td width="20%" >
                <%@include file="categoryList.jsp" %>
           </td>
           <td width="80%">
                 <table border="1" width="100%" cellpadding=20px>
                   <%
                     Integer catId = Integer.parseInt(request.getParameter("catId"));   
                     ProductService productService = new ProductServiceImpl();
                     List<ProductResponse> productResponseList = productService.getProductListByCatId(catId);
                     
                     if(productResponseList != null && productResponseList.size() > 0){
                    	  for(ProductResponse productRes: productResponseList){
                     %>
                     
                          <tr>
                               <td>
                                   Name :<b> <%= productRes.getPname() %></b><br/>
                                   Price :<b> <%= productRes.getPrice() %></b><br/>
                                   Available :<b> <%= productRes.getQuantity() %></b><br/>
                                   Description :<b> <%= productRes.getDescription() %></b><br/>
                                   <a href="/amazon/congratulation.jsp">Purchase</a>
                               </td>
                          </tr>
                     <%		  
                    	  }
                     }
                    
                       
                       
                        
                   %>
           </td>
      </tr>
   </table>
</body>
</html>