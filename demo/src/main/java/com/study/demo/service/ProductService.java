package com.study.demo.service;

import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.study.demo.VO.PdInfo;

public interface ProductService {
	
	/**
	 * 상품ID 불러오기
	 * @return ResponseEntity
	 * @author HYUNJOO
	 */
	public abstract ResponseEntity<Map<String,Object>> selectPdId();
	
	/**
	 * 상품 및 속성 등록
	 * @return int
	 * @author HYUNJOO
	 */
	public abstract int insertProduct(PdInfo pdInfo);

}
