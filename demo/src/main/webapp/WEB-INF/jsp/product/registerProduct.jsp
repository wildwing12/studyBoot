<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style scoped>
#staticBackdropLabel {
	font-weight: 600;
}
#productRegisterTable tr > th {
	width: 15%;
	vertical-align: middle;
}
input[name="pdiId"] {
	background: #e6e6e6; 
	font-weight: 600;
}
</style>
<div class="modal fade" id="registerProduct" data-backdrop="static" tabindex="-1" role="dialog" aria-labelledby="staticBackdropLabel" aria-hidden="true">
  <div class="modal-dialog modal-lg" role="document">
    <div class="modal-content">
      <div class="modal-header bg-dark text-white">
        <h5 class="modal-title" id="staticBackdropLabel">상품등록</h5>
        <button type="button" class="close text-white" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
      	<p>■ 기본정보</p>
      	<form id="pdRegForm" action="">
        <table class="table table-bordered" id="productRegisterTable">
        	<tr>
        		<th class="bg-secondary text-white">상품ID</th>
        		<td><input name="pdiId" readonly></td>
        		<th class="bg-secondary text-white">상품명</th>
        		<td style="width: 30%;"><input name="pdiNm" style="width: 90%;"></td>
        	</tr>
        	<tr>
        		<th class="bg-secondary text-white">가격 (원)</th>
        		<td style="width: 30%;"><input name="pdiPrc" style="width: 90%;"></td>
        		<th class="bg-secondary text-white">배송비</th>
        		<td style="width: 30%;"><input name="pdiDvFee" style="width: 90%;"></td>
        	</tr>
        	<tr>
        		<th class="bg-secondary text-white">업체ID</th>
        		<td colspan="3">
        			<input id="comId" style="width: 80%;">&nbsp;
        			<button type="button" class="btn btn-secondary searchCompany">업체 조회</button>
        		</td>
        	</tr>
        	<tr>
        		<th class="bg-secondary text-white">업체명</th>
        		<td style="width: 30%;">
        			<input id="comNm" style="width: 90%;">
        			<input type="hidden" name="comNo">
        		</td>
        		<th class="bg-secondary text-white">제조사명</th>
        		<td>
        			<select name="pdaManu" style="width: 70%;">
        				<option></option>
        			</select>
        		</td>
        	</tr>
        	<tr>
        		<th class="bg-secondary text-white">CPU 종류</th>
        		<td>
        			<select name="pdaCpu" style="width: 70%;">
        				<option></option>
        			</select>
        		</td>
        		<th class="bg-secondary text-white">화면크기</th>
        		<td>
        			<select name="pdaSize" style="width: 70%;">
        				<option></option>
        			</select>
        		</td>
        	</tr>
        	<tr>
        		<th class="bg-secondary text-white">RAM 용량</th>
        		<td>
        			<select name="pdaRam" style="width: 70%;">
        				<option></option>
        			</select>
        		</td>
        		<th class="bg-secondary text-white">SSD 용량</th>
        		<td>
        			<select name="pdaSsd" style="width: 70%;">
        				<option></option>
        			</select>
        		</td>
        	</tr>
        	<tr>
        		<th class="bg-secondary text-white">운영체제</th>
        		<td>
        			<select name="pdaOs" style="width: 70%;">
        				<option></option>
        			</select>
        		</td>
        		<th class="bg-secondary text-white">무게</th>
        		<td>
        			<select name="pdaWeight" style="width: 70%;">
        				<option></option>
        			</select>
        		</td>
        	</tr>
        	<tr>
        		<th class="bg-secondary text-white">상품IMG</th>
        		<td colspan="3" style="vertical-align: middle;">
        			<div class="custom-file">
					  <input type="file" class="custom-file-input" id="customFile" name="attNm">
					  <label class="custom-file-label" for="customFile">파일 첨부</label>
					</div>
        		</td>
        	</tr>
        </table>
        </form>
      </div>
      <div class="modal-footer" style="margin: 0 auto; border-top: none;">
        <button type="button" class="btn btn-dark" data-dismiss="modal">초기화</button>
        <button type="button" class="btn btn-dark insert">신규등록</button>
      </div>
    </div>
  </div>
</div>
<script>
$('.registerProduct').on('click', function(e){
	e.preventDefault();
	
	getPdiId();
});

$('.insert').on('click', function(e){
	e.preventDefault();
	
	let data1 = $('#pdRegForm').serializeObject();
	console.log('data1 => ',data1);
});


const getPdiId = async () => {
	let res = await axios.get(contextPath+'/product/getPdiId');
	let data = res.data;
	if(Object.keys(data).length){
		if(!CommonUtil.isEmpty(data.pdiId)){
			console.log('data =>', res.data);
			$('#pdRegForm input[name=pdiId]').val(data.pdiId);
		}
	}
}
</script>
