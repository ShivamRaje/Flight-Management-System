<%@page import="dao.FlightServiceImpl,java.util.*, model.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<center>
<body bgcolor="sky blue">
<% String userName=(String)session.getAttribute("userKey"); %>
<h3><font color='blue'>Hi!!!!&nbsp;&nbsp;<%=userName%></font></h3>
<table border="2" cellpadding='3' cellspacing='3'>
<thead>
<th>F.No</th>
<th>F.Type</th>
<th>Source</th>
<th>Destination</th>
<th>Fly Date</th>
<th>LayOff Points</th>
<th>Price</th>
<th>EDIT</th>
<th>DELETE</th>
</thead>
<%  FlightServiceImpl service=new FlightServiceImpl();  
  List<Flight> list=service.viewAllFlight();

  for(Flight obj:list)
  {
%>
<tr>
<td><%=obj.getFlightNumber() %></td>
<td><%=obj.getFlightType() %></td>
<td><%=obj.getFlightSource() %></td>
<td><%=obj.getFightDestination() %></td>
<td><%=obj.getFlyDate() %></td>
<td><%=obj.getLayOffPoints() %></td>
<td><%=obj.getFlightCharge() %></td>
<td><a href='EditFlight?param1=<%=obj.getFlightNumber() %>'>EDIT</a></td>
<td><a href='DelFlight?param1=<%=obj.getFlightNumber() %>'>DELETE</a></td>
</tr>
<% } %>
</table>

</body>
</center>
</html>