package com.study.demo.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.study.demo.VO.ComMaster;

@Repository
@Mapper
public interface CompanyMapper {
	//로우수
	public abstract Integer rowCnt(ComMaster comMaster);
	//리스트
	public abstract List<Map<String, Object>> comList(ComMaster comMaster);
	//회사 등록
	public abstract Integer regCompany(ComMaster model);
	//아이디 생성
	public abstract Map<String, Object> getId();

}
