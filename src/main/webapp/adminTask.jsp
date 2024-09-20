<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<center>

<body bgcolor="red">
<% String userName=(String)session.getAttribute("userKey");

%>
<h3><font color='blue'>Welcome</font><font color='green'><%=userName %>!!!</font></h3>
<a href="AddFlight.jsp">ADD Flight</a><br>
<a href="ViewFlight.jsp">View Flight</a><br>






</body>
</center>
</html>