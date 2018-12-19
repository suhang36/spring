<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action="testModeAttribute" method="post">
	<input type="text" name="name">
	<input type="hidden" value="12" name="id">
	<input type="submit" value="提交">
	</form>
	<br><br>
	
	<a href="testRedirect">Test Redirect</a>
	<br><br>
	
	<a href="testView">Test view</a>
	<br><br>
	
	<a href="testSessionAttribute">Test SessionAttribute</a>
	<br><br>

	<a href="testMap">Test Map</a>
	<br><br>
	
	<a href="testModelAndView">Test ModelAndView</a>
	<br><br>
	
	<a href="testServletAPI">Test ServletAPI</a>
	<br><br>

	<form action="testPojo" method="post">
	name:<input type="text" name="name">
	password:<input type="password" name="password">
	address<input type="text" name="address.address">
	<input type="submit" value="提交">
	
	</form>
	<br><br>

	<a href="testCookieValue">Test CookieValue</a>
	<br><br>
	
	<a href="testRequestParam?name=suhang&age=21">Test RequestParam</a>
	<br><br>

	<form action="testRest/10" method="post">
	<input type="hidden" value="DELETE" name="_method" >
	<input type="submit" value="Delete">	
	</form>
	<br><br>
	
	<form action="testRest/10" method="post">
	<input type="hidden" value="PUT" name="_method" >
	<input type="submit" value="put">
	</form>
	
	<br><br>
	<form action="testRest" method="post">
	<input type="submit">
	</form>
	<br><br>
	
	<a href="testRest/10">Test Rest Get</a>
	<br><br>

	<a href="testVariable/10">Test Variable</a>
	<br><br>

	<a href="testVariable/10">Test Variable</a>
	<br><br>


	<a href="testParamsAndHeander?age=10">Test ParamsAndHeander</a>
	<br><br>
	
	
	<form action="testMethod" method="post">
	<input type="submit" value="Test Method">
	</form>

	<br><br>
	<a href="testSpring/testRequestMapping">Test RequestMapping</a>
</body>
</html>