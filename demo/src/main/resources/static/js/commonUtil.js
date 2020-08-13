//자주 쓰이는 기능 함수화해서 정리(null체크 등), 추가 예정
const CommonUtil = {
	isEmpty: (val) => {
		if(val == '' || val == null || val == undefined){
			return true;
		}else{
			return false; 
		}
	},
	ignoreEmptyValue: (val) => {
		if(val == '' || val == null || val == undefined){
			return '';
		}else{
			return val;
		}
	},
	ignoreEmptyNumber: (val) => {
		if(String(num) == '0' || num == null || num == undefined || isNaN(num)){
			return 0;
		}else{
			return num;
		}
	},
	setTimeFormat: (time) => {
		return moment(time).format('YYYY-MM-DD');
	},
	appearFileName: () => {
		$(".custom-file-input").on("change", function() {
			var fileName = $(this).val().split("\\").pop();
			$(this).siblings(".custom-file-label").addClass("selected").html(fileName);
		});
	}
};

jQuery.fn.serializeObject = function() { 
	let obj = null; 
	try { 
		if(this[0].tagName && this[0].tagName.toUpperCase() == "FORM" ) { 
			let arr = this.serializeArray(); 
			if(arr){ obj = {}; 
			jQuery.each(arr, function() { 
				obj[this.name] = this.value; }); 
			} 
		} 
	}catch(e) { 
		alert(e.message); 
	}finally {} 
	return obj; 
}

