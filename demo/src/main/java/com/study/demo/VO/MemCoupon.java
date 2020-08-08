package com.study.demo.VO;

//쿠폰 정보 
public class MemCoupon {

 // 쿠폰번호 
 private Integer cpnNo;

 // 회원번호 
 private Integer memNo;

 // 할인율 
 private Integer cpnDcr;

 // 할인금액 
 private Integer cpnDcp;

 // 쿠폰명 
 private String cpnNm;

 // 유효기간 
 private String cpnPrdSt;

 // 유효기간종료 
 private String cpnPrdEd;

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

 public Integer getCpnNo() {
     return cpnNo;
 }

 public void setCpnNo(Integer cpnNo) {
     this.cpnNo = cpnNo;
 }

 public Integer getMemNo() {
     return memNo;
 }

 public void setMemNo(Integer memNo) {
     this.memNo = memNo;
 }

 public Integer getCpnDcr() {
     return cpnDcr;
 }

 public void setCpnDcr(Integer cpnDcr) {
     this.cpnDcr = cpnDcr;
 }

 public Integer getCpnDcp() {
     return cpnDcp;
 }

 public void setCpnDcp(Integer cpnDcp) {
     this.cpnDcp = cpnDcp;
 }

 public String getCpnNm() {
     return cpnNm;
 }

 public void setCpnNm(String cpnNm) {
     this.cpnNm = cpnNm;
 }

 public String getCpnPrdSt() {
     return cpnPrdSt;
 }

 public void setCpnPrdSt(String cpnPrdSt) {
     this.cpnPrdSt = cpnPrdSt;
 }

 public String getCpnPrdEd() {
     return cpnPrdEd;
 }

 public void setCpnPrdEd(String cpnPrdEd) {
     this.cpnPrdEd = cpnPrdEd;
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

 // MemCoupon 모델 복사
 public void CopyData(MemCoupon param)
 {
     this.cpnNo = param.getCpnNo();
     this.memNo = param.getMemNo();
     this.cpnDcr = param.getCpnDcr();
     this.cpnDcp = param.getCpnDcp();
     this.cpnNm = param.getCpnNm();
     this.cpnPrdSt = param.getCpnPrdSt();
     this.cpnPrdEd = param.getCpnPrdEd();
     this.regUser = param.getRegUser();
     this.regDt = param.getRegDt();
     this.udtUser = param.getUdtUser();
     this.udtDt = param.getUdtDt();
     this.useYn = param.getUseYn();
 }
}
