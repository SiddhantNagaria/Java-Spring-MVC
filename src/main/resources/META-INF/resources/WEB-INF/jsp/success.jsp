<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form Result</title>
</head>
<body>
	<h2>welcome, ${username}</h2>
	<h3>Your email is : ${email}</h3>
	<h3>password: ${password}</h3>


	<h2>welcome, ${user.userName}</h2>
	<h3>Your email is : ${user.email}</h3>
	<h3>password: ${user.password}</h3>

</body>
</html>