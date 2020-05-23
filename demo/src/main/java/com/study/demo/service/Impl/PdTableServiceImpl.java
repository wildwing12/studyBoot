package com.study.demo.service.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.demo.mapper.PdTableMapper;
import com.study.demo.service.PdTableService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class PdTableServiceImpl implements PdTableService{
	@Autowired
	PdTableMapper mapper; 
	
	@Override
	public List<Map<String, Object>> pdList(Map<String, Object> map) {
		List<Map<String, Object>> list = null;
		try {
			list = mapper.SelectList(map);
		} catch (Exception e) {
			//�삁�쇅泥섎━ �삁�떆(e.printStackTrace() 吏��뼇)
			log.error("PdTableService error: {}",e);
			throw new RuntimeException(); 
		}
		return list;
		//add
	}

}
