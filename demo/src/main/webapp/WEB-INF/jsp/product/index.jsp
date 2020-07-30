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
                        				<input type="checkbox" name="pdaManu" value="pd001">&nbsp;LG전자&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox" name="pdaManu" value="pd005">&nbsp;삼성전자&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox" name="pdaManu" value="pd004">&nbsp;APPLE&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox" name="pdaManu" value="pd003">&nbsp;레노버&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox" name="pdaManu" value="pd002">&nbsp;ASUS&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        			</td>
                        		</tr>
                        		<tr>
                        			<th style="width:10%;">CPU</th>
                        			<td colspan="3">
                        				<input type="checkbox" name="pdaCpu" value="pd006">&nbsp;코어i7-10세대&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox" name="pdaCpu" value="pd007">&nbsp;코어i5-10세대&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox" name="pdaCpu" value="pd008">&nbsp;라이젠7-5세대&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox" name="pdaCpu" value="pd009">&nbsp;라이젠5-5세대&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox" name="pdaCpu" value="pd010">&nbsp;기타&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        			</td>
                        		</tr>
                        		<tr>
                        			<th style="width:10%;">화면크기</th>
                        			<td colspan="3">
                        				<input type="checkbox" name="pdaSize" value="pd011">&nbsp;17인치대&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox" name="pdaSize" value="pd012">&nbsp;16인치대&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox" name="pdaSize" value="pd013">&nbsp;15인치대&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox" name="pdaSize" value="pd014">&nbsp;14인치대&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox" name="pdaSize" value="pd015">&nbsp;13인치대&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        			</td>
                        		</tr>
                        		<tr>
                        			<th style="width:10%;">RAM</th>
                        			<td style="width:40%;">
                        				<input type="checkbox" value="pd016">&nbsp;64GB&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox" value="pd017">&nbsp;32GB&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox" value="pd018">&nbsp;16GB&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox" value="pd019">&nbsp;8GB&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox" value="pd020">&nbsp;4GB&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        			</td>
                        			<th style="width:10%;">운영체제</th>
                        			<td style="width:40%;">
                        				<input type="checkbox" value="pd024">&nbsp;Win10&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox" value="pd025">&nbsp;Win10 Pro&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox" value="pd026">&nbsp;미포함&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        			</td>
                        		</tr>
                        		<tr>
                        			<th style="width:10%;">SSD용량</th>
                        			<td colspan="3">
                        				<input type="checkbox" value="pd021">&nbsp;1TB 초과&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox" value="pd022">&nbsp;512GB&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox" value="pd023">&nbsp;256GB&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        			</td>
                        		</tr>
                        		<tr>
                        			<th style="width:10%;">무게</th>
                        			<td colspan="3">
                        				<input type="checkbox" value="pd027">&nbsp;1.0kg 이하&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox" value="pd028">&nbsp;1.4kg&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox" value="pd029">&nbsp;1.7kg&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox" value="pd030">&nbsp;2.0kg&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        				<input type="checkbox" value="pd031">&nbsp;2.3kg 이상&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        			</td>
                        			<!-- <th style="width:10%;">상품코드</th>
                        			<td>
                        				<select style="width: 30%;">
                        					<option></option>
                        				</select>
                        			</td> -->
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
							<th>상품ID</th>
							<th>상품명</th>
							<th>업체명</th>
							<th>재고수량</th>
							<th>발주일자</th>
							<th>발주수량</th>
							<th>가격</th>
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
	
	CommonUtil.appearFileName();
});

</script>
</body>
</html>