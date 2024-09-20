<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2">
<th>Flignt number</th>
<th>Source Airport</th>
<th>destination Airport</th>
<th>Date</th>
<th>Cost</th>
<th>Book</th>
<c:forEach var="flightObj" items="${flightList}">
   <tr>
   <td>${flightObj.flightNumber}</td>
   <td>${flightObj.flightSource}</td>
   <td>${flightObj.fightDestination}</td>
      <td>${flightObj.flyDate}</td>
<td>${flightObj.flightCharge}</td>
<td><a href='bookServlet?param1=${flightObj.flightNumber}'>Book Here</a>
</tr>
</c:forEach>
</table>
</body>
</html>