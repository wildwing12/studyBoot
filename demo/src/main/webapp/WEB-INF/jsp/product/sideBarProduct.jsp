<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="layoutSidenav_nav">
	<nav class="sb-sidenav accordion sb-sidenav-dark" id="sidenavAccordion">
		<div class="sb-sidenav-menu">
			<div class="nav">
				<a class="nav-link collapsed" href="#" data-toggle="collapse"
					data-target="#collapseLayouts" ><div class="sb-nav-link-icon">
					</div> 상품관리
					<div class="sb-sidenav-collapse-arrow">
						<i class="fas fa-angle-down"></i>
					</div></a>
				<div id="collapseLayouts"
					aria-labelledby="headingOne" data-parent="#sidenavAccordion">
					<nav class="sb-sidenav-menu-nested nav">
						<a class="nav-link" href="/product/index">상품정보</a>
						<a class="nav-link" href="/product/order">상품발주</a>
					</nav>
				</div>
			</div>
		</div>
	</nav>
</div>