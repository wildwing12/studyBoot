package com.study.demo.VO;

//택배사 
public class DlvCompany {

 // 택배번호 
 private Integer dlvNo;

 // 택배업체명 
 private String dlvNm;

 // 발송일시 
 private String dlvStDt;

 // 반품일시 
 private String dlvRtDt;

 // 접수일시 
 private String dlvAcpDt;

 // 반품현황 
 private String dlvStt;

 // 택배기사명 
 private String dlvDnm;

 // 택배기사연락처 
 private String dlvDhp;

 // 접수현황 
 private String dlvAcpStt;

 // 상품번호 
 private Integer pdiNo;

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

 public Integer getDlvNo() {
     return dlvNo;
 }

 public void setDlvNo(Integer dlvNo) {
     this.dlvNo = dlvNo;
 }

 public String getDlvNm() {
     return dlvNm;
 }

 public void setDlvNm(String dlvNm) {
     this.dlvNm = dlvNm;
 }

 public String getDlvStDt() {
     return dlvStDt;
 }

 public void setDlvStDt(String dlvStDt) {
     this.dlvStDt = dlvStDt;
 }

 public String getDlvRtDt() {
     return dlvRtDt;
 }

 public void setDlvRtDt(String dlvRtDt) {
     this.dlvRtDt = dlvRtDt;
 }

 public String getDlvAcpDt() {
     return dlvAcpDt;
 }

 public void setDlvAcpDt(String dlvAcpDt) {
     this.dlvAcpDt = dlvAcpDt;
 }

 public String getDlvStt() {
     return dlvStt;
 }

 public void setDlvStt(String dlvStt) {
     this.dlvStt = dlvStt;
 }

 public String getDlvDnm() {
     return dlvDnm;
 }

 public void setDlvDnm(String dlvDnm) {
     this.dlvDnm = dlvDnm;
 }

 public String getDlvDhp() {
     return dlvDhp;
 }

 public void setDlvDhp(String dlvDhp) {
     this.dlvDhp = dlvDhp;
 }

 public String getDlvAcpStt() {
     return dlvAcpStt;
 }

 public void setDlvAcpStt(String dlvAcpStt) {
     this.dlvAcpStt = dlvAcpStt;
 }

 public Integer getPdiNo() {
     return pdiNo;
 }

 public void setPdiNo(Integer pdiNo) {
     this.pdiNo = pdiNo;
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

 // DlvCompany 모델 복사
 public void CopyData(DlvCompany param)
 {
     this.dlvNo = param.getDlvNo();
     this.dlvNm = param.getDlvNm();
     this.dlvStDt = param.getDlvStDt();
     this.dlvRtDt = param.getDlvRtDt();
     this.dlvAcpDt = param.getDlvAcpDt();
     this.dlvStt = param.getDlvStt();
     this.dlvDnm = param.getDlvDnm();
     this.dlvDhp = param.getDlvDhp();
     this.dlvAcpStt = param.getDlvAcpStt();
     this.pdiNo = param.getPdiNo();
     this.regUser = param.getRegUser();
     this.regDt = param.getRegDt();
     this.udtUser = param.getUdtUser();
     this.udtDt = param.getUdtDt();
     this.useYn = param.getUseYn();
 }
}
