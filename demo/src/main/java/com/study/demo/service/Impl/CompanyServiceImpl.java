package com.study.demo.service.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.demo.VO.ComMaster;
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
	public Map<String, Object> list(ComMaster comMaster) {
		Map<String, Object> result =new HashMap<>();
		List<Map<String, Object>> list = null;
		try {
			Integer cnt  = companyMapper.rowCnt(comMaster);//리스트로우수
			log.info("회사 테이블 로우수:{}",cnt);
			log.info("map정보:{}", comMaster);
			Pager pager =new Pager(cnt, 1);//페이징(로우수, 현재 페이지 번호, 일단 1로)
			int begin = pager.getPageBegin()-1;//시작 페이지
			int pageScale = pager.PAGE_SCALE;//로우갯수
			
			comMaster.setBegin(begin);
			comMaster.setPageScale(pageScale);
			list = companyMapper.comList(comMaster);
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
	//회사등록
	@Override
	public Integer regCompany(ComMaster model) {
		Integer result = null;
		try {
			result=companyMapper.regCompany(model);
		} catch (Exception e) {
			log.error("회사 등록 에러:{}",e.getMessage());
		}
		return result;
	}
	@Override
	public Map<String, Object> getId() {
			Map<String, Object> result=null;
		try {
			result = companyMapper.getId();
		} catch (Exception e) {
			log.error("아이디 생성 에러:{}",e.getMessage());
		}
		return result;
	}
}
