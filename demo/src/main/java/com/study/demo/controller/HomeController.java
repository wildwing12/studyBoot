package com.study.demo.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.study.demo.service.GsonService;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RestController
@Api(value="swag-rest-controller", description="HomeController")
public class HomeController {
	
	@Autowired
	GsonService service;
	
	private String json;
	
	//RestController 테스트용(목업데이터 세팅함)
	@GetMapping("/test")
	public String Home() throws Exception {
		json = service.getJson();
		JsonElement element = new JsonParser().parse(json);
		JsonObject obj = element.getAsJsonObject();
		String idx = obj.get("idx").toString();
		String name = obj.get("name").toString();
		if(StringUtils.isNotEmpty(idx) && StringUtils.isNotEmpty(name)) {
			log.info(json);
			return json;
		}else {
			return "-";
		}
	}
	
	@GetMapping("/index")
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("index");
		return mav;
	}
	
	
	/*
	 * @GetMapping("/main") public ModelAndView hello(ModelAndView mv) {
	 * mv.setViewName("hello"); return mv; }
	 */
 
}
