package com.study.demo.VO;

//회원마스터 
public class MemMaster {

 // 회원번호 
 private Integer memNo;

 // 아이디 
 private String memId;

 // 비밀번호 
 private String memPwd;

 // 이름 
 private String memNm;

 // 랭크 
 private String memRk;

 // 연락처 
 private String memHp;

 // 연락처2 
 private String memTel;

 // 성별 
 private String memGd;

 // 생년월일 
 private String memBirth;

 // 이메일주소 
 private String memEmail;

 // 주소(우편번호) 
 private String memZip;

 // 주소 
 private String memAddr;

 // 주소2 
 private String memAddr2;

 // 비고 
 private String memRemarks;

 // 포인트 
 private Integer memPoint;

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

 public Integer getMemNo() {
     return memNo;
 }

 public void setMemNo(Integer memNo) {
     this.memNo = memNo;
 }

 public String getMemId() {
     return memId;
 }

 public void setMemId(String memId) {
     this.memId = memId;
 }

 public String getMemPwd() {
     return memPwd;
 }

 public void setMemPwd(String memPwd) {
     this.memPwd = memPwd;
 }

 public String getMemNm() {
     return memNm;
 }

 public void setMemNm(String memNm) {
     this.memNm = memNm;
 }

 public String getMemRk() {
     return memRk;
 }

 public void setMemRk(String memRk) {
     this.memRk = memRk;
 }

 public String getMemHp() {
     return memHp;
 }

 public void setMemHp(String memHp) {
     this.memHp = memHp;
 }

 public String getMemTel() {
     return memTel;
 }

 public void setMemTel(String memTel) {
     this.memTel = memTel;
 }

 public String getMemGd() {
     return memGd;
 }

 public void setMemGd(String memGd) {
     this.memGd = memGd;
 }

 public String getMemBirth() {
     return memBirth;
 }

 public void setMemBirth(String memBirth) {
     this.memBirth = memBirth;
 }

 public String getMemEmail() {
     return memEmail;
 }

 public void setMemEmail(String memEmail) {
     this.memEmail = memEmail;
 }

 public String getMemZip() {
     return memZip;
 }

 public void setMemZip(String memZip) {
     this.memZip = memZip;
 }

 public String getMemAddr() {
     return memAddr;
 }

 public void setMemAddr(String memAddr) {
     this.memAddr = memAddr;
 }

 public String getMemAddr2() {
     return memAddr2;
 }

 public void setMemAddr2(String memAddr2) {
     this.memAddr2 = memAddr2;
 }

 public String getMemRemarks() {
     return memRemarks;
 }

 public void setMemRemarks(String memRemarks) {
     this.memRemarks = memRemarks;
 }

 public Integer getMemPoint() {
     return memPoint;
 }

 public void setMemPoint(Integer memPoint) {
     this.memPoint = memPoint;
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

 // MemMaster 모델 복사
 public void CopyData(MemMaster param)
 {
     this.memNo = param.getMemNo();
     this.memId = param.getMemId();
     this.memPwd = param.getMemPwd();
     this.memNm = param.getMemNm();
     this.memRk = param.getMemRk();
     this.memHp = param.getMemHp();
     this.memTel = param.getMemTel();
     this.memGd = param.getMemGd();
     this.memBirth = param.getMemBirth();
     this.memEmail = param.getMemEmail();
     this.memZip = param.getMemZip();
     this.memAddr = param.getMemAddr();
     this.memAddr2 = param.getMemAddr2();
     this.memRemarks = param.getMemRemarks();
     this.memPoint = param.getMemPoint();
     this.regUser = param.getRegUser();
     this.regDt = param.getRegDt();
     this.udtUser = param.getUdtUser();
     this.udtDt = param.getUdtDt();
     this.useYn = param.getUseYn();
 }
}
