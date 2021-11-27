<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Confirmation</title>
</head>
<body>
	<h2>Customer Confirmation</h2>
	<br>
	<br> The customer name is: ${customer.firstName }
	${customer.lastName }
	<br>
	<br> Course Code: ${customer.courseCode }
</body>
</html>