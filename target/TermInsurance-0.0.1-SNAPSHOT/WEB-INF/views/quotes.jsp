<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring Boot</title>
</head>
<body>
  
 <table>
 <tr>
 <td colspan="3"><h1>Quotes Information</h1></td>
 </tr>
 <tr>
 <td>Company Name</td>
 <td>Premium</td>
 <td>amount</td>
<td>tenure</td>
 
 </tr>
 
 
 <c:if test="${empty quote}">
 <p>Quotes empty for selection creteria</p>
 </c:if>
 
 <c:if test="${not empty quote}">
 <c:forEach items="${quote}" var="s">
 <tr>
 <td>${s.companyName}</td>
 <td>${s.premium}</td>
 <td>${s.amount}</td>
  <td>${s.tenure}</td>
 
 </tr>
 </c:forEach>
 
</c:if>

 
 
 </table> 
  
  

</body>
</html>