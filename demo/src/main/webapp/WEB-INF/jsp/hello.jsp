<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="include/header.jsp" %>
<h2>hello Spring boot</h2>
<c:forEach var="row" items="${list}">
	<h3>${row.pd_nm}</h3>
</c:forEach>
</body>
</html>