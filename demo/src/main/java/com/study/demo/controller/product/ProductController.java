package com.study.demo.controller.product;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.study.demo.utils.CommonUtil;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@RequestMapping("/index")
	public ModelAndView index() {
		return CommonUtil.setMav("product/index");
	}
	
	@RequestMapping("/order")
	public ModelAndView orderIndex() {
		return CommonUtil.setMav("product/orderIndex");
	}

}
