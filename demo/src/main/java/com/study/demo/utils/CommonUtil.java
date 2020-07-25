package com.study.demo.utils;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;

/**
 * Hash Util 클래스
 * 
 * @author wedul
 *
 */
public class CommonUtil {
	
	public static String getClientIp(HttpServletRequest request) {
		
		String ip = request.getHeader("X-Forwarded-For");
		
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_CLIENT_IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_X_FORWARDED_FOR");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		
		return ip;

	}
	
	/**
	 * 특정 주소로 이동만 하는 컨트롤러용
	 * @author HYUNJOO
	 *
	 */
	public static ModelAndView setMav(String viewName) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName(viewName);
		return mav;
	}
}