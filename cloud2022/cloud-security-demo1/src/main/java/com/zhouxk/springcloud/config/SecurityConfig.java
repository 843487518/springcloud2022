package com.zhouxk.springcloud.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

import javax.sql.DataSource;

/**
 * @PACKAGE_NAME: com.zhouxk.springcloud.config
 * @NAME: SecurityConfig
 * @USER: zhouxk
 * @DATE: 2023/6/4
 * @TIME: 15:28
 * @DAY_NAME_FULL: 星期日
 * @PROJECT_NAME: cloud2022
 * @DESCRIPTION: TODO
 */
//@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private DataSource dataSource;

    @Bean
    public PersistentTokenRepository persistentTokenRepository(){
        JdbcTokenRepositoryImpl jdbcTokenRepository = new JdbcTokenRepositoryImpl();
        jdbcTokenRepository.setDataSource(dataSource);
        //jdbcTokenRepository.setCreateTableOnStartup(true);
        //是否需要spring帮忙创建表
        return jdbcTokenRepository;
    }

    //密码编译器
    @Bean
    PasswordEncoder password(){
        return NoOpPasswordEncoder.getInstance();
    }

    //配置认证相关信息
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        配置登录用户名密码，测试用
//        auth.inMemoryAuthentication().withUser("zhouxk1").password("zhouxk1").roles("admin");
//        配置用户名登录密码，数据库读取
        auth.userDetailsService(userDetailsService).passwordEncoder(password());
    }

    //配置访问权限相关信息
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/test/logout").permitAll();
        http.formLogin()
                .loginPage("/login.html")//登录页面自定义
                .loginProcessingUrl("/user/login")//访问登录的地址
                .defaultSuccessUrl("/success1.html")//登录成功之后的跳转地址
                .permitAll()
                .and()
                .authorizeRequests()
                .antMatchers("/","/test/hello1","/user/login","/test/error").permitAll()//设置这些路径不需要认证
//                .antMatchers("/test/hello3").hasAuthority("123456789")
                .anyRequest().authenticated()//所有路径需要验证
                .and().rememberMe()
                .tokenRepository(persistentTokenRepository())
                .tokenValiditySeconds(60)
                .userDetailsService(userDetailsService)
                .and().csrf().disable();//关闭

    }
}
