package com.study.demo.controller.product;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.study.demo.controller.AbstractController;
import com.study.demo.service.ProductService;
import com.study.demo.utils.CommonUtil;

import lombok.extern.slf4j.Slf4j;

/**
 * 상품관리 페이지 Controller
 * @author HYUNJOO
 *
 */
@Slf4j
@RestController
@RequestMapping("/product")
public class ProductController extends AbstractController {
	
	@Autowired
	private ProductService productService;
	
	/**
	 * 상품관리 페이지로 이동
	 * @return ModelAndView
	 * @author HYUNJOO
	 *
	 */
	@RequestMapping("/index")
	public ModelAndView index() {
		return CommonUtil.setMav("product/index");
	}
	
	/**
	 * 상품발주 페이지로 이동
	 * @return ModelAndView
	 * @author HYUNJOO
	 *
	 */
	@RequestMapping("/order")
	public ModelAndView orderIndex() {
		return CommonUtil.setMav("product/orderIndex");
	}
	
	/**
	 * 상품ID 자동부여
	 * @return ResponseEntity
	 * @author HYUNJOO
	 *
	 */
	@GetMapping("/getPdiId")
	public ResponseEntity<Map<String,Object>> getPdiId() throws Exception {
		ResponseEntity<Map<String,Object>> entity = productService.selectPdId();
		if(entity != null) {
			log.info("entity >>>>>> {}", entity.getBody());
		}
		return entity;
	}

}
