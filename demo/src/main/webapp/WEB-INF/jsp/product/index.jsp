<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin - 상품관리</title>
<style type="text/css">
input[type=checkbox] {
	width: 2%;
}
</style>
</head>
<body>
	<%@ include file="../include/header.jsp"%>
	<%@ include file="../include/navBar.jsp"%>
	<div id="layoutSidenav">
		<%@ include file="sideBarProduct.jsp" %>
		<div id="layoutSidenav_content">
			<main>
				<div class="container-fluid" style="margin-top: 20px;">
					<p><strong>검색조건</strong></p>
					<div class="card mb-4 bg-light">
                    	<div class="card-body">
                        	<table class="table table-borderless">
                        		<tr>
                        			<th style="width:10%;">제조사</th>
                        			<td colspan="3">
                        				<input type="checkbox">&nbsp;LG전자&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox">&nbsp;삼성전자&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox">&nbsp;APPLE&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox">&nbsp;레노버&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox">&nbsp;ASUS&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox">&nbsp;DELL&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox">&nbsp;MSI&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox">&nbsp;기타&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        			</td>
                        		</tr>
                        		<tr>
                        			<th style="width:10%;">CPU</th>
                        			<td colspan="3">
                        				<input type="checkbox">&nbsp;코어i7-10세대&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox">&nbsp;코어i5-10세대&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox">&nbsp;코어i3-10세대&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox">&nbsp;코어i7-9세대&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox">&nbsp;코어i5-9세대&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox">&nbsp;라이젠7-3세대&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox">&nbsp;라이젠5-3세대&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox">&nbsp;기타&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        			</td>
                        		</tr>
                        		<tr>
                        			<th style="width:10%;">화면크기</th>
                        			<td colspan="3">
                        				<input type="checkbox">&nbsp;17인치대&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox">&nbsp;16인치대&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox">&nbsp;15인치대&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox">&nbsp;14인치대&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox">&nbsp;13인치대&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox">&nbsp;기타&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        			</td>
                        		</tr>
                        		<tr>
                        			<th style="width:10%;">RAM</th>
                        			<td>
                        				<input type="checkbox">&nbsp;16GB&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox">&nbsp;8GB&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox">&nbsp;4GB&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox">&nbsp;기타&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        			</td>
                        			<th style="width:10%;">운영체제</th>
                        			<td>
                        				<input type="checkbox">&nbsp;Win10&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox">&nbsp;MacOS&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox">&nbsp;미포함&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox">&nbsp;기타&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        			</td>
                        		</tr>
                        		<tr>
                        			<th style="width:10%;">SSD용량</th>
                        			<td colspan="3">
                        				<input type="checkbox">&nbsp;1TB 초과&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox">&nbsp;1TB~513GB&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox">&nbsp;512GB~257GB&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox">&nbsp;256GB~129GB&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox">&nbsp;128GB 이하&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        			</td>
                        		</tr>
                        		<tr>
                        			<th style="width:10%;">무게</th>
                        			<td>
                        				<input type="checkbox">&nbsp;1kg 이하&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox">&nbsp;1.0~1.4kg&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox">&nbsp;1.4~1.7kg&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox">&nbsp;1.7~2.0kg&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox">&nbsp;2kg 이상&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        			</td>
                        			<th style="width:10%;">상품코드</th>
                        			<td>
                        				<select style="width: 30%;">
                        					<option></option>
                        				</select>
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
                        			<th style="width:10%;">상품등록일</th>
                        			<td>
                        				<input id="regDt1" readonly> ~ <input id="regDt2" readonly>
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
					     	<img alt="엑셀 다운로드" src="/img/excel.jpg" width="40px" height="40px">
					     </button>
					     <button class="btn btn-secondary" data-toggle="modal" data-target="#registerProduct">상품등록</button>
					    </div>
				  </div>
				<table class="table table-bordered text-center" style="margin-top: 10px" >
					<thead class="thead-dark">
						<tr>
							<th>NO</th>
							<th>업체아이디</th>
							<th>업체명</th>
							<th>대표자명</th>
							<th>업태</th>
							<th>거래처코드</th>
							<th>거래처그룹코드</th>
							<th>업체등급</th>
							<th>계약기간</th>
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
<%@ include file="registerProduct.jsp" %>
<script>
$(document).ready(function(){
	$('#regDt1').datepicker();
	$('#regDt2').datepicker();
});

</script>
</body>
</html>