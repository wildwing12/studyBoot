package com.study.demo.service.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.demo.mapper.PdTableMapper;
import com.study.demo.service.PdTableService;

@Service
public class PdTableServiceImpl implements PdTableService{
	@Autowired
	PdTableMapper mapper; 
	
	@Override
	public List<Map<String, Object>> pdList(Map<String, Object> map) {
		return mapper.SelectList(map) ;
	}

}
