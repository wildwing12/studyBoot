package com.study.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.study.demo.service.PdTableService;

@Controller
public class MainController {
	
	@Autowired
	PdTableService service;
	
	@RequestMapping("/hello")
	public ModelAndView hello(ModelAndView mav, Map<String,Object> map) {
		List<Map<String,Object>> list = service.pdList(map);
		
		mav.addObject("list", list);
		mav.setViewName("hello");
		return mav;
	}

}
