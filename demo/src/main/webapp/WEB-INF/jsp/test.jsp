<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="include/header.jsp" %>
</head>
<body>
	<script>
		var value = 1 > 2 ? true : undefined;
		console.log('empty? ', IsEmpty(value));
		document.write('Empty? ', IsEmpty(value));
		
		var now = new Date();
		console.log('time => ', SetTimeFormat(now));
		document.write('<br>TIME => ', SetTimeFormat(now));
	</script>
</body>
</html>