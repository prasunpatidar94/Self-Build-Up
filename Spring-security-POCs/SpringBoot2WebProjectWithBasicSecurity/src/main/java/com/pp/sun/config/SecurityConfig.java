package com.pp.sun.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    //Authentication
    @Override
    public void configure(AuthenticationManagerBuilder authentication) throws Exception {


        //user details and username and password

        authentication
                .inMemoryAuthentication()
                .withUser("prasun")
                .password("{noop}123@123")
                .authorities("EMP");
        authentication
                .inMemoryAuthentication()
                .withUser("ram")
                .password("{noop}123@123")
                .authorities("MANAGER");
        authentication
                .inMemoryAuthentication()
                .withUser("mahakal")
                .password("{noop}mahakal")
                .authorities("ADMIN");
    }

    //Authorization all request
    @Override
    public void configure(HttpSecurity httpsAuthorization) throws Exception {

        //url --roles ()
        //login form details
        //logout form details
        //exception hendling

        httpsAuthorization
                .authorizeRequests()
                .antMatchers("/home").permitAll()
                .antMatchers("/get/*").authenticated()
                .antMatchers("/modification**").hasAuthority("ADMIN")
                .antMatchers("/apprave/**").hasAuthority("MANAGER")
                .antMatchers("/emp**").hasAnyAuthority("ADMIN","MANAGER","EMP")
                .anyRequest().authenticated()

                .and()
                .formLogin()

                .and()
                .logout()
        ;
    }
}