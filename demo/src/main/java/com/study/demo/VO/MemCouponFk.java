package com.study.demo.VO;

//회원 쿠폰 
public class MemCouponFk {

 // 번호 
 private Integer mcfIdx;

 // 회원번호 
 private Integer memNo;

 // 쿠폰번호 
 private Integer cpnNo;

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

 public Integer getMcfIdx() {
     return mcfIdx;
 }

 public void setMcfIdx(Integer mcfIdx) {
     this.mcfIdx = mcfIdx;
 }

 public Integer getMemNo() {
     return memNo;
 }

 public void setMemNo(Integer memNo) {
     this.memNo = memNo;
 }

 public Integer getCpnNo() {
     return cpnNo;
 }

 public void setCpnNo(Integer cpnNo) {
     this.cpnNo = cpnNo;
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

 // MemCouponFk 모델 복사
 public void CopyData(MemCouponFk param)
 {
     this.mcfIdx = param.getMcfIdx();
     this.memNo = param.getMemNo();
     this.cpnNo = param.getCpnNo();
     this.regUser = param.getRegUser();
     this.regDt = param.getRegDt();
     this.udtUser = param.getUdtUser();
     this.udtDt = param.getUdtDt();
     this.useYn = param.getUseYn();
 }
}
