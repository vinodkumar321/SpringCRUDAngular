<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.Date" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>
   <%@include file="/calculator.jsp" %> <!-- this show calculator.jsp output -->
   
   <%! // declearative scriptlet used for page level variable / methods declearation 
       // can't use implicit object like request,response,session , out etc...  
        int fno,sno;
        public int add(){
	       return (fno+sno);
   }
   %>
   
   <%  // code scriptlet and this code is part of service method
      // if u want to use implicit object like request,response,session, out
      // they can be used only in code scriptlet or in assignment scriptlet
      
      fno = Integer.parseInt(request.getParameter("fno"));
      sno = Integer.parseInt(request.getParameter("sno"));
   
   %>
   
   <h3 align="center">Addition of <%= fno %>,<%= sno %> is <%= add() %></h3>
   <h2 align="center">Thanks for Using Calculator app. Please try again!</h2>
   <h2 align="center">Last used: <%= new Date().toString() %></h2>
  
</body>
</html>