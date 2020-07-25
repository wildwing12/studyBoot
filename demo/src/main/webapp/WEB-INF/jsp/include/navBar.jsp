<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<nav class="sb-topnav navbar navbar-expand navbar-dark bg-dark">
	<a class="navbar-brand" href="/">ADMIN</a>
	<button class="btn btn-link btn-sm order-1 order-lg-0"
		id="sidebarToggle" href="#">
		<i class="fas fa-bars"></i>
	</button>
	<div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
		<li class="nav-item mr-0 mr-md-3">
	        <a class="nav-link" href="#">직원관리</a>
	    </li>
		<li class="nav-item mr-0 mr-md-3">
	        <a class="nav-link" href="#">회원관리</a>
	    </li>
	    <li class="nav-item mr-0 mr-md-3">
	        <a class="nav-link" href="/company">업체관리</a>
	    </li>
	    <li class="nav-item mr-0 mr-md-3">
	        <a class="nav-link" href="/product/index">상품관리</a>
	    </li>
	    <li class="nav-item mr-0 mr-md-3">
	        <a class="nav-link" href="/order/index">주문관리</a>
	    </li>
	    <li class="nav-item mr-0 mr-md-3">
	        <a class="nav-link" href="#">정산관리</a>
	    </li>
	    <li class="nav-item mr-0 mr-md-3">
	        <a class="nav-link" href="#">게시판관리</a>
	    </li>
	</ul>
	</div>
	<!-- Navbar-->
	<ul class="navbar-nav ml-auto mr-0 mr-md-3 my-2 my-md-0">
		<li class="nav-item dropdown"><a class="nav-link dropdown-toggle"
			id="userDropdown" href="#" role="button" data-toggle="dropdown"
			aria-haspopup="true" aria-expanded="false"><i
				class="fas fa-user fa-fw"></i></a>
			<div class="dropdown-menu dropdown-menu-right"
				aria-labelledby="userDropdown">
				<a class="dropdown-item" href="#">Settings</a><a
					class="dropdown-item" href="#">Activity Log</a>
				<div class="dropdown-divider"></div>
				<a class="dropdown-item" href="login.html">Logout</a>
			</div></li>
	</ul>
</nav>
