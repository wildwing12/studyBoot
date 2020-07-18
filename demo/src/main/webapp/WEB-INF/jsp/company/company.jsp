<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<link href="/css/jquery-ui.css" rel="stylesheet" />
	<%@ include file="../include/header.jsp"%>
<script src="/js/jquery-ui.js"></script><!-- 데이트 피커ui  -->
<script src="/js/datepicker-ko.js"></script><!-- 데이트 피커ui  -->
<!-- 데이트 피커 사용 -->
<script type="text/javascript">
$(function(){

    $("#date1").datepicker();
    $("#date2").datepicker();
    $("#date3").datepicker();
    $("#date4").datepicker();
    //연구 필요
    //$('.target').before('<img src="http://jqueryui.com/resources/demos/datepicker/images/calendar.gif" class="overlay" id="date2" />').datepicker();
    	
    
});
</script>
<!-- <style type="text/css">
.overlay
{
padding-left:100px;
position: absolute;
margin-left: 3px;
margin-top: 9px;
}
</style> -->


<title>Admin</title>
</head>
<body class="sb-nav-fixed">
	<%@ include file="../include/navBar.jsp"%>
	<div id="layoutSidenav">
		<%@ include file="sideBar.jsp"%>
		<div id="layoutSidenav_content">
			<main>
				<div class="container-fluid">
					<br>
					<br>
					<div><h4>검색조건</h4></div>
					<div class="card mb-4 bg-light">
                            <div class="card-body">
			                    <div class="container">
									<div id ="searchBat">
									<table style="width:100%; text-align: center; ">
									<tr>
										<td width="15%">업체 아이디</td>
										<td width="15%"><input type="text" id="companyNum" name="companyNm"></td>
										<td width="8%">기간</td>
										<td width="15%"><input type="text" name="date" id="date1" class="target" size="12" readonly="readonly"/></td>
										<td width="2%">~</td>
										<td width="15%"><input type="text" name="date" id="date2" class="target" size="12" readonly="readonly"/></td>
										<td width="15%">사업자 등록번호</td>
										<td width="15%"><input type="text" name="companyNum"></td>
									</tr>
									<tr>
										<td width="15%">업체명</td>
										<td width="15%"><input type="text" id="companyNm" name="companyNm"></td>
										<td width="15%">거래처 코드</td>
										<td width="15%"><input type="text" name="code" id="code" /></td>
										<td width="15%" style="letter-spacing: -3px; padding-left: 10px; ">거래처 그룹코드</td>
										<td width="5%">
											<select>
												<option>전체</option>
												<option>2</option>
												<option>3</option>
												<option>4</option>
											</select>
										</td>
										<td width="15%">업체등급</td>
										<td width="5%">
											<select>
												<option>전체</option>
												<option>2</option>
												<option>3</option>
												<option>4</option>
											</select>
											</td>
									</tr>
									<tr>
										<td colspan="6"><button class=" btn btn-secondary" style="margin-top: 10px;">초기화</button>&nbsp;&nbsp;<button class=" btn btn-secondary" style="margin-top: 10px;">조회</button></td>
										<td>법인번호</td>
										<td><input type="text" id="rowNum" name="rowNum"/></td>
									</tr>
									</table>
									</div>
									</div>
                            </div>
                        </div>
					
					<div class="row">
					    <div class="col">
					      	<span>검색결과</span><span>(25건)</span>
					    </div>
					    <div class="col">
					      
					    </div>
					    <div class="col" style="text-align: right;">
					     <button class="btn btn-success">엑셀 다운로드</button>
					     <button class=" btn btn-secondary" data-toggle="modal" data-target="#reg_company">업체 등록</button>
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
								<tr>
									<td>1</td>
									<td>2</td>
									<td>3</td>
									<td>4</td>
									<td>5</td>
									<td>6</td>
									<td>7</td>
									<td>8</td>
									<td>9</td>
								</tr>
								<tr>
									<td>2</td>
									<td>2</td>
									<td>3</td>
									<td>4</td>
									<td>5</td>
									<td>6</td>
									<td>7</td>
									<td>8</td>
									<td>9</td>
								</tr>
								<tr>
									<td>3</td>
									<td>2</td>
									<td>3</td>
									<td>4</td>
									<td>5</td>
									<td>6</td>
									<td>7</td>
									<td>8</td>
									<td>9</td>
								</tr>
								<tr>
									<td>4</td>
									<td>2</td>
									<td>3</td>
									<td>4</td>
									<td>5</td>
									<td>6</td>
									<td>7</td>
									<td>8</td>
									<td>9</td>
								</tr>
								<tr>
									<td>5</td>
									<td>2</td>
									<td>3</td>
									<td>4</td>
									<td>5</td>
									<td>6</td>
									<td>7</td>
									<td>8</td>
									<td>9</td>
								</tr>
								<tr>
									<td>6</td>
									<td>2</td>
									<td>3</td>
									<td>4</td>
									<td>5</td>
									<td>6</td>
									<td>7</td>
									<td>8</td>
									<td>9</td>
								</tr>
								<tr>
									<td>7</td>
									<td>2</td>
									<td>3</td>
									<td>4</td>
									<td>5</td>
									<td>6</td>
									<td>7</td>
									<td>8</td>
									<td>9</td>
								</tr><tr>
									<td>8</td>
									<td>2</td>
									<td>3</td>
									<td>4</td>
									<td>5</td>
									<td>6</td>
									<td>7</td>
									<td>8</td>
									<td>9</td>
								</tr>
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
	<!-- Modal -->
	<div class="modal fade" id="reg_company" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true" >
	  <div class="modal-dialog modal-dialog-centered modal-xl " role="document">
	    <div class="modal-content">
	      <div class="modal-header bg-dark">
	        <h5 class="modal-title text-white " id="exampleModalCenterTitle" >업체 등록</h5>
	        <button type="button" class="close text-white" data-dismiss="modal" aria-label="Close">
	          <span aria-hidden="true">&times;</span>
	        </button>
	      </div>
	      <div class="modal-body">
	      <span>■기본정보</span>
	       <table class="table table-bordered text-center">
		       <tr>
			       <td colspan="2" class="bg-dark text-white">업체아이디</td>
			       <td><input type="text" readonly="readonly" size="50%"></td>
			       <td colspan="2" class="bg-dark text-white">거래처 구분</td>
			       <td><input type="text" size="50%"></td>
		       </tr>
		        <tr>
			       <td colspan="2" class="bg-dark text-white">업체명</td>
			       <td><input type="text" size="50%"></td>
			       <td colspan="2" class="bg-dark text-white">대표자명</td>
			       <td><input type="text" size="50%"></td>
		       </tr>
		        <tr>
			       <td colspan="2" class="bg-dark text-white">사업자등록번호</td>
			       <td><input type="text" size="50%"></td>
			       <td colspan="2" class="bg-dark text-white">법인번호</td>
			       <td><input type="text" size="50%"></td>
		       </tr>
		        <tr>
			       <td colspan="2" class="bg-dark text-white">업태</td>
			       <td><input type="text" size="50%"></td>
			       <td colspan="2" class="bg-dark text-white">거래처코드</td>
			       <td><input type="text" size="50%"></td>
		       </tr>
		        <tr>
			      <td colspan="2" class="bg-dark text-white">회사 연락처</td>
			       <td><input type="text" size="50%"></td>
			       <td colspan="2" class="bg-dark text-white">대표연락처</td>
			       <td><input type="text" size="50%"></td>
		       </tr>
		        <tr>
			       <td colspan="2" class="bg-dark text-white">이메일 주소</td>
			       <td colspan="4" class="text-left"><input type="text" size="50%">@
			       <select>
			       			<option>선택하세요</option>
			       			<option>naver.com</option>
			       			<option>gmail.com</option>
			       			<option>daum.net</option>
			       			<option>hanmail.net</option>
			       </select>
			       </td>
		       </tr>
		        <tr>
			       <td rowspan="3" class="bg-dark text-white" style="padding-top: 75px" >회사 주소</td>
			       <td colspan="5" class="text-left"> 우편번호 <input type="text" size="20%">&nbsp;&nbsp;<button class="btn btn-primary">주소찾기</button></td>
			       
		       </tr>
		        <tr>
			       <td colspan="5" class="text-left"> <input type="text" size="70%" readonly="readonly"></td>
		       </tr>
		        <tr>
			       <td colspan="5" class="text-left"> <input type="text" size="70%"></td>
		       </tr>
		        <tr>
			       <td rowspan="3" class="bg-dark text-white">계약기간 </td>
			       <td colspan="5" class="text-left">  <input type="text" size="30%" id="date3">~<input type="text" size="30%" id="date4"></button></td>
		       </tr>
	       	
	       </table>
	      </div>
	      <div class="modal-footer" style="border-top: none; margin: 0 auto" >
	        <button type="button" class="btn btn-secondary" data-dismiss="modal">초기화</button>
	        <button type="button" class="btn btn-primary">신규등록</button>
	      </div>
	    </div>
	  </div>
	</div>	
</body>
</html>