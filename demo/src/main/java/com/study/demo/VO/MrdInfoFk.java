package com.study.demo.VO;

//회원 주문 정보 
public class MrdInfoFk {

 // 번호 
 private Integer mrdIdx;

 // 회원번호 
 private Integer memNo;

 // 업체번호 
 private Integer comNo;

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

 // 주문번호 
 private Integer ordNo;

 // 정산번호 
 private Integer stmNo;

 public Integer getMrdIdx() {
     return mrdIdx;
 }

 public void setMrdIdx(Integer mrdIdx) {
     this.mrdIdx = mrdIdx;
 }

 public Integer getMemNo() {
     return memNo;
 }

 public void setMemNo(Integer memNo) {
     this.memNo = memNo;
 }

 public Integer getComNo() {
     return comNo;
 }

 public void setComNo(Integer comNo) {
     this.comNo = comNo;
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

 public Integer getOrdNo() {
     return ordNo;
 }

 public void setOrdNo(Integer ordNo) {
     this.ordNo = ordNo;
 }

 public Integer getStmNo() {
     return stmNo;
 }

 public void setStmNo(Integer stmNo) {
     this.stmNo = stmNo;
 }

 // MrdInfoFk 모델 복사
 public void CopyData(MrdInfoFk param)
 {
     this.mrdIdx = param.getMrdIdx();
     this.memNo = param.getMemNo();
     this.comNo = param.getComNo();
     this.regUser = param.getRegUser();
     this.regDt = param.getRegDt();
     this.udtUser = param.getUdtUser();
     this.udtDt = param.getUdtDt();
     this.useYn = param.getUseYn();
     this.ordNo = param.getOrdNo();
     this.stmNo = param.getStmNo();
 }
}
