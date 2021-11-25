<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Confirmation</title>
</head>
<body>
	<br>
	<br> Student Confirmation: ${student.firstName }
	${student.lastName }

	<br>
	<br> Student Country: ${student.country }

	<br>
	<br> Favorite Language: ${student.favoriteLanguage }

	<br>
	<br> OS:
	<ul>
		<c:forEach var="temp" items="${student.operatingSystems }">
			<li>${temp }</li>
		</c:forEach>
	</ul>
</body>
</html>