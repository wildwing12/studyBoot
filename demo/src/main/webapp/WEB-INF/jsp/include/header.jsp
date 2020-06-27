<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>

<c:set var="path" value="${pageContext.request.contextPath}" />

<!-- jQuery CDN -->
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<!-- axios CDN -->
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>

<!-- moment(날짜 데이터 관련 라이브러리) CDN -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.27.0/moment.min.js"></script>
<!-- 자주 쓰이는(혹은 쓰일) 기능 모음 js -->
<script src="js/utils.js"></script>