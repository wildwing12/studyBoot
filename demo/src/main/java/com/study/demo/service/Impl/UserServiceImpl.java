package com.study.demo.service.Impl;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.study.demo.VO.LoginLogVO;
import com.study.demo.VO.ManagerVO;
import com.study.demo.mapper.LoginMapper;
import com.study.demo.service.SecurityService;

import lombok.extern.slf4j.Slf4j;
 
@Slf4j
@Service
public class UserServiceImpl implements SecurityService {
    
    @Autowired
    LoginMapper loingMapper;
    
    @Override
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
    	ManagerVO member = loingMapper.getSelectMeberInfo(id);//데이터 베이스에서 정보 출력
         List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
         
         if(member != null) {
             authorities.add(new SimpleGrantedAuthority(member.getUserRole()));//member에서 가져온 권한을 스프링시큐리티에 넣어줌
             member.setAuthorities(authorities);//그걸 다시 권한으로 집어 넣음
         }
         return member;
    }
    
    @Override
    public int setInsertMember(ManagerVO vo) throws Exception{
    	vo.setPassword(new BCryptPasswordEncoder().encode(vo.getPassword()));
        return loingMapper.setInsertMember(vo);
    }
 
    @Override
    public ManagerVO getSelectMeberInfo(String id) throws Exception{
        return loingMapper.getSelectMeberInfo(id);
    }
    
    @Override
    public int setUpdatePasswordLockCnt(String id) throws Exception{
        return loingMapper.setUpdatePasswordLockCnt(id);
    }
    
    @Override
    public int setUpdatePasswordLockCntReset(String id) throws Exception{
        return loingMapper.setUpdatePasswordLockCntReset(id);
    }

	@Override
	public int setInsertLoginLog(LoginLogVO loginLog) throws Exception {
		return loingMapper.setInsertLoginLog(loginLog);
	}

	@Override
	public ManagerVO infoMember(HttpSession session, String id) {
		ManagerVO member = loingMapper.getSelectMeberInfo(id);
    	if(member != null) {
    		log.info("유저 이름은 ={}", member.getMemberName());
    		session.setAttribute("member", member);
    	}
		return member;
	}
 
}


