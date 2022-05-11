<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java Beans</title>
</head>
<body>
	<jsp:useBean class="beans.HelloBeans" id="hello" />
	
	<jsp:getProperty property="name" name="hello"/><br>
	<jsp:getProperty property="number" name="hello"/><br>
	
	<%-- <jsp:setProperty property="name" name="hello" value="Amy"/><br>
	<jsp:setProperty property="number" name="hello" value="12345"/><br>--%>
	
	<%-- <jsp:setProperty property="name" name="hello" param="a"/><br>
	<jsp:setProperty property="number" name="hello" param="b"/>--%>
	
	<jsp:setProperty property="*" name="hello"/>
	
	<hr>
	
	<jsp:getProperty property="name" name="hello"/><br>
	<jsp:getProperty property="number" name="hello"/><br>
	
</body>
</html>