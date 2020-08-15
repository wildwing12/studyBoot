package com.study.demo.VO;

//업체마스터 
public class ComMaster {

 // 업체번호 
 private Integer comNo;

 // 업체명 
 private String comNm;

 // 대표명 
 private String comCnm;

 // 사업자등록번호 
 private String comCno;

 // 법인번호 
 private String comLno;

 // 회사연락처 
 private String comTel;

 // 대표연락처 
 private String comHp;

 // 회사이메일 
 private String comEmail;

 // 회사우편번호 
 private String comZip;

 // 회사주소 
 private String comAddr;

 // 회사주소2 
 private String comAddr2;

 // 계약시작일 
 private String comPrdSt;

 // 계약종료일 
 private String comPrdEd;

 // 입점업체등급 
 private String comRk;

 // 거래처코드 
 private String comTrCd;

 // 거래처그룹코드 
 private String comTrGrpCd;

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

 // 업태
 private String comType;
 
 //게시판 시작 페이지
 private int begin;
 
 //게시판 로우겟수
 private int pageScale;
 
 public int getBegin() {
	return begin;
}

public void setBegin(int begin) {
	this.begin = begin;
}

public int getPageScale() {
	return pageScale;
}

public void setPageScale(int pageScale) {
	this.pageScale = pageScale;
}

public String getComType() {
	return comType;
}

public void setComType(String comType) {
	this.comType = comType;
}

public Integer getComNo() {
     return comNo;
 }

 public void setComNo(Integer comNo) {
     this.comNo = comNo;
 }

 public String getComNm() {
     return comNm;
 }

 public void setComNm(String comNm) {
     this.comNm = comNm;
 }

 public String getComCnm() {
     return comCnm;
 }

 public void setComCnm(String comCnm) {
     this.comCnm = comCnm;
 }

 public String getComCno() {
     return comCno;
 }

 public void setComCno(String comCno) {
     this.comCno = comCno;
 }

 public String getComLno() {
     return comLno;
 }

 public void setComLno(String comLno) {
     this.comLno = comLno;
 }

 public String getComTel() {
     return comTel;
 }

 public void setComTel(String comTel) {
     this.comTel = comTel;
 }

 public String getComHp() {
     return comHp;
 }

 public void setComHp(String comHp) {
     this.comHp = comHp;
 }

 public String getComEmail() {
     return comEmail;
 }

 public void setComEmail(String comEmail) {
     this.comEmail = comEmail;
 }

 public String getComZip() {
     return comZip;
 }

 public void setComZip(String comZip) {
     this.comZip = comZip;
 }

 public String getComAddr() {
     return comAddr;
 }

 public void setComAddr(String comAddr) {
     this.comAddr = comAddr;
 }

 public String getComAddr2() {
     return comAddr2;
 }

 public void setComAddr2(String comAddr2) {
     this.comAddr2 = comAddr2;
 }

 public String getComPrdSt() {
     return comPrdSt;
 }

 public void setComPrdSt(String comPrdSt) {
     this.comPrdSt = comPrdSt;
 }

 public String getComPrdEd() {
     return comPrdEd;
 }

 public void setComPrdEd(String comPrdEd) {
     this.comPrdEd = comPrdEd;
 }

 public String getComRk() {
     return comRk;
 }

 public void setComRk(String comRk) {
     this.comRk = comRk;
 }

 public String getComTrCd() {
     return comTrCd;
 }

 public void setComTrCd(String comTrCd) {
     this.comTrCd = comTrCd;
 }

 public String getComTrGrpCd() {
     return comTrGrpCd;
 }

 public void setComTrGrpCd(String comTrGrpCd) {
     this.comTrGrpCd = comTrGrpCd;
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

 // ComMaster 모델 복사
 public void CopyData(ComMaster param)
 {
     this.comNo = param.getComNo();
     this.comNm = param.getComNm();
     this.comCnm = param.getComCnm();
     this.comCno = param.getComCno();
     this.comLno = param.getComLno();
     this.comTel = param.getComTel();
     this.comHp = param.getComHp();
     this.comEmail = param.getComEmail();
     this.comZip = param.getComZip();
     this.comAddr = param.getComAddr();
     this.comAddr2 = param.getComAddr2();
     this.comPrdSt = param.getComPrdSt();
     this.comPrdEd = param.getComPrdEd();
     this.comRk = param.getComRk();
     this.comTrCd = param.getComTrCd();
     this.comTrGrpCd = param.getComTrGrpCd();
     this.regUser = param.getRegUser();
     this.regDt = param.getRegDt();
     this.udtUser = param.getUdtUser();
     this.udtDt = param.getUdtDt();
     this.useYn = param.getUseYn();
 }
}
