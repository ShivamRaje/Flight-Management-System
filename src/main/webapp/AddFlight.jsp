<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<center>
<body>
<% String userName=(String)session.getAttribute("userKey"); %>
<h3><font color='blue'>Hi</font>&nbsp;&nbsp;<font color='black'><%=userName%> 
</font>&nbsp;&nbsp; <font color='green'>Kindly Add Flights</font>
</h3>
<form action="addMyFlight" method="post">
<label for="flightNumber">Enter Flight Number</label>
<input type="text" name="fno" pattern="[0-9]{4}"><br>

<label for="flightType">Enter Flight Types</label>
<select name="fType">
<option value="Indigo">Indigo</option>
<option value="jet">Jet</option>
<option value="AirIndia">AirIndia</option>
<option value="SpiceJet">SpiceJet</option>
</select><br>

<label for="flightSource">Select Source</label>
<select name="fSource">
<option value="Kolkata">Kolkata</option>
<option value="Pune">Pune</option>
<option value="Mumbai">Mumbai</option>
<option value="Delhi">Delhi</option>
</select><br>

<label for="flightDestination">Select Destination</label>
<select name="fDest">
<option value="Kolkata">Kolkata</option>
<option value="Pune">Pune</option>
<option value="Mumbai">Mumbai</option>
<option value="Delhi">Delhi</option>
</select><br>
<label for="lsyOffs">Add LayOff Point</label>
<input type="checkbox" name="ch1" value="BBSR"> BBSR&nbsp;&nbsp;&nbsp;&nbsp;
<input type="checkbox" name="ch1" value="Lucknow">LUCKNOW&nbsp;&nbsp;&nbsp;&nbsp;
<input type="checkbox" name="ch1" value="Chennai">CHENNAI&nbsp;&nbsp;&nbsp;&nbsp;
<input type="checkbox" name="ch1" value="Bangalore">BAGALORE&nbsp;&nbsp;&nbsp;&nbsp;
<br>
<label for="fDate">Enter Fly Date</label>
<input type="date" name="flyDate"><br>

<label for="fCost">Enter Booking Price</label>
<input type="text" name="cost"><br>

<input type="submit" value="ADD FLIGHT">
</form>
</body>
</center>
</html>