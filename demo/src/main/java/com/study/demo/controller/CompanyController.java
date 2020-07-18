package com.study.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RestController
@Api(value="swag-rest-controller", description="CompanyController")
@RequestMapping("/company")
public class CompanyController extends AbstractController{

	@GetMapping("")
	public ModelAndView companyMain(ModelAndView mav) {
		mav.setViewName("company/company");
		return mav;
	}
}
