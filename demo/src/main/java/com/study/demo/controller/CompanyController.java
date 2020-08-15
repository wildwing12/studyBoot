package com.study.demo.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.study.demo.VO.ComMaster;
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
	
	@GetMapping("")
	public ModelAndView home() {
		return new ModelAndView("company/company");
	}
	//회사 리스트
	@PostMapping("/list")
	public Map<String, Object> companyMain(@RequestBody String paramStr) throws Exception {
		log.info("회사 리스트 map 값 : {}",paramStr);
		Map<String, Object> result = makeQueryResultMap(companySerivce.list((ComMaster)getModel(paramStr, ComMaster.class)));
		log.info("result값:{}",result);
		return result;
	}
	//회사 등록
	@PostMapping("/regCompany")
	public Map<String,Object> regCompany(@RequestBody String paramData) throws Exception {
		log.info("화면에서 넘오는 값:{}",paramData);
		return makeResultMap(companySerivce.regCompany((ComMaster)getModel(paramData, ComMaster.class)));
	}
	@GetMapping("/getId")
	public Map<String,Object> getId(){
		return makeQueryResultMap(companySerivce.getId());
	}
}
