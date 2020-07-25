package com.study.demo.controller.order;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.study.demo.utils.CommonUtil;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@RequestMapping("/index")
	public ModelAndView index() {
		return CommonUtil.setMav("order/index");
	}
	
	@RequestMapping("/delivery")
	public ModelAndView deliveryCompanyIndex() {
		return CommonUtil.setMav("order/deliveryComIndex");
	}

}
