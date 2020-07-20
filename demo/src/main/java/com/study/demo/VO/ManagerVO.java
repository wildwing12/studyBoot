package com.study.demo.VO;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;
 
@Data
public class ManagerVO implements UserDetails {
 
    private static final long serialVersionUID = 1L;
    
    private String id;
    private String password;
    private String memberName;
    private String email;
    private String userRole;
    private int passwordLock;
    private String regDate;
    private String modDate;
    private String passwordChgDate;
    private String status;
    
    /*UserDetails 기본 상속 변수 */
    private Collection<? extends GrantedAuthority> authorities;
    private boolean isEnabled = true;
    private String username;
    private boolean isCredentialsNonExpired = true;
    private boolean isAccountNonExpired = true;
    private boolean isAccountNonLocked = true;
 
}


