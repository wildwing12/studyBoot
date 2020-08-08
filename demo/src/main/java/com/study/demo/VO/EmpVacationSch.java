package com.study.demo.VO;

//휴가일정 
public class EmpVacationSch {

 // 휴가일정번호 
 private Integer vcsIdx;

 // 휴가일수번호 
 private Integer vcdIdx;

 // 휴가시작일시 
 private String vcsStDt;

 // 휴가종료일시 
 private String vcsEdDt;

 // 휴가구분 
 private String vcsCat;

 // 휴가사용여부 
 private String vcsUseYn;

 // 휴가사유 
 private String vcsRs;

 // 비고 
 private String vcsRemarks;

 // 최초생성자 
 private String regUser;

 // 최초생성일시 
 private String regDt;

 // 최종생성사 
 private String udtUser;

 // 최종수정일시 
 private String udtDt;

 // 사용여부 
 private String useYn;

 public Integer getVcsIdx() {
     return vcsIdx;
 }

 public void setVcsIdx(Integer vcsIdx) {
     this.vcsIdx = vcsIdx;
 }

 public Integer getVcdIdx() {
     return vcdIdx;
 }

 public void setVcdIdx(Integer vcdIdx) {
     this.vcdIdx = vcdIdx;
 }

 public String getVcsStDt() {
     return vcsStDt;
 }

 public void setVcsStDt(String vcsStDt) {
     this.vcsStDt = vcsStDt;
 }

 public String getVcsEdDt() {
     return vcsEdDt;
 }

 public void setVcsEdDt(String vcsEdDt) {
     this.vcsEdDt = vcsEdDt;
 }

 public String getVcsCat() {
     return vcsCat;
 }

 public void setVcsCat(String vcsCat) {
     this.vcsCat = vcsCat;
 }

 public String getVcsUseYn() {
     return vcsUseYn;
 }

 public void setVcsUseYn(String vcsUseYn) {
     this.vcsUseYn = vcsUseYn;
 }

 public String getVcsRs() {
     return vcsRs;
 }

 public void setVcsRs(String vcsRs) {
     this.vcsRs = vcsRs;
 }

 public String getVcsRemarks() {
     return vcsRemarks;
 }

 public void setVcsRemarks(String vcsRemarks) {
     this.vcsRemarks = vcsRemarks;
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

 // EmpVacationSch 모델 복사
 public void CopyData(EmpVacationSch param)
 {
     this.vcsIdx = param.getVcsIdx();
     this.vcdIdx = param.getVcdIdx();
     this.vcsStDt = param.getVcsStDt();
     this.vcsEdDt = param.getVcsEdDt();
     this.vcsCat = param.getVcsCat();
     this.vcsUseYn = param.getVcsUseYn();
     this.vcsRs = param.getVcsRs();
     this.vcsRemarks = param.getVcsRemarks();
     this.regUser = param.getRegUser();
     this.regDt = param.getRegDt();
     this.udtUser = param.getUdtUser();
     this.udtDt = param.getUdtDt();
     this.useYn = param.getUseYn();
 }
}
