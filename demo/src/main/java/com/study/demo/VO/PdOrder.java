package com.study.demo.VO;

//상품발주 
public class PdOrder {

 // 입점업체 
 private String pdoCom;

 // 업체번호 
 private Integer pdoComNo;

 // 상품명 
 private String pdoNm;

 // 상품수량 
 private Integer pdoAmt;

 // 상품금액 
 private Integer pdoPrc;

 // 발주일자 
 private String pdoOrdDt;

 // 미발주 수량 
 private Integer pdoMordAmt;

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

 public String getPdoCom() {
     return pdoCom;
 }

 public void setPdoCom(String pdoCom) {
     this.pdoCom = pdoCom;
 }

 public Integer getPdoComNo() {
     return pdoComNo;
 }

 public void setPdoComNo(Integer pdoComNo) {
     this.pdoComNo = pdoComNo;
 }

 public String getPdoNm() {
     return pdoNm;
 }

 public void setPdoNm(String pdoNm) {
     this.pdoNm = pdoNm;
 }

 public Integer getPdoAmt() {
     return pdoAmt;
 }

 public void setPdoAmt(Integer pdoAmt) {
     this.pdoAmt = pdoAmt;
 }

 public Integer getPdoPrc() {
     return pdoPrc;
 }

 public void setPdoPrc(Integer pdoPrc) {
     this.pdoPrc = pdoPrc;
 }

 public String getPdoOrdDt() {
     return pdoOrdDt;
 }

 public void setPdoOrdDt(String pdoOrdDt) {
     this.pdoOrdDt = pdoOrdDt;
 }

 public Integer getPdoMordAmt() {
     return pdoMordAmt;
 }

 public void setPdoMordAmt(Integer pdoMordAmt) {
     this.pdoMordAmt = pdoMordAmt;
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

 // PdOrder 모델 복사
 public void CopyData(PdOrder param)
 {
     this.pdoCom = param.getPdoCom();
     this.pdoComNo = param.getPdoComNo();
     this.pdoNm = param.getPdoNm();
     this.pdoAmt = param.getPdoAmt();
     this.pdoPrc = param.getPdoPrc();
     this.pdoOrdDt = param.getPdoOrdDt();
     this.pdoMordAmt = param.getPdoMordAmt();
     this.regUser = param.getRegUser();
     this.regDt = param.getRegDt();
     this.udtUser = param.getUdtUser();
     this.udtDt = param.getUdtDt();
     this.useYn = param.getUseYn();
 }
}
