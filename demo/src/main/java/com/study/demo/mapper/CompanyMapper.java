package com.study.demo.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface CompanyMapper {
	//로우수
	public abstract Integer rowCnt(Map<String, Object> map);
	//리스트
	public abstract List<Map<String, Object>> comList(Map<String, Object> map);

}
