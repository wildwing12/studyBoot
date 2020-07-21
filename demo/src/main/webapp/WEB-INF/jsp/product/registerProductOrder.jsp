<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
#staticBackdropLabel {
	font-weight: 600;
}
#productRegisterTable tr > th {
	width: 15%;
	vertical-align: middle;
}
</style>
<div class="modal fade" id="registerProductOrder" data-backdrop="static" tabindex="-1" role="dialog" aria-labelledby="staticBackdropLabel" aria-hidden="true">
  <div class="modal-dialog modal-lg" role="document">
    <div class="modal-content">
      <div class="modal-header bg-dark text-white">
        <h5 class="modal-title" id="staticBackdropLabel">발주신청</h5>
        <button type="button" class="close text-white" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
      	<p>■ 기본정보</p>
        <table class="table table-bordered" id="productRegisterTable">
        	<tr>
        		<th class="bg-secondary text-white">상품아이디</th>
        		<td style="width: 30%;"><input style="width: 90%;"></td>
        		<th class="bg-secondary text-white">상품코드</th>
        		<td>
        			<select style="width: 70%;">
        				<option></option>
        			</select>
        		</td>
        	</tr>
        	<tr>
        		<th class="bg-secondary text-white">상품명</th>
        		<td style="width: 30%;"><input style="width: 90%;"></td>
        		<th class="bg-secondary text-white">가격 (원)</th>
        		<td style="width: 30%;"><input style="width: 90%;"></td>
        	</tr>
        	<tr>
        		<th class="bg-secondary text-white">업체아이디</th>
        		<td colspan="3">
        			<input style="width: 80%;">&nbsp;
        			<button type="button" class="btn btn-secondary">업체 조회</button>
        		</td>
        	</tr>
        	<tr>
        		<th class="bg-secondary text-white">업체명</th>
        		<td style="width: 30%;"><input style="width: 90%;"></td>
        		<th class="bg-secondary text-white">제조사명</th>
        		<td>
        			<select style="width: 70%;">
        				<option></option>
        			</select>
        		</td>
        	</tr>
        	<tr>
        		<th class="bg-secondary text-white">CPU 종류</th>
        		<td>
        			<select style="width: 70%;">
        				<option></option>
        			</select>
        		</td>
        		<th class="bg-secondary text-white">화면크기</th>
        		<td>
        			<select style="width: 70%;">
        				<option></option>
        			</select>
        		</td>
        	</tr>
        	<tr>
        		<th class="bg-secondary text-white">RAM 용량</th>
        		<td>
        			<select style="width: 70%;">
        				<option></option>
        			</select>
        		</td>
        		<th class="bg-secondary text-white">SSD 용량</th>
        		<td>
        			<select style="width: 70%;">
        				<option></option>
        			</select>
        		</td>
        	</tr>
        	<tr>
        		<th class="bg-secondary text-white">운영체제</th>
        		<td>
        			<select style="width: 70%;">
        				<option></option>
        			</select>
        		</td>
        		<th class="bg-secondary text-white">무게</th>
        		<td>
        			<select style="width: 70%;">
        				<option></option>
        			</select>
        		</td>
        	</tr>
        	<tr>
        		<th class="bg-secondary text-white">상품이미지</th>
        		<td colspan="3" style="vertical-align: middle;">
        			<div class="custom-file">
					  <input type="file" class="custom-file-input" id="customFile">
					  <label class="custom-file-label" for="customFile">파일 첨부</label>
					</div>
        		</td>
        	</tr>
        </table>
      </div>
      <div class="modal-footer" style="margin: 0 auto; border-top: none;">
        <button type="button" class="btn btn-dark" data-dismiss="modal">초기화</button>
        <button type="button" class="btn btn-dark">신규등록</button>
      </div>
    </div>
  </div>
</div>