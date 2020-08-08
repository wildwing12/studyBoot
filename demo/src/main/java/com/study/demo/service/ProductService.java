package com.study.demo.service;

import java.util.Map;

public interface ProductService {
	
	/**
	 * 상품ID 불러오기
	 * @return Map
	 * @author HYUNJOO
	 */
	public abstract Map<String,Object> selectPdId();

}
