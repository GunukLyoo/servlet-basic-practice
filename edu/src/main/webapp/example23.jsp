<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="my" uri="http://myTags.com"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Custom Tag</title>
</head>
<body>
	<!--<my:first></my:first>-->
	<!--<my:first/> body-content empty -->
	<my:first> <%= 1+2 %></my:first>
</body>
</html>