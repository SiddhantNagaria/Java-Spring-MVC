<%@page import="java.time.LocalDateTime"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page isELIgnored="false"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help</title>
</head>
<body>
	<h1>This is JSP_EL JSP Page</h1>
	<h2>Siddhant Nagaria in JSP_EL page</h2>

	<%
	/* String name =(String) request.getAttribute("name");
	Integer rollnumber = (Integer) request.getAttribute("roll");
	LocalDateTime now = (LocalDateTime) request.getAttribute("time"); */
	%>

	<h3>Name is : ${name}</h3>
	<h3>Roll no. is : ${roll}</h3>
	<h3>Time is : ${time}</h3>
	<br>
	<hr>
	<br>
	<c:forEach var="item" items="${marks}">
		<h3>${item}</h3>
	</c:forEach>

</body>
</html>