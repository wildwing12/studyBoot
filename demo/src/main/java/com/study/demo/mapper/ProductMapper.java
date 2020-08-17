package com.study.demo.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.study.demo.VO.PdAttrInfo;
import com.study.demo.VO.PdInfo;

@Repository
@Mapper
public interface ProductMapper {
	
	/**
	 * 상품ID 불러오기
	 * @return Map
	 * @author HYUNJOO
	 */
	public abstract Map<String,Object> selectPdId();
	
	/**
	 * 상품 등록
	 * @return int
	 * @author HYUNJOO
	 */
	public abstract int regPdInfo(PdInfo pdInfo);
	
	/**
	 * 상품 속성 등록
	 * @return int
	 * @author HYUNJOO
	 */
	public abstract int regPdAttrInfo(PdAttrInfo pdAttrInfo);

}
