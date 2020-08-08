package com.study.demo.VO;

//정산마스터 
public class StmMaster {

 // 정산번호 
 private Integer stmNo;

 // 회사명 
 private String stmComNm;

 // 판매대금 
 private Integer stmFee;

 // 정산금액 
 private Integer stmFee2;

 // 정산비율 
 private Integer stmFeeRate;

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

 public Integer getStmNo() {
     return stmNo;
 }

 public void setStmNo(Integer stmNo) {
     this.stmNo = stmNo;
 }

 public String getStmComNm() {
     return stmComNm;
 }

 public void setStmComNm(String stmComNm) {
     this.stmComNm = stmComNm;
 }

 public Integer getStmFee() {
     return stmFee;
 }

 public void setStmFee(Integer stmFee) {
     this.stmFee = stmFee;
 }

 public Integer getStmFee2() {
     return stmFee2;
 }

 public void setStmFee2(Integer stmFee2) {
     this.stmFee2 = stmFee2;
 }

 public Integer getStmFeeRate() {
     return stmFeeRate;
 }

 public void setStmFeeRate(Integer stmFeeRate) {
     this.stmFeeRate = stmFeeRate;
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

 // StmMaster 모델 복사
 public void CopyData(StmMaster param)
 {
     this.stmNo = param.getStmNo();
     this.stmComNm = param.getStmComNm();
     this.stmFee = param.getStmFee();
     this.stmFee2 = param.getStmFee2();
     this.stmFeeRate = param.getStmFeeRate();
     this.regUser = param.getRegUser();
     this.regDt = param.getRegDt();
     this.udtUser = param.getUdtUser();
     this.udtDt = param.getUdtDt();
     this.useYn = param.getUseYn();
 }
}
