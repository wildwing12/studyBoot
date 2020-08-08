package com.study.demo.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ProductMapper {
	
	/**
	 * 상품ID 불러오기
	 * @return Map
	 * @author HYUNJOO
	 */
	public abstract Map<String,Object> selectPdId();

}
