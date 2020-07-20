package com.study.demo.Handlers;

import java.util.List;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import com.study.demo.VO.ManagerVO;

import lombok.Data;
 
 
//현재 로그인한 사용자 객체 저장 DTO
@Data
public class MyAuthentication extends UsernamePasswordAuthenticationToken{
    private static final long serialVersionUID = 1L;
    
    ManagerVO vo;
    
    public MyAuthentication(String id, String password, List<GrantedAuthority> grantedAuthorityList, ManagerVO vo) {
        super(id, password, grantedAuthorityList);
        this.vo = vo;
    }
}


