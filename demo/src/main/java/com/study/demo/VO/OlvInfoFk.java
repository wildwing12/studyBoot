package com.study.demo.VO;

//주문 택배 정보 
public class OlvInfoFk {

 // 주문번호 
 private Integer ordNo;

 // 택배번호 
 private Integer dlvNo;

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

 public Integer getOrdNo() {
     return ordNo;
 }

 public void setOrdNo(Integer ordNo) {
     this.ordNo = ordNo;
 }

 public Integer getDlvNo() {
     return dlvNo;
 }

 public void setDlvNo(Integer dlvNo) {
     this.dlvNo = dlvNo;
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

 // OlvInfoFk 모델 복사
 public void CopyData(OlvInfoFk param)
 {
     this.ordNo = param.getOrdNo();
     this.dlvNo = param.getDlvNo();
     this.regUser = param.getRegUser();
     this.regDt = param.getRegDt();
     this.udtUser = param.getUdtUser();
     this.udtDt = param.getUdtDt();
     this.useYn = param.getUseYn();
 }
}
