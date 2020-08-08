package com.study.demo.VO;

//코드테이블 
public class CdcTable {

 // 코드순번 
 private Integer cdcIdx;

 // 코드 
 private String cdcCd;

 // 코드명 
 private String cdcCdNm;

 // 부모코드 
 private String cdcPrtCd;

 // 최초생성자 
 private String regUser;

 // 최초생성일시 
 private String regDt;

 // 최종수정자 
 private String udtUser;

 // 최종수정일시 
 private String udtDt;

 // 사용여부 
 private String useYn;

 public Integer getCdcIdx() {
     return cdcIdx;
 }

 public void setCdcIdx(Integer cdcIdx) {
     this.cdcIdx = cdcIdx;
 }

 public String getCdcCd() {
     return cdcCd;
 }

 public void setCdcCd(String cdcCd) {
     this.cdcCd = cdcCd;
 }

 public String getCdcCdNm() {
     return cdcCdNm;
 }

 public void setCdcCdNm(String cdcCdNm) {
     this.cdcCdNm = cdcCdNm;
 }

 public String getCdcPrtCd() {
     return cdcPrtCd;
 }

 public void setCdcPrtCd(String cdcPrtCd) {
     this.cdcPrtCd = cdcPrtCd;
 }

 public String getRegUser() {
     return regUser;
 }

 public void setRegUser(String regUser) {
     this.regUser = regUser;
 }

 public String getRegDt() {
     return regDt;
 }

 public void setRegDt(String regDt) {
     this.regDt = regDt;
 }

 public String getUdtUser() {
     return udtUser;
 }

 public void setUdtUser(String udtUser) {
     this.udtUser = udtUser;
 }

 public String getUdtDt() {
     return udtDt;
 }

 public void setUdtDt(String udtDt) {
     this.udtDt = udtDt;
 }

 public String getUseYn() {
     return useYn;
 }

 public void setUseYn(String useYn) {
     this.useYn = useYn;
 }

 // CdcTable 모델 복사
 public void CopyData(CdcTable param)
 {
     this.cdcIdx = param.getCdcIdx();
     this.cdcCd = param.getCdcCd();
     this.cdcCdNm = param.getCdcCdNm();
     this.cdcPrtCd = param.getCdcPrtCd();
     this.regUser = param.getRegUser();
     this.regDt = param.getRegDt();
     this.udtUser = param.getUdtUser();
     this.udtDt = param.getUdtDt();
     this.useYn = param.getUseYn();
 }
}