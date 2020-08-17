package com.study.demo.service.Impl;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.study.demo.VO.PdAttrInfo;
import com.study.demo.VO.PdInfo;
import com.study.demo.mapper.ProductMapper;
import com.study.demo.service.ProductService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductMapper productMapper;
	
	/**
	 * 상품ID 불러오기
	 * @return ResponseEntity
	 * @author HYUNJOO
	 */
	@Override
	public ResponseEntity<Map<String, Object>> selectPdId() {
		ResponseEntity<Map<String, Object>> result = null;
		try {
			Map<String,Object> map = productMapper.selectPdId();
			String pdiId = map.get("pdiId").toString();
			if(map != null && StringUtils.isNotEmpty(pdiId)) {
				result = new ResponseEntity<Map<String,Object>>(map, HttpStatus.OK);
				log.info("PDI_ID & PDI_NO: {}", result);
			}
		} catch (Exception e) {
			result = new ResponseEntity<Map<String,Object>>(HttpStatus.BAD_REQUEST);
			log.error("상품ID 조회 실패 => {}", e.getMessage());
		}
		return result;
	}
	
	/**
	 * 상품 및 속성 등록
	 * @return int
	 * @author HYUNJOO
	 */
	@Override
	@Transactional
	public int insertProduct(PdInfo pdInfo) {
		int result = 0; //기본값 0
		try {
			if(pdInfo != null) {
				//json parsing으로 받아온 상품 정보가 null이 아니면...
				String pdiId = pdInfo.getPdiId();
				String regUser = "admin";
				String useYn = pdInfo.getUseYn();
				if(StringUtils.isNotEmpty(pdiId)) {
					//상품ID가 존재할 경우 상품 등록, 상품 속성 등록 동시 처리
					pdInfo.setRegUser(regUser);
					pdInfo.setUdtUser(regUser);
					pdInfo.setUseYn(useYn);
					int regPdInfo = productMapper.regPdInfo(pdInfo);
					String pdaManu = pdInfo.getPdAttrInfo().getPdaManu();
					String pdaCpu = pdInfo.getPdAttrInfo().getPdaCpu();
					String pdaSize = pdInfo.getPdAttrInfo().getPdaSize();
					String pdaRam = pdInfo.getPdAttrInfo().getPdaRam();
					String pdaSsd = pdInfo.getPdAttrInfo().getPdaSsd();
					String pdaOs = pdInfo.getPdAttrInfo().getPdaOs();
					String pdaWeight = pdInfo.getPdAttrInfo().getPdaWeight();
					PdAttrInfo pdAttrInfo = new PdAttrInfo(pdiId, pdaManu, pdaCpu, pdaSize, pdaRam, pdaSsd, pdaOs, pdaWeight);
					pdAttrInfo.setRegUser(regUser);
					pdAttrInfo.setUdtUser(regUser);
					pdAttrInfo.setUseYn(useYn);
					log.info("PdAttrInfo >>>>>> {}",pdAttrInfo);
					int regAttrInfo = productMapper.regPdAttrInfo(pdAttrInfo);
					if(!(regPdInfo == 0 || regAttrInfo == 0)) {
						//두 insert가 모두 정상적으로 완료되었을 경우 1 리턴
						result = 1;
					}
				}
			}
		} catch (Exception e) {
			result = -1;
			log.error("상품등록 실패! => {}",e.getMessage());
		}
		return result;
	}

}
