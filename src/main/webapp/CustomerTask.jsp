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
<% String userName=(String)session.getAttribute("userKey"); %>
<h3><font color='blue'>Welcome &nbsp; &nbsp; <%=userName%></font></h3>
<form action="searchFlight" method="post">
<label for='sourceName'>Enter Source Airport</label>
<input type="text" name="t1">
<label for='destName'>Enter Destination Airport</label>
<input type="text" name="t2"><br>
<label for='jouneyDate'>Enter DOJ</label>
<input type="date" name="t3">
<input type="submit" value="search">
</form>



</body>
</center>
</html>