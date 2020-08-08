package com.study.demo.VO;

//출퇴근 정보 
public class EmpCommuteInfo {

 // 직원번호 
 private Integer empNo;

 // 출퇴근 인덱스 
 private Integer cmtIdx;

 // 출근시간 
 private String cmtOnTm;

 // 퇴근시간 
 private String cmtOffTm;

 // 수동등록여부 
 private String cmtPsYn;

 // 출근연월일 
 private String cmtDt;

 // 수동등록사유 
 private String cmtPsRs;

 // 비고 
 private String cmtRemarks;

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

 public Integer getEmpNo() {
     return empNo;
 }

 public void setEmpNo(Integer empNo) {
     this.empNo = empNo;
 }

 public Integer getCmtIdx() {
     return cmtIdx;
 }

 public void setCmtIdx(Integer cmtIdx) {
     this.cmtIdx = cmtIdx;
 }

 public String getCmtOnTm() {
     return cmtOnTm;
 }

 public void setCmtOnTm(String cmtOnTm) {
     this.cmtOnTm = cmtOnTm;
 }

 public String getCmtOffTm() {
     return cmtOffTm;
 }

 public void setCmtOffTm(String cmtOffTm) {
     this.cmtOffTm = cmtOffTm;
 }

 public String getCmtPsYn() {
     return cmtPsYn;
 }

 public void setCmtPsYn(String cmtPsYn) {
     this.cmtPsYn = cmtPsYn;
 }

 public String getCmtDt() {
     return cmtDt;
 }

 public void setCmtDt(String cmtDt) {
     this.cmtDt = cmtDt;
 }

 public String getCmtPsRs() {
     return cmtPsRs;
 }

 public void setCmtPsRs(String cmtPsRs) {
     this.cmtPsRs = cmtPsRs;
 }

 public String getCmtRemarks() {
     return cmtRemarks;
 }

 public void setCmtRemarks(String cmtRemarks) {
     this.cmtRemarks = cmtRemarks;
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

 // EmpCommuteInfo 모델 복사
 public void CopyData(EmpCommuteInfo param)
 {
     this.empNo = param.getEmpNo();
     this.cmtIdx = param.getCmtIdx();
     this.cmtOnTm = param.getCmtOnTm();
     this.cmtOffTm = param.getCmtOffTm();
     this.cmtPsYn = param.getCmtPsYn();
     this.cmtDt = param.getCmtDt();
     this.cmtPsRs = param.getCmtPsRs();
     this.cmtRemarks = param.getCmtRemarks();
     this.regUser = param.getRegUser();
     this.regDt = param.getRegDt();
     this.udtUser = param.getUdtUser();
     this.udtDt = param.getUdtDt();
     this.useYn = param.getUseYn();
 }
}
