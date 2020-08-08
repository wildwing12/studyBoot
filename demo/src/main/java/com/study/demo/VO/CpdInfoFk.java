package com.study.demo.VO;

//업체 상품 정보 
public class CpdInfoFk {

 // 회원업체번호 
 private Integer comNo;

 // 상품발주업체번호 
 private Integer pdoComNo;

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

 public Integer getComNo() {
     return comNo;
 }

 public void setComNo(Integer comNo) {
     this.comNo = comNo;
 }

 public Integer getPdoComNo() {
     return pdoComNo;
 }

 public void setPdoComNo(Integer pdoComNo) {
     this.pdoComNo = pdoComNo;
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

 // CpdInfoFk 모델 복사
 public void CopyData(CpdInfoFk param)
 {
     this.comNo = param.getComNo();
     this.pdoComNo = param.getPdoComNo();
     this.regUser = param.getRegUser();
     this.regDt = param.getRegDt();
     this.udtUser = param.getUdtUser();
     this.udtDt = param.getUdtDt();
     this.useYn = param.getUseYn();
     this.pdiNo = param.getPdiNo();
 }
}
