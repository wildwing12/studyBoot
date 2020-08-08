package com.study.demo.service.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.demo.mapper.ProductMapper;
import com.study.demo.service.ProductService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductMapper productMapper;
	
	/**
	 * 상품ID 불러오기
	 * @return Map
	 * @author HYUNJOO
	 */
	@Override
	public Map<String, Object> selectPdId() {
		Map<String, Object> result = new HashMap<>();
		try {
			Map<String,Object> map = productMapper.selectPdId();
			if(map != null) {
				result.put("data", map);
				log.info("PDI_ID & PDI_NO: {}",map);
			}
		} catch (Exception e) {
			log.error("상품ID 조회 실패 => {}",e.getMessage());
		}
		return result;
	}

}
