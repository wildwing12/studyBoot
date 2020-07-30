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
		console.log('empty? ', CommonUtil.isEmpty(value));
		document.write('Empty? ', CommonUtil.isEmpty(value));
		
		var now = new Date();
		console.log('time => ', CommonUtil.setTimeFormat(now));
		document.write('<br>TIME => ', CommonUtil.setTimeFormat(now));
	</script>
</body>
</html>