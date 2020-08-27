$('.search').on('click', function(){
	let cdNm = CdNm.PD;
	console.log('코드: ',cdNm);
	
	let manuArr = [];
	$("input[name='pdaManu']:checked").each(function(i){
		manuArr.push(cdNm+$(this).val());
	})
	console.log('manu => ',manuArr);
	
	console.log('코드명: ',CdVal(cdNm,'105'));
});

$('.registerProduct').on('click', function(e){
	e.preventDefault();
	
	getPdiId(); //상품ID 자동부여
});

$('.insert').on('click', function(e){
	e.preventDefault();
	
	//상품 정보
	let pdiId = CommonUtil.ignoreEmptyValue($('#pdRegForm input[name=pdiId]').val());
	let pdiNm = CommonUtil.ignoreEmptyValue($('#pdRegForm input[name=pdiNm]').val());
	let pdiPrc = CommonUtil.ignoreEmptyValue($('#pdRegForm input[name=pdiPrc]').val());
	let pdiDvFee = CommonUtil.ignoreEmptyValue($('#pdRegForm input[name=pdiDvFee]').val());
	let pdiAmt = CommonUtil.ignoreEmptyNumber($('#pdRegForm input[name=pdiAmt]').val()); 
	let pdaManu = CommonUtil.ignoreEmptyValue($('#pdRegForm select[name=pdaManu]').val());
	let pdaCpu = CommonUtil.ignoreEmptyValue($('#pdRegForm select[name=pdaCpu]').val());
	let pdaSize = CommonUtil.ignoreEmptyValue($('#pdRegForm select[name=pdaSize]').val());
	let pdaRam = CommonUtil.ignoreEmptyValue($('#pdRegForm select[name=pdaRam]').val());
	let pdaSsd = CommonUtil.ignoreEmptyValue($('#pdRegForm select[name=pdaSsd]').val());
	let pdaOs = CommonUtil.ignoreEmptyValue($('#pdRegForm select[name=pdaOs]').val());
	let pdaWeight = CommonUtil.ignoreEmptyValue($('#pdRegForm select[name=pdaWeight]').val());
	
	let useYn = 'Y'; //사용여부(기본 Y)
	
	let pdAttrInfo = {}; //상품 속성 정보를 담을 객체
	pdAttrInfo.pdaManu = CdNm.PD + pdaManu;
	pdAttrInfo.pdaCpu = CdNm.PD + pdaCpu;
	pdAttrInfo.pdaSize = CdNm.PD + pdaSize;
	pdAttrInfo.pdaRam = CdNm.PD + pdaRam;
	pdAttrInfo.pdaSsd = CdNm.PD + pdaSsd;
	pdAttrInfo.pdaOs = CdNm.PD + pdaOs;
	pdAttrInfo.pdaWeight = CdNm.PD + pdaWeight;
	
	//data로 보낼 객체
	let paramData = {
		pdiId: 	   pdiId,
		pdiNm: 	   pdiNm,
		pdiPrc:    pdiPrc,
		pdiDvFee:  pdiDvFee,
		pdiAmt:    pdiAmt,
		pdAttrInfo: pdAttrInfo,
		useYn: useYn
	}
	console.log('paramData => ',paramData);
	
	$.ajax({
		type: "POST",
		url: "/product/insert",
		dataType: "json",
		contentType: "application/json; charset=UTF-8",
		data: JSON.stringify(paramData),
		success: function(result){
			console.log('Insert Response => ',result);
			alert("상품이 등록되었습니다.");
			location.reload(true);
		},
		error: function(xhr, textStatus, e){
			console.log('error => ',xhr);
			//console.log(textStatus);
			alert(xhr.status+": "+xhr.statusText);
			resetForm();
		}
	})
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

const resetForm = () => {
	$('#prodRegReset').trigger('click');
	getPdiId();
}