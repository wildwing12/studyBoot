package com.study.demo.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.study.demo.VO.Test2VO;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RestController
@Api(value="swag-rest-controller", description="HomeController")
public class HomeController {
	
	private String json;
	
	@GetMapping("/")
	public String Home() {
		Test2VO test = new Test2VO();
		test.setIdx(3);
		test.setName("success");
		Gson gson = new Gson();
		json = gson.toJson(test).toString();
		if(StringUtils.isNotEmpty(json)) {
			log.info(json);
			return json;
		}else {
			return "-";
		}
	}
	@GetMapping("/main")
	public ModelAndView hello(ModelAndView mv) {
		mv.setViewName("hello");
		return mv;
	}
}
