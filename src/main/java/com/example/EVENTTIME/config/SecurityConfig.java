package com.example.EVENTTIME.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.access.AccessDeniedHandler;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers(
                        Endpoints.HOME,
                        Endpoints.LOGIN

                ).permitAll()
                .antMatchers(
                        "/css/**",
                        "/images/**",
                        "/js/**"
                ).permitAll()

                .and()
                .logout().logoutSuccessUrl("/")
                .and()
                .oauth2Client()
                .and()
                .oauth2Login()
                .and()
                .csrf()
                .disable();

    }
}