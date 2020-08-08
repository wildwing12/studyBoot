const contextPath = 'http://localhost:3100';

const ParentCd = {
	
};

const CdNm = {
	POS: 'POS',
	DEPT: 'DEPT',
	PD: 'PD'
};

const CdVal = (cate, cd) => {
	let cdValue = '';
	if(cate == CdNm.PD){
		switch(cd){
			case '101': cdValue = 'LG전자'; break;
			case '102': cdValue = 'ASUS'; break;
			case '103': cdValue = '레노버'; break;
			case '104': cdValue = '삼성전자'; break;
			case '105': cdValue = 'APPLE'; break;
			default: '';
		}
	}
	return cdValue;
}