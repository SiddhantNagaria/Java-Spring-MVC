<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Main JSP Page</h1>
	<h1>Index JSP Page</h1>

	<%
	String name = (String) request.getAttribute("name");
	Integer id = (Integer) request.getAttribute("id");
	List<String> friends = (List<String>) request.getAttribute("friends");
	%>
	<h2>
		Name is :
		<%=name%></h2>
	<h2>
		Id is :
		<%=id%></h2> 
	<%
	for (String s : friends) {
	%>
		 <%= s %>	
	<%
	}
	%>

</body>
</html>