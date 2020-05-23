package com.study.demo.service.Impl;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.study.demo.VO.Test2VO;
import com.study.demo.service.GsonService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class GsonServiceImpl implements GsonService {

	@Override
	public String getJson() {
		String json = "";
		
		try {
			//목업데이터 세팅해서 테스트 ㅇㅇ
			Test2VO test = new Test2VO();
			test.setIdx(3); 
			test.setName("success");
			
			Gson gson = new Gson();
			json = gson.toJson(test).toString();
		} catch (Exception e) {
			log.error("error : {}", e);
			throw new RuntimeException();
		}
		
		return json;
	}

}
