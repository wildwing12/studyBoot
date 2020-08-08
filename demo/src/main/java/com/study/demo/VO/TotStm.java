package com.study.demo.VO;

//종합정산 
public class TotStm {

 // 정산번호 
 private Integer totNo;

 // 회사명 
 private String totComNm;

 // 판매대금 
 private Integer totFee;

 // 정산금액 
 private Integer totFee2;

 // 정산비율 
 private Integer totFeeRate;

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

 public Integer getTotNo() {
     return totNo;
 }

 public void setTotNo(Integer totNo) {
     this.totNo = totNo;
 }

 public String getTotComNm() {
     return totComNm;
 }

 public void setTotComNm(String totComNm) {
     this.totComNm = totComNm;
 }

 public Integer getTotFee() {
     return totFee;
 }

 public void setTotFee(Integer totFee) {
     this.totFee = totFee;
 }

 public Integer getTotFee2() {
     return totFee2;
 }

 public void setTotFee2(Integer totFee2) {
     this.totFee2 = totFee2;
 }

 public Integer getTotFeeRate() {
     return totFeeRate;
 }

 public void setTotFeeRate(Integer totFeeRate) {
     this.totFeeRate = totFeeRate;
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

 // TotStm 모델 복사
 public void CopyData(TotStm param)
 {
     this.totNo = param.getTotNo();
     this.totComNm = param.getTotComNm();
     this.totFee = param.getTotFee();
     this.totFee2 = param.getTotFee2();
     this.totFeeRate = param.getTotFeeRate();
     this.regUser = param.getRegUser();
     this.regDt = param.getRegDt();
     this.udtUser = param.getUdtUser();
     this.udtDt = param.getUdtDt();
     this.useYn = param.getUseYn();
 }
}
