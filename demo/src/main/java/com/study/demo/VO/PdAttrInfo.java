package com.study.demo.VO;

import lombok.Data;

/**
 * 상품속성 테이블 VO
 * @author HYUNJOO
 *
 */

@Data
public class PdAttrInfo {
	
	//상품속성번호(idx)
	private Integer pdaNo;
	
	//상품번호
	private Integer pdiNo;
	
	//제조사
	private String pdaManu;
	
	//CPU
	private String pdaCpu;
	
	//화면크기대
	private String pdaSize;
	
	//RAM 용량
	private String pdaRam;
	
	//SSD 용량
	private String pdaSsd;
	
	//운영체제
	private String pdaOs;
	
	//무게
	private String pdaWeight;
	
	//최초생성자
	private String regUser;
	
	//최초생성일시
	private String regDt;
	
	//최종수정자
	private String udtUser;
	
	//최종수정일시
	private String udtDt;
	
	//사용여부
	private String useYn;

}
