package com.study.demo.VO;

//FAQ 
public class FaqMaster {

 // 글번호 
 private Integer faqNo;

 // 작성자 
 private String faqUser;

 // 제목 
 private String faqTitle;

 // 내용 
 private byte[] faqCont;

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

 public Integer getFaqNo() {
     return faqNo;
 }

 public void setFaqNo(Integer faqNo) {
     this.faqNo = faqNo;
 }

 public String getFaqUser() {
     return faqUser;
 }

 public void setFaqUser(String faqUser) {
     this.faqUser = faqUser;
 }

 public String getFaqTitle() {
     return faqTitle;
 }

 public void setFaqTitle(String faqTitle) {
     this.faqTitle = faqTitle;
 }

 public byte[] getFaqCont() {
     return faqCont;
 }

 public void setFaqCont(byte[] faqCont) {
     this.faqCont = faqCont;
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

 // FaqMaster 모델 복사
 public void CopyData(FaqMaster param)
 {
     this.faqNo = param.getFaqNo();
     this.faqUser = param.getFaqUser();
     this.faqTitle = param.getFaqTitle();
     this.faqCont = param.getFaqCont();
     this.regUser = param.getRegUser();
     this.regDt = param.getRegDt();
     this.udtUser = param.getUdtUser();
     this.udtDt = param.getUdtDt();
     this.useYn = param.getUseYn();
 }
}
