<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flight Management System</title>
<link rel="stylesheet" type="text/css" href="Style.css">
</head>
<center>
<body>
<form action="Login" method="post">
<label for="userName">Enter User Name</label>
<input type="text" name="un"><br>
<label for="userPassword">Enter User Password</label>
<input type="password" name="pw"><br>
<input type="submit" value="Login">
</form>
<a href="userReg.jsp">New User???</a>
<a href="forgetPass.jsp">Forgot password???</a>
</body>
</center>
</html>