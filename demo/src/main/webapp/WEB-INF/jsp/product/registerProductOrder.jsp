<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
#staticBackdropLabel {
	font-weight: 600;
}
#productOrderRegisterTable tr > th {
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
        <table class="table table-bordered" id="productOrderRegisterTable">
        	<tr>
        		<th class="bg-secondary text-white">입점업체</th>
        		<td style="width: 30%;"><input style="width: 90%;"></td>
        		<th class="bg-secondary text-white">업체ID</th>
        		<td style="width: 30%;"><input readonly style="width:90%; background:#e6e6e6;"></td>
        	</tr>
        	<tr>
        		<th class="bg-secondary text-white">상품명</th>
        		<td style="width: 30%;"><input style="width: 90%;"></td>
        		<th class="bg-secondary text-white">재고수량</th>
        		<td style="width: 30%;"><input type="number" style="width: 90%;"></td>
        	</tr>
        	<tr>
        		<th class="bg-secondary text-white">상품ID</th>
        		<td colspan="3">
        			<input style="width: 85%;">&nbsp;
        			<button type="button" class="btn btn-secondary">조회</button>
        		</td>
        	</tr>
        	<tr>
        		<th class="bg-secondary text-white">발주수량</th>
        		<td style="width: 30%;"><input type="number" style="width: 90%;"></td>
        		<th class="bg-secondary text-white">가격(원)</th>
        		<td style="width: 30%;"><input style="width: 90%;"></td>
        	</tr>
        </table>
      </div>
      <div class="modal-footer" style="margin: 0 auto; border-top: none;">
        <button type="button" class="btn btn-dark" data-dismiss="modal">초기화</button>
        <button type="button" class="btn btn-dark">신청</button>
      </div>
    </div>
  </div>
</div>