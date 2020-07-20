package com.study.demo.service;

import javax.servlet.http.HttpSession;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.study.demo.VO.LoginLogVO;
import com.study.demo.VO.ManagerVO;
 
public interface SecurityService extends UserDetailsService {
    // 시큐리티 사용자 인증
    
	UserDetails loadUserByUsername(String id);
    // 중복아이디 체크
	ManagerVO getSelectMeberInfo(String id) throws Exception;
    //회원가입
    int setInsertMember(ManagerVO member)throws Exception;
    // 비밀번호 틀린 횟수 증가
    int setUpdatePasswordLockCnt(String id) throws Exception;
    // 비밀번호 틀린 횟수 초기화
    int setUpdatePasswordLockCntReset(String id) throws Exception;
    
    int setInsertLoginLog(LoginLogVO loginLog) throws Exception;
	
    ManagerVO infoMember(HttpSession session, String id);
}


