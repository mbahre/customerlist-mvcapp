<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer List</title>
</head>
<body>
<h3>Customer List</h3>
<hr>

<table border="1">

	<tr>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Email</th>
	</tr>

	<c:forEach var="customerList" items="${customer_list}"> 
	<tr>
		<td>${customerList.firstName}</td> 
		<td>${customerList.lastName}</td>
		<td>${customerList.email}</td>
	</tr>
	</c:forEach>


</table>


</body>
</html>