package com.study.demo.service;

import java.util.Map;

import com.study.demo.VO.ComMaster;

public interface CompanyService {
	//리스트
	public abstract Map<String, Object> list(ComMaster comMaster);
	//회사 등록
	public abstract Integer regCompany(ComMaster model);
	//아이디 없을떄 아이디 만들어주기
	public abstract Map<String, Object> getId();

}
