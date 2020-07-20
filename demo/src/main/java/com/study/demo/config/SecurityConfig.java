package com.study.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.study.demo.Handlers.AuthFailureHandler;
import com.study.demo.Handlers.AuthProvider;
import com.study.demo.Handlers.AuthSuccessHandler;
import com.study.demo.Handlers.LoginUrlAuth;
import com.study.demo.Handlers.WebAccessDeniedHandler;
 
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {  
    
	private final WebAccessDeniedHandler webAccessDeniedHandler;
	
    @Autowired 
    AuthProvider authProvider;//로그인 정보 담당하는 핸들러
 
    @Autowired 
    AuthSuccessHandler authSuccessHandler;//로그인 성공했을 때 핸들러
    
    @Autowired 
    AuthFailureHandler authFailureHandler;//로그인 실패했을때 핸들러
    
    @Autowired
    public SecurityConfig(WebAccessDeniedHandler webAccessDeniedHandler) {
    	this.webAccessDeniedHandler = webAccessDeniedHandler;
    }

    @Autowired
    LoginUrlAuth login;
 
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authProvider);
    }
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        
        //CROF 설정을 해제합니다
        //초기 개발시에만 설정합니다
        http.csrf().disable()
        .exceptionHandling().authenticationEntryPoint(login);
        
        http.authorizeRequests() 
           // .antMatchers("/user/**","/todo/**").access("hasRole('ROLE_USER')")    // /user/** 경로의 경우 ROLE_USER의 권한을 가진 경우에 허용한다
           // .antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')") // /admin/** 경로의 경우 ROLE_ADMIN의 권한을 가진 경우에 허용한다
            // //누구나 접속할 수 있는 페이지이기 때문에 누구나 접근이 가능하다 (.permitAll())
            .antMatchers("/**"
            		
                    /*,"/login/login"
                    , "/login/login-error"
                    , "/join/join"
                    , "/join/idCheck"
                    , "/login/find"
                    , "/join/insert"*/
            ).permitAll();
           // .antMatchers("/**").authenticated();  //기타 /** 의 경로는 인증을 필요로 한다
        
        http.formLogin() 
            .loginPage("/login/login")  //로그인 페이지는 /, /login (같은 페이지)두 페이지 에서 로그인을 실행할 것이다
            .loginProcessingUrl("/login/login-processing") //로그인 버튼을 누를시 /login-processing 경로로 
            .usernameParameter("id")  //input name 파라미터로 "id"를 받는다.
            .passwordParameter("password") //input name 파라미터로 "password"를 받는다.
            .failureHandler(authFailureHandler) //로그인 실패시 수행하는 클래스
            .successHandler(authSuccessHandler); // 로그인 성공시 수행하는 클래스
        
        http.logout() 
            .logoutRequestMatcher(new AntPathRequestMatcher("/login/logout")) //logout 경로로 요청이 들어올 경우 이 경로로 리다이렉트 하고 세션 초기화
            .logoutSuccessUrl("/login/login")  // 이 경로로 리다이렉트 하고
            .invalidateHttpSession(true); // 세션 초기화
        
        //http.exceptionHandling().accessDeniedPage("/user/denied");//페이지를 넣을 수도 있고 handler를 넣을 수도 있다.
       http.exceptionHandling().accessDeniedHandler(webAccessDeniedHandler);//핸들러를 이런식으로 만들어서 넣을 수 있다. 
    }
    
    //JSP의 리소스 파일이나 자바스크립트 파일이 저장된 경로는 무시를 한다
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring()
        .antMatchers("/api/**", "/resources/**");
    }
    
}


