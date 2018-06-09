package com.hlooc.registry.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests().anyRequest().permitAll()
//                .and().csrf().disable();

//        SavedRequestAwareAuthenticationSuccessHandler successHandler = new SavedRequestAwareAuthenticationSuccessHandler();
//        successHandler.setTargetUrlParameter("redirectTo");
//
//        http.authorizeRequests()
//                .antMatchers("/assets/**").permitAll()
//                .antMatchers( "/actuator/**").permitAll()
//                .antMatchers( "/login").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin().loginPage( "/login").successHandler(successHandler).and()
//                .logout().logoutUrl("/logout").and()
//                .httpBasic().and()
//                .csrf().disable();

        http.authorizeRequests().anyRequest().permitAll()
                .and().csrf().disable();
    }
}
