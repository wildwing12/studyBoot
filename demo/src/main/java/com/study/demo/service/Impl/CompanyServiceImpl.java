package com.study.demo.service.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.demo.VO.Pager;
import com.study.demo.mapper.CompanyMapper;
import com.study.demo.service.CompanyService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CompanyServiceImpl implements CompanyService{

	@Autowired
	private CompanyMapper companyMapper;
	//리스트
	@Override
	public Map<String, Object> list(Map<String, Object> map) {
		Map<String, Object> result =new HashMap<>();
		List<Map<String, Object>> list = null;
		try {
			Integer cnt  = companyMapper.rowCnt(map);//리스트로우수
			log.info("회사 테이블 로우수:{}",cnt);
			
			Pager pager =new Pager(cnt, 1);//페이징(로우수, 현재 페이지 번호, 일단 1로)
			int begin = pager.getPageBegin();//시작 페이지
			int pageScale = pager.PAGE_SCALE;//로우갯수
			
			map.put("begin",begin);
			map.put("pageScale",pageScale);
			list = companyMapper.comList(map);
			log.info("회사 테이블 목록 :{}",list);
			//화면단으로 값을 보내줄 값을 map에 담에서 보냄
			result.put("cnt",cnt);
			result.put("pager",pager);
			result.put("list",list);
		} catch (Exception e) {
			log.error("회사 리스트 에러:{}",e.toString());
		}
		return result;
	}
}
