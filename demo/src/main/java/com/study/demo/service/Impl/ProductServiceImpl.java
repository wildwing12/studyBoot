package com.study.demo.service.Impl;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	 * @return ResponseEntity
	 * @author HYUNJOO
	 */
	@Override
	public ResponseEntity<Map<String, Object>> selectPdId() {
		ResponseEntity<Map<String, Object>> result = null;
		try {
			Map<String,Object> map = productMapper.selectPdId();
			String pdiId = map.get("pdiId").toString();
			if(map != null && StringUtils.isNotEmpty(pdiId)) {
				result = new ResponseEntity<Map<String,Object>>(map, HttpStatus.OK);
				log.info("PDI_ID & PDI_NO: {}", result);
			}
		} catch (Exception e) {
			result = new ResponseEntity<Map<String,Object>>(HttpStatus.BAD_REQUEST);
			log.error("상품ID 조회 실패 => {}", e.getMessage());
		}
		return result;
	}

}
