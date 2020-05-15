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
			Test2VO test = new Test2VO();
			test.setIdx(3);
//			test.setIdx(3);
//			test.setName("JJUD mansei");
			
			Gson gson = new Gson();
			json = gson.toJson(test).toString();
		} catch (Exception e) {
			log.error("error : {}", e);
		}
		
		return json;
	}

}
