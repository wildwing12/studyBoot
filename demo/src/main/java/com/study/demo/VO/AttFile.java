package com.study.demo.VO;

//첨부파일 
public class AttFile {

 // 첨부파일번호 
 private Integer attIdx;

 // 글번호 
 private Integer attNo;

 // 테이블구분 
 private String attType;

 // 파일명 
 private String attNm;

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

 public Integer getAttIdx() {
     return attIdx;
 }

 public void setAttIdx(Integer attIdx) {
     this.attIdx = attIdx;
 }

 public Integer getAttNo() {
     return attNo;
 }

 public void setAttNo(Integer attNo) {
     this.attNo = attNo;
 }

 public String getAttType() {
     return attType;
 }

 public void setAttType(String attType) {
     this.attType = attType;
 }

 public String getAttNm() {
     return attNm;
 }

 public void setAttNm(String attNm) {
     this.attNm = attNm;
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

 // AttFile 모델 복사
 public void CopyData(AttFile param)
 {
     this.attIdx = param.getAttIdx();
     this.attNo = param.getAttNo();
     this.attType = param.getAttType();
     this.attNm = param.getAttNm();
     this.regUser = param.getRegUser();
     this.regDt = param.getRegDt();
     this.udtUser = param.getUdtUser();
     this.udtDt = param.getUdtDt();
     this.useYn = param.getUseYn();
 }
}
