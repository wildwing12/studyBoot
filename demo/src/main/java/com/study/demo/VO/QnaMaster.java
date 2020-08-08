package com.study.demo.VO;

//QNA 
public class QnaMaster {

 // 글번호 
 private Integer qnaNo;

 // 작성자 
 private String qnaUser;

 // 제목 
 private String qnaTitle;

 // 내용 
 private byte[] qnaCont;

 // 작성일시 
 private String qnaStDt;

 // 수정일시 
 private String qnaEdDt;

 // 비밀글여부 
 private String qnaSecYn;

 // 최초생성자 
 private String regUser;

 // 최종수정자 
 private String udtUser;

 // 사용여부 
 private String useYn;

 public Integer getQnaNo() {
     return qnaNo;
 }

 public void setQnaNo(Integer qnaNo) {
     this.qnaNo = qnaNo;
 }

 public String getQnaUser() {
     return qnaUser;
 }

 public void setQnaUser(String qnaUser) {
     this.qnaUser = qnaUser;
 }

 public String getQnaTitle() {
     return qnaTitle;
 }

 public void setQnaTitle(String qnaTitle) {
     this.qnaTitle = qnaTitle;
 }

 public byte[] getQnaCont() {
     return qnaCont;
 }

 public void setQnaCont(byte[] qnaCont) {
     this.qnaCont = qnaCont;
 }

 public String getQnaStDt() {
     return qnaStDt;
 }

 public void setQnaStDt(String qnaStDt) {
     this.qnaStDt = qnaStDt;
 }

 public String getQnaEdDt() {
     return qnaEdDt;
 }

 public void setQnaEdDt(String qnaEdDt) {
     this.qnaEdDt = qnaEdDt;
 }

 public String getQnaSecYn() {
     return qnaSecYn;
 }

 public void setQnaSecYn(String qnaSecYn) {
     this.qnaSecYn = qnaSecYn;
 }

 public String getRegUser() {
     return regUser;
 }

 public void setRegUser(String regUser) {
     this.regUser = regUser;
 }

 public String getUdtUser() {
     return udtUser;
 }

 public void setUdtUser(String udtUser) {
     this.udtUser = udtUser;
 }

 public String getUseYn() {
     return useYn;
 }

 public void setUseYn(String useYn) {
     this.useYn = useYn;
 }

 // QnaMaster 모델 복사
 public void CopyData(QnaMaster param)
 {
     this.qnaNo = param.getQnaNo();
     this.qnaUser = param.getQnaUser();
     this.qnaTitle = param.getQnaTitle();
     this.qnaCont = param.getQnaCont();
     this.qnaStDt = param.getQnaStDt();
     this.qnaEdDt = param.getQnaEdDt();
     this.qnaSecYn = param.getQnaSecYn();
     this.regUser = param.getRegUser();
     this.udtUser = param.getUdtUser();
     this.useYn = param.getUseYn();
 }
}
