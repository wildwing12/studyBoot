package com.study.demo.VO;

import lombok.Data;

/**
 * 상품정보 테이블 VO
 * @author HYUNJOO
 *
 */

@Data
public class PdInfo {
	
	//상품번호
	private Integer pdiNo; 
	
	//상품ID
	private String pdiId; 
	
	//상품명
	private String pdiNm; 
	
	//상품가격
	private Integer pdiPrc; 
	
	//배송비
	private Integer pdiDvFee; 
	
	//재고수량
	private Integer pdiAmt; 
	
	//상품등록일
	private String pdiRegDt; 
	
	//사용여부
	private String useYn; 
	
	//최초생성자
	private String regUser; 
	
	//최초생성일시
	private String regDt; 
	
	//최종수정자
	private String udtUser; 
	
	//최종수정일시
	private String udtDt; 
	
	//상품속성정보(join용)
	private PdAttrInfo pdAttrInfo; 

}
