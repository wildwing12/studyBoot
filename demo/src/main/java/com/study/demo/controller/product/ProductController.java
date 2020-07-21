package com.study.demo.controller.product;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@RequestMapping("/index")
	public ModelAndView index() {
		return setMav("product/index");
	}
	
	@RequestMapping("/order")
	public ModelAndView orderIndex() {
		return setMav("product/orderIndex");
	}

	private ModelAndView setMav(String viewName) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName(viewName);
		return mav;
	}
}
