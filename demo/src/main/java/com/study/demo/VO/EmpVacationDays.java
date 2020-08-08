package com.study.demo.VO;

//휴가일수 
public class EmpVacationDays {

 // 휴가일수번호 
 private Integer vcdIdx;

 // 직원번호 
 private Integer empNo;

 // 연도 
 private String vcdYear;

 // 휴가가능일수 
 private Integer vcdAvlDy;

 // 휴가사용일수 
 private Integer vcdUseDy;

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

 public Integer getVcdIdx() {
     return vcdIdx;
 }

 public void setVcdIdx(Integer vcdIdx) {
     this.vcdIdx = vcdIdx;
 }

 public Integer getEmpNo() {
     return empNo;
 }

 public void setEmpNo(Integer empNo) {
     this.empNo = empNo;
 }

 public String getVcdYear() {
     return vcdYear;
 }

 public void setVcdYear(String vcdYear) {
     this.vcdYear = vcdYear;
 }

 public Integer getVcdAvlDy() {
     return vcdAvlDy;
 }

 public void setVcdAvlDy(Integer vcdAvlDy) {
     this.vcdAvlDy = vcdAvlDy;
 }

 public Integer getVcdUseDy() {
     return vcdUseDy;
 }

 public void setVcdUseDy(Integer vcdUseDy) {
     this.vcdUseDy = vcdUseDy;
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

 // EmpVacationDays 모델 복사
 public void CopyData(EmpVacationDays param)
 {
     this.vcdIdx = param.getVcdIdx();
     this.empNo = param.getEmpNo();
     this.vcdYear = param.getVcdYear();
     this.vcdAvlDy = param.getVcdAvlDy();
     this.vcdUseDy = param.getVcdUseDy();
     this.regUser = param.getRegUser();
     this.regDt = param.getRegDt();
     this.udtUser = param.getUdtUser();
     this.udtDt = param.getUdtDt();
     this.useYn = param.getUseYn();
 }
}