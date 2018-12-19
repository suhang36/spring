<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>hello world</h4>
	<br><br>
	${requestScope.time}
	<br><br>
	user request:${requestScope.user}
	<br><br>
	user session:${sessionScope.user}
	<br><br>
	address request:${requestScope.address}
	<br><br>
	address session:${sessionScope.address}
	<br><br>
	
	user request:${requestScope.user}
	<br><br>
</body>
</html>