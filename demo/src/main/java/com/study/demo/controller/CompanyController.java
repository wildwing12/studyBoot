package com.study.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.study.demo.service.CompanyService;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RestController
@Api(value="swag-rest-controller", description="CompanyController")
@RequestMapping("/company")
public class CompanyController extends AbstractController{

	@Autowired
	private CompanyService companySerivce;
	//회사 리스트
	@GetMapping("")
	public ModelAndView companyMain(ModelAndView mav, @RequestParam Map<String, Object> map) {
		log.info("회사 리스트 map 값 : ",map);
		Map<String, Object> result = makeQueryResultMap(companySerivce.list(map));
		mav.addObject("result", result);
		mav.setViewName("company/company");
		return mav;
	}
}
