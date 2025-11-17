<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help</title>
</head>
<body>
<h1>This is HELP JSP Page</h1>
<h2>Siddhant Nagaria in help page</h2>

<%
String name =(String) request.getAttribute("name");
Integer rollnumber = (Integer) request.getAttribute("roll");
LocalDateTime now = (LocalDateTime) request.getAttribute("time");
%>

<h3>Name is : <%=name %></h3>
<h3>Roll no. is : <%=rollnumber %></h3>
<h3>Time is : <%= now %></h3>

</body>
</html>