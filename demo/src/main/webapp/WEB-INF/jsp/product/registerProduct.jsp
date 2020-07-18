<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <table class="table">
        	<tr>
        		<th class="bg-secondary text-white" style="width: 15%;">상품아이디</th>
        		<td style="width: 30%;"><input style="width: 90%;"></td>
        		<th class="bg-secondary text-white" style="width: 15%;">상품코드</th>
        		<td>
        			<select style="width: 70%;">
        				<option></option>
        			</select>
        		</td>
        	</tr>
        	<tr>
        		<th class="bg-secondary text-white" style="width: 15%;">상품명</th>
        		<td style="width: 30%;"><input style="width: 90%;"></td>
        		<th class="bg-secondary text-white" style="width: 15%;">가격 (원)</th>
        		<td style="width: 30%;"><input style="width: 90%;"></td>
        	</tr>
        	<tr>
        		<th class="bg-secondary text-white" style="width: 15%;">업체아이디</th>
        		<td colspan="3">
        			<input style="width: 70%;">&nbsp;
        			<button type="button" class="btn btn-secondary">업체 조회</button>
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