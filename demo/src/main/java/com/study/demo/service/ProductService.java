package com.study.demo.service;

import java.util.Map;

import org.springframework.http.ResponseEntity;

public interface ProductService {
	
	/**
	 * 상품ID 불러오기
	 * @return ResponseEntity
	 * @author HYUNJOO
	 */
	public abstract ResponseEntity<Map<String,Object>> selectPdId();

}
