/**
 * 
 */
function regCom(){
	var param = {
			comId:$("#comNo").val(),
			comTrCd:$("#comTrCd").val(),
			comNm:$("#comNm").val(),
			comCnm:$("#comCnm").val(),
			comCno:$("#comCno").val(),
			comLno:$("#comLno").val(),
			comType:$("#comType").val(),
			comTrGrpCd:$("#comTrGrpCd").val(),
			comTel:$("#comTel").val(),
			comEmail:$("#comEmail1").val()+'@'+$("#comEmail2").val(),
			comZip:$("#comZip").val(),
			comAddr:$("#comAddr").val(),
			comAddr2:$("#comAddr2").val(),
			comPrdSt:$("#comPrdSt").val(),
			comPrdEd:$("#comPrdEd").val()
	}
	
	$.ajax({
		type : "POST",
		url : "/company/regCompany",
		dataType : 'json',
		contentType : 'application/json',
		data : param,
		success :function(result){
			console.log(result);
			alert("등록되었습니다.")
			location.reload(true); 
		} ,
		error   : function(){
			alert("일시적으로 문제가 발생하여씨습니다. /n 다시 시도해주시기 바랍니다.")
		}
	});
}
 //회사 등록시 아이디 생성
function createId(){
	debugger;
	$.ajax({
		type : "get",
		url : "/company/getId",
		dataType : 'json',
		success :function(result){
			$("#comIdHtml").html(result.data.COM_ID);
			$("#comIdHtml").html(result.data.COM_ID);
		} ,
		error   : function(){
			alert("일시적으로 문제가 발생하여씨습니다. /n 다시 시도해주시기 바랍니다.")
		}
	});
}
 

function list(no){
	$("#tbodyLIst").empty();
	var companyNo = $("#companyNo").val();
	var stData = $("#stData").val();
	var edData = $("#edData").val();
	var companyNum = $("#companyNum").val();
	var companyNm = $("#companyNm").val();
	var nvCode = $("#nvCode").val();
	var nvCodeGroup = $("#nvCodeGroup").val();
	var copanyGrade = $("#copanyGrade").val();
	var rowNum = $("#rowNum").val();
	var param ={
			comNo : companyNo,
			comPrdSt: stData,
			comPrdEd : edData,
			comCno:companyNum,
			comNm:companyNm,
			comTrCd:nvCode,
			comTrGrpCd:nvCodeGroup,
			comRk:copanyGrade,
			comLno:rowNum
			
	}
	$.ajax({
		type : "POST",
		url : "/company/list",
		dataType : 'json',
		contentType : 'application/json',
		data : JSON.stringify(param),
		success :function(result){
			console.log(result);
			var html ='';
			$("#cnts").html('('+result.data.cnt+'건)');
			var list = result.data.list;
			list.forEach((item)=>{
				html+=`<tr>
					       <td>${item.rnum}</td>
					       <td>${item.COM_NO}</td>
					       <td>${item.COM_ID}</td>
					       <td>${item.COM_NM}</td>
					       <td>${item.COM_CNM}</td>
					       <td>${item.COM_TYPE}</td>
					       <td>${item.COM_TR_CD}</td>
					       <td>${item.COM_RK}</td>
					       <td>${item.COM_PRD_ST}~${item.COM_PRD_ED}</td>
					   </tr>`
			});
			$("#tbodyLIst").append(html);
		} ,
		error   : function(){
			alert("일시적으로 문제가 발생하여씨습니다. /n 다시 시도해주시기 바랍니다.")
		}
	});
}
$(function(){

    $("#stData").datepicker();
    $("#edData").datepicker();
    $("#comPrdSt").datepicker();
    $("#comPrdEd").datepicker();
    	
    list();
    
    
});
