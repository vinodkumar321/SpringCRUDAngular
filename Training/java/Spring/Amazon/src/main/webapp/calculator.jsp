<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/Amazon/calculate.jsp" method="post">
   <table align="center">
         <tr>
             <td colspan="2">Calculator App</td>
         </tr>
         <tr>
             <td align="right">Enter the First Number : </td>
             <td><input type="number" name="fno"></td>
         </tr>
         <tr>
             <td align="right">Enter the Second Number : </td>
             <td><input type="number" name="sno"></td>
         </tr>
         <tr>
             <td align="right"></td>
             <td><input type="submit" name="submit" value="add"></td>
         </tr>
   </table>
  </form> 
</body>
</html>