<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="myName" value="Gopal Upadhyay"></c:set>
Welcome :<c:out  value="${myName}"></c:out>

<hr>
<%!  List<String> cityNames=null; %>
<%
  cityNames=new ArrayList();
cityNames.add("Pune");
cityNames.add("Kolkata");
cityNames.add("Bangalore");
cityNames.add("Chennai");

out.println(cityNames);
session.setAttribute("key", cityNames);
%>
<c:forEach var="city" items="${key}">
<c:out value="${city}">
<br>
</c:out>

</c:forEach>

<c:forEach begin="1"  end="5" var="i">
<c:out value="${i}">
<br>
</c:out>

</c:forEach>
<c:if test="10<20">
Hiiii
</c:if>
</body>
</html>