package com.cristian.bitpage.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {




    @Override
    public void configure(HttpSecurity httpSecurity) throws Exception{
        httpSecurity
                .cors().disable()
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/").permitAll();
    }

}
