<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin - 택배사 관리</title>
</head>
<body>
	<%@ include file="../include/header.jsp"%>
	<%@ include file="../include/navBar.jsp"%>
	<div id="layoutSidenav">
		<%@ include file="sideBarOrder.jsp" %>
		<div id="layoutSidenav_content">
			<main>
				<div class="container-fluid" style="margin-top: 20px;">
					<p><strong>검색조건</strong></p>
					<div class="card mb-4 bg-light">
                    	<div class="card-body">
                        	<table class="table table-borderless">
                        		<tr>
                        			<th style="width:10%;">택배일자</th>
                        			<td>
                        				<input id="regDt1" readonly> ~ <input id="regDt2" readonly>
                        			</td>
                        			<th style="width:10%;">배송현황</th>
                        			<td style="width:30%;">
                        				<!-- 아래 값들은 DB에서 코드로 관리해야 할 듯? -->
                        				<input type="checkbox">&nbsp;접수&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox">&nbsp;발송&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox">&nbsp;반품&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        			</td>
                        		</tr>
                        		<tr>
                        			<th style="width:10%;">검색어</th>
                        			<td>
                        				<select style="width: 20%;">
                        					<option></option>
                        				</select>&nbsp;
                        				<input style="width: 60%;">
                        			</td>
                        			<th style="width:10%;">택배업체</th>
                        			<td>
                        				<select style="width: 40%;">
                        					<option></option>
                        				</select>&nbsp;
                        			</td>
                        		</tr>
                        		<tr>
                        			<td align="center" colspan="4">
                        				<button type="button" class="btn btn-dark">초기화</button>
                        				<button type="button" class="btn btn-dark">조회</button>
                        			</td>
                        		</tr>
                        	</table>
                    	</div>
                	</div>
                	<div class="row">
					    <div class="col">
					      	<span><strong>검색결과</strong> (0건)</span>
					    </div>
					    <div class="col">
					      
					    </div>
					    <div class="col" style="text-align: right;">
					     <button class="btn">
					     	<img alt="엑셀 다운로드" src="/img/excel.jpg">
					     </button>
					    </div>
				  </div>
				<table class="table table-bordered text-center" style="margin-top: 10px" >
					<thead class="thead-dark">
						<tr>
							<th>NO</th>
							<th>택배번호</th>
							<th>택배업체명</th>
							<th>접수현황</th>
							<th>상품명</th>
							<th>배송현황</th>
							<th>기사 연락처</th>
							<th>접수일시</th>
						</tr>
					</thead>
					<tbody>
					</tbody>
				</table>
				<nav aria-label="Page navigation example">
				  <ul class="pagination justify-content-center">
				    <li class="page-item disabled">
				      <a class="page-link" href="#" tabindex="-1" aria-disabled="true">Previous</a>
				    </li>
				    <li class="page-item"><a class="page-link" href="#">1</a></li>
				    <li class="page-item"><a class="page-link" href="#">2</a></li>
				    <li class="page-item"><a class="page-link" href="#">3</a></li>
				    <li class="page-item">
				      <a class="page-link" href="#">Next</a>
				    </li>
				  </ul>
				</nav>
				</div>
			</main>
			<%@ include file="../include/footer.jsp" %>
		</div>
	</div>
<script>
$(document).ready(function(){
	$('#regDt1').datepicker();
	$('#regDt2').datepicker();
});

</script>
</body>
</html>