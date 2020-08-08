package com.study.demo.VO;

//주문현황 
public class OrdState {

 // 주문번호 
 private Integer ordNo;

 // 회원 아이디 
 private String memId;

 // 판매자 아이디 
 private String comId;

 // 송장번호 
 private String ordDlvNo;

 // 주문금액 
 private Integer ordFee;

 // 구매일시 
 private String ordDt;

 // 반품 여부 
 private String ordReturn;

 // 결제방법 
 private String ordPmMth;

 // 구매수량 
 private Integer ordAmt;

 // 비고(배송메세지) 
 private String ordRemarks;

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

 // 상품번호 
 private Integer pdiNo;

 public Integer getOrdNo() {
     return ordNo;
 }

 public void setOrdNo(Integer ordNo) {
     this.ordNo = ordNo;
 }

 public String getMemId() {
     return memId;
 }

 public void setMemId(String memId) {
     this.memId = memId;
 }

 public String getComId() {
     return comId;
 }

 public void setComId(String comId) {
     this.comId = comId;
 }

 public String getOrdDlvNo() {
     return ordDlvNo;
 }

 public void setOrdDlvNo(String ordDlvNo) {
     this.ordDlvNo = ordDlvNo;
 }

 public Integer getOrdFee() {
     return ordFee;
 }

 public void setOrdFee(Integer ordFee) {
     this.ordFee = ordFee;
 }

 public String getOrdDt() {
     return ordDt;
 }

 public void setOrdDt(String ordDt) {
     this.ordDt = ordDt;
 }

 public String getOrdReturn() {
     return ordReturn;
 }

 public void setOrdReturn(String ordReturn) {
     this.ordReturn = ordReturn;
 }

 public String getOrdPmMth() {
     return ordPmMth;
 }

 public void setOrdPmMth(String ordPmMth) {
     this.ordPmMth = ordPmMth;
 }

 public Integer getOrdAmt() {
     return ordAmt;
 }

 public void setOrdAmt(Integer ordAmt) {
     this.ordAmt = ordAmt;
 }

 public String getOrdRemarks() {
     return ordRemarks;
 }

 public void setOrdRemarks(String ordRemarks) {
     this.ordRemarks = ordRemarks;
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

 public Integer getPdiNo() {
     return pdiNo;
 }

 public void setPdiNo(Integer pdiNo) {
     this.pdiNo = pdiNo;
 }

 // OrdState 모델 복사
 public void CopyData(OrdState param)
 {
     this.ordNo = param.getOrdNo();
     this.memId = param.getMemId();
     this.comId = param.getComId();
     this.ordDlvNo = param.getOrdDlvNo();
     this.ordFee = param.getOrdFee();
     this.ordDt = param.getOrdDt();
     this.ordReturn = param.getOrdReturn();
     this.ordPmMth = param.getOrdPmMth();
     this.ordAmt = param.getOrdAmt();
     this.ordRemarks = param.getOrdRemarks();
     this.regUser = param.getRegUser();
     this.regDt = param.getRegDt();
     this.udtUser = param.getUdtUser();
     this.udtDt = param.getUdtDt();
     this.useYn = param.getUseYn();
     this.pdiNo = param.getPdiNo();
 }
}
