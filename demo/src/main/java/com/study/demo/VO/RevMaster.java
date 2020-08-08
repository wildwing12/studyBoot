package com.study.demo.VO;

//리뷰 
public class RevMaster {

 // 상품번호 
 private Integer pdiNo;

 // 글번호 
 private Integer revNo;

 // 작성자 
 private String revUser;

 // 제목 
 private String revTitle;

 // 내용 
 private byte[] revCont;

 // 작성일시 
 private String revStDt;

 // 수정일시 
 private String revEdDt;

 // 리뷰마일리지 
 private Integer revMil;

 // 별점 
 private Double revScr;

 // 최초생성자 
 private String regUser;

 // 최종수정자 
 private String udtUser;

 // 사용여부 
 private String useYn;

 public Integer getPdiNo() {
     return pdiNo;
 }

 public void setPdiNo(Integer pdiNo) {
     this.pdiNo = pdiNo;
 }

 public Integer getRevNo() {
     return revNo;
 }

 public void setRevNo(Integer revNo) {
     this.revNo = revNo;
 }

 public String getRevUser() {
     return revUser;
 }

 public void setRevUser(String revUser) {
     this.revUser = revUser;
 }

 public String getRevTitle() {
     return revTitle;
 }

 public void setRevTitle(String revTitle) {
     this.revTitle = revTitle;
 }

 public byte[] getRevCont() {
     return revCont;
 }

 public void setRevCont(byte[] revCont) {
     this.revCont = revCont;
 }

 public String getRevStDt() {
     return revStDt;
 }

 public void setRevStDt(String revStDt) {
     this.revStDt = revStDt;
 }

 public String getRevEdDt() {
     return revEdDt;
 }

 public void setRevEdDt(String revEdDt) {
     this.revEdDt = revEdDt;
 }

 public Integer getRevMil() {
     return revMil;
 }

 public void setRevMil(Integer revMil) {
     this.revMil = revMil;
 }

 public Double getRevScr() {
     return revScr;
 }

 public void setRevScr(Double revScr) {
     this.revScr = revScr;
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

 // RevMaster 모델 복사
 public void CopyData(RevMaster param)
 {
     this.pdiNo = param.getPdiNo();
     this.revNo = param.getRevNo();
     this.revUser = param.getRevUser();
     this.revTitle = param.getRevTitle();
     this.revCont = param.getRevCont();
     this.revStDt = param.getRevStDt();
     this.revEdDt = param.getRevEdDt();
     this.revMil = param.getRevMil();
     this.revScr = param.getRevScr();
     this.regUser = param.getRegUser();
     this.udtUser = param.getUdtUser();
     this.useYn = param.getUseYn();
 }
}
