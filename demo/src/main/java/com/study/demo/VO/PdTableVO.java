package com.study.demo.VO;

public class PdTableVO {
	
	public PdTableVO(Integer pdNo, String pdNm, String spdNo, String trGrpCd, String trNo, String brndNm,
			String brndRteNm, String imgRetNm, String regDt, String udtDt) {
		super();
		this.pdNo = pdNo;
		this.pdNm = pdNm;
		this.spdNo = spdNo;
		this.trGrpCd = trGrpCd;
		this.trNo = trNo;
		this.brndNm = brndNm;
		this.brndRteNm = brndRteNm;
		this.imgRetNm = imgRetNm;
		this.regDt = regDt;
		this.udtDt = udtDt;
	}
	public PdTableVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	Integer pdNo;
	public Integer getPdNo() {
		return pdNo;
	}
	public void setPdNo(Integer pdNo) {
		this.pdNo = pdNo;
	}
	public String getPdNm() {
		return pdNm;
	}
	@Override
	public String toString() {
		return "PdTableVO [pdNo=" + pdNo + ", pdNm=" + pdNm + ", spdNo=" + spdNo + ", trGrpCd=" + trGrpCd + ", trNo="
				+ trNo + ", brndNm=" + brndNm + ", brndRteNm=" + brndRteNm + ", imgRetNm=" + imgRetNm + ", regDt="
				+ regDt + ", udtDt=" + udtDt + "]";
	}
	public void setPdNm(String pdNm) {
		this.pdNm = pdNm;
	}
	public String getSpdNo() {
		return spdNo;
	}
	public void setSpdNo(String spdNo) {
		this.spdNo = spdNo;
	}
	public String getTrGrpCd() {
		return trGrpCd;
	}
	public void setTrGrpCd(String trGrpCd) {
		this.trGrpCd = trGrpCd;
	}
	public String getTrNo() {
		return trNo;
	}
	public void setTrNo(String trNo) {
		this.trNo = trNo;
	}
	public String getBrndNm() {
		return brndNm;
	}
	public void setBrndNm(String brndNm) {
		this.brndNm = brndNm;
	}
	public String getBrndRteNm() {
		return brndRteNm;
	}
	public void setBrndRteNm(String brndRteNm) {
		this.brndRteNm = brndRteNm;
	}
	public String getImgRetNm() {
		return imgRetNm;
	}
	public void setImgRetNm(String imgRetNm) {
		this.imgRetNm = imgRetNm;
	}
	public String getRegDt() {
		return regDt;
	}
	public void setRegDt(String regDt) {
		this.regDt = regDt;
	}
	public String getUdtDt() {
		return udtDt;
	}
	public void setUdtDt(String udtDt) {
		this.udtDt = udtDt;
	}
	String pdNm;
	String spdNo;
	String trGrpCd;
	String trNo;
	String brndNm;
	String brndRteNm;
	String imgRetNm;
	String regDt;
	String udtDt;
}
