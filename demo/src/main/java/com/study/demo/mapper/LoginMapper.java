package com.study.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.study.demo.VO.LoginLogVO;
import com.study.demo.VO.ManagerVO;
 
@Mapper
public interface LoginMapper{
 
    //메소드 앞에 public 생략해도 기본적으로 public가 붙는다.
    
    /* 회원정보조회 */
	ManagerVO getSelectMeberInfo(String id);
    /* 회원가입 */
    public int setInsertMember(ManagerVO member);
    /* 로그인 로그 */
    public int setInsertLoginLog(LoginLogVO loginLog);
    /* 비밀번호 틀린 횟수 증 */
    public int setUpdatePasswordLockCnt(String id);
    /* 비밀번호 틀린횟수 초기화 */
    public int setUpdatePasswordLockCntReset(String id);
     
}


