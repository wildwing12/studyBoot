package com.study.demo.VO;

//공지사항 
public class NtcMaster {

 // 글번호 
 private Integer ntcNo;

 // 작성자 
 private String ntcUser;

 // 제목 
 private String ntcTitle;

 // 내용 
 private byte[] ntcCont;

 // 작성일시 
 private String ntcStDt;

 // 수정일시 
 private String ntcEdSt;

 // 공지사항분류 
 private String ntcCtg;

 // 최초생성자 
 private String regUser;

 // 최종수정자 
 private String udtUser;

 // 사용여부 
 private String useYn;

 public Integer getNtcNo() {
     return ntcNo;
 }

 public void setNtcNo(Integer ntcNo) {
     this.ntcNo = ntcNo;
 }

 public String getNtcUser() {
     return ntcUser;
 }

 public void setNtcUser(String ntcUser) {
     this.ntcUser = ntcUser;
 }

 public String getNtcTitle() {
     return ntcTitle;
 }

 public void setNtcTitle(String ntcTitle) {
     this.ntcTitle = ntcTitle;
 }

 public byte[] getNtcCont() {
     return ntcCont;
 }

 public void setNtcCont(byte[] ntcCont) {
     this.ntcCont = ntcCont;
 }

 public String getNtcStDt() {
     return ntcStDt;
 }

 public void setNtcStDt(String ntcStDt) {
     this.ntcStDt = ntcStDt;
 }

 public String getNtcEdSt() {
     return ntcEdSt;
 }

 public void setNtcEdSt(String ntcEdSt) {
     this.ntcEdSt = ntcEdSt;
 }

 public String getNtcCtg() {
     return ntcCtg;
 }

 public void setNtcCtg(String ntcCtg) {
     this.ntcCtg = ntcCtg;
 }

 public String getRegUser() {
     return regUser;
 }

 public void setRegUser(String regUser) {
     this.regUser = regUser;
 }

 public String getUdtUser() {
     return udtUser;
 }

 public void setUdtUser(String udtUser) {
     this.udtUser = udtUser;
 }

 public String getUseYn() {
     return useYn;
 }

 public void setUseYn(String useYn) {
     this.useYn = useYn;
 }

 // NtcMaster 모델 복사
 public void CopyData(NtcMaster param)
 {
     this.ntcNo = param.getNtcNo();
     this.ntcUser = param.getNtcUser();
     this.ntcTitle = param.getNtcTitle();
     this.ntcCont = param.getNtcCont();
     this.ntcStDt = param.getNtcStDt();
     this.ntcEdSt = param.getNtcEdSt();
     this.ntcCtg = param.getNtcCtg();
     this.regUser = param.getRegUser();
     this.udtUser = param.getUdtUser();
     this.useYn = param.getUseYn();
 }
}
