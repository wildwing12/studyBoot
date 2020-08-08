package com.study.demo.VO;

//계산서 
public class BilMaster {

 // 영수증코드 
 private Integer bilNo;

 // 가명점명 
 private String bilComNm;

 // 대표자명 
 private String bilCnm;

 // 사업자번호 
 private Integer bilCno;

 // 전화번호 
 private String bilHp;

 // 이메일주소 
 private String bilEmail;

 // 카드종류 
 private String bilCct;

 // 카드번호 
 private Integer bilCctNo;

 // 유효기간 
 private String bilPdt;

 // 결제방법 
 private String bilPmMth;

 // 판매금액 
 private Integer bilFee;

 // 부가세 
 private Integer bilTax;

 // 승인금액 
 private Integer bilAcpFee;

 // 승인일시 
 private String bilAcpDt;

 // 가맹점번호 
 private Integer bilFcNo;

 // 승인여부 
 private String bilAcpYn;

 // 발행일시 
 private String bilDt;

 // 고객서명여부 
 private String bilSignYn;

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

 // 정산번호 
 private Integer stmNo;

 public Integer getBilNo() {
     return bilNo;
 }

 public void setBilNo(Integer bilNo) {
     this.bilNo = bilNo;
 }

 public String getBilComNm() {
     return bilComNm;
 }

 public void setBilComNm(String bilComNm) {
     this.bilComNm = bilComNm;
 }

 public String getBilCnm() {
     return bilCnm;
 }

 public void setBilCnm(String bilCnm) {
     this.bilCnm = bilCnm;
 }

 public Integer getBilCno() {
     return bilCno;
 }

 public void setBilCno(Integer bilCno) {
     this.bilCno = bilCno;
 }

 public String getBilHp() {
     return bilHp;
 }

 public void setBilHp(String bilHp) {
     this.bilHp = bilHp;
 }

 public String getBilEmail() {
     return bilEmail;
 }

 public void setBilEmail(String bilEmail) {
     this.bilEmail = bilEmail;
 }

 public String getBilCct() {
     return bilCct;
 }

 public void setBilCct(String bilCct) {
     this.bilCct = bilCct;
 }

 public Integer getBilCctNo() {
     return bilCctNo;
 }

 public void setBilCctNo(Integer bilCctNo) {
     this.bilCctNo = bilCctNo;
 }

 public String getBilPdt() {
     return bilPdt;
 }

 public void setBilPdt(String bilPdt) {
     this.bilPdt = bilPdt;
 }

 public String getBilPmMth() {
     return bilPmMth;
 }

 public void setBilPmMth(String bilPmMth) {
     this.bilPmMth = bilPmMth;
 }

 public Integer getBilFee() {
     return bilFee;
 }

 public void setBilFee(Integer bilFee) {
     this.bilFee = bilFee;
 }

 public Integer getBilTax() {
     return bilTax;
 }

 public void setBilTax(Integer bilTax) {
     this.bilTax = bilTax;
 }

 public Integer getBilAcpFee() {
     return bilAcpFee;
 }

 public void setBilAcpFee(Integer bilAcpFee) {
     this.bilAcpFee = bilAcpFee;
 }

 public String getBilAcpDt() {
     return bilAcpDt;
 }

 public void setBilAcpDt(String bilAcpDt) {
     this.bilAcpDt = bilAcpDt;
 }

 public Integer getBilFcNo() {
     return bilFcNo;
 }

 public void setBilFcNo(Integer bilFcNo) {
     this.bilFcNo = bilFcNo;
 }

 public String getBilAcpYn() {
     return bilAcpYn;
 }

 public void setBilAcpYn(String bilAcpYn) {
     this.bilAcpYn = bilAcpYn;
 }

 public String getBilDt() {
     return bilDt;
 }

 public void setBilDt(String bilDt) {
     this.bilDt = bilDt;
 }

 public String getBilSignYn() {
     return bilSignYn;
 }

 public void setBilSignYn(String bilSignYn) {
     this.bilSignYn = bilSignYn;
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

 public Integer getStmNo() {
     return stmNo;
 }

 public void setStmNo(Integer stmNo) {
     this.stmNo = stmNo;
 }

 // BilMaster 모델 복사
 public void CopyData(BilMaster param)
 {
     this.bilNo = param.getBilNo();
     this.bilComNm = param.getBilComNm();
     this.bilCnm = param.getBilCnm();
     this.bilCno = param.getBilCno();
     this.bilHp = param.getBilHp();
     this.bilEmail = param.getBilEmail();
     this.bilCct = param.getBilCct();
     this.bilCctNo = param.getBilCctNo();
     this.bilPdt = param.getBilPdt();
     this.bilPmMth = param.getBilPmMth();
     this.bilFee = param.getBilFee();
     this.bilTax = param.getBilTax();
     this.bilAcpFee = param.getBilAcpFee();
     this.bilAcpDt = param.getBilAcpDt();
     this.bilFcNo = param.getBilFcNo();
     this.bilAcpYn = param.getBilAcpYn();
     this.bilDt = param.getBilDt();
     this.bilSignYn = param.getBilSignYn();
     this.regUser = param.getRegUser();
     this.regDt = param.getRegDt();
     this.udtUser = param.getUdtUser();
     this.udtDt = param.getUdtDt();
     this.useYn = param.getUseYn();
     this.stmNo = param.getStmNo();
 }
}
