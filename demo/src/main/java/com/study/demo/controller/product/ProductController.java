package com.study.demo.controller.product;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.study.demo.utils.CommonUtil;

/**
 * 상품관리 페이지 Controller
 * @author HYUNJOO
 *
 */
@RestController
@RequestMapping("/product")
public class ProductController {
	
	/**
	 * 상품관리 페이지로 이동
	 * return ModelAndView
	 * @author HYUNJOO
	 *
	 */
	@RequestMapping("/index")
	public ModelAndView index() {
		return CommonUtil.setMav("product/index");
	}
	
	/**
	 * 상품발주 페이지로 이동
	 * return ModelAndView
	 * @author HYUNJOO
	 *
	 */
	@RequestMapping("/order")
	public ModelAndView orderIndex() {
		return CommonUtil.setMav("product/orderIndex");
	}

}
