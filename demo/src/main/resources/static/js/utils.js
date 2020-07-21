//자주 쓰이는 기능 함수화해서 정리(null체크 등), 추가 예정
const IsEmpty = function(val){
	if(val == '' || val == null || val == undefined){
		return true;
	}else{
		return false; 
	}
}

const IgnoreEmptyValue = function(val){
	if(val == '' || val == null || val == undefined){
		return '';
	}else{
		return val;
	}
}

const IgnoreEmptyNumber = function(num){
	if(String(num) == '0' || num == null || num == undefined || isNaN(num)){
		return 0;
	}else{
		return num;
	}
}

const SetTimeFormat = function(time){
//	return moment(time).format('YYYY-MM-DD'); //해당 1줄만으로도 날짜 포맷 처리는 가능...
    let year = time.getFullYear();
    let month = time.getMonth()+1;
    let day = time.getDate();
    
    month = GetDateFormat(month);
    day = GetDateFormat(day);
    
    time = year+'-'+month+'-'+day;
    return time;
}

const GetNumLength = function(num){
	return num.toFixed().length;
}

const GetDateFormat = function(t){
	if(GetNumLength(t) == 1){
		return '0'+t;
	}else{
		return t;
	}
}

const appearFileName = function(){
	$(".custom-file-input").on("change", function() {
		var fileName = $(this).val().split("\\").pop();
		$(this).siblings(".custom-file-label").addClass("selected").html(fileName);
	});
}