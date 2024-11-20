/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pujitha.springsecuritybasic.config;

import java.util.Collections;
import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;

/**
 *
 * @author ppujita5
 */
@Configuration
public class ProjectSecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     *
     * /myAccount - secured /myLoans - secured /myCards - secured /notices -
     * not secured /contact - not secured
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        /*Default configuration for all the requests */

//        http.authorizeRequests().anyRequest().authenticated()
//                .and().formLogin().and().httpBasic();

        /* Custom Configuration as per our requirement */
//        http.authorizeRequests().antMatchers("/myAccount").authenticated()
//                .antMatchers("/myLoans").authenticated()
//                .antMatchers("/myCards").authenticated()
//                .antMatchers("/notices").permitAll()
//                .antMatchers("/contact").permitAll()
//                .and()
//                .formLogin()
//                .and()
//                .httpBasic();

        /* Configuration to deny all the requests */
//            http.authorizeRequests().anyRequest().denyAll()
//                    .and().formLogin().and().httpBasic();

        /* Configuration to deny all the requests */
//            http.authorizeRequests().anyRequest().permitAll()
//                    .and().formLogin().and().httpBasic();
        /* Securing with CORS */
//        http.cors().configurationSource(new CorsConfigurationSource() {
//            @Override
//            public CorsConfiguration getCorsConfiguration(HttpServletRequest request) {
//                CorsConfiguration config = new CorsConfiguration();
//                config.setAllowedOrigins(Collections.singletonList("http://localhost:4200"));
//                config.setAllowedMethods(Collections.singletonList("*"));
//                config.setAllowedHeaders(Collections.singletonList("*"));
//                config.setAllowCredentials(true);
//                config.setMaxAge(3600L);
//                return config;
//            }
//        }).and().
//                authorizeRequests().antMatchers("/myAccount").authenticated()
//                .antMatchers("/myLoans").authenticated()
//                .antMatchers("/myBalance").authenticated()
//                .antMatchers("/myCards").authenticated()
//                .antMatchers("/user").authenticated()
//                .antMatchers("/notices").permitAll()
//                .antMatchers("/contact").permitAll()
//                .and()
//                .formLogin()
//                .and()
//                .httpBasic();
//        
        
        
        /* Disabling CSRF token */
        
        http.cors().configurationSource(new CorsConfigurationSource() {
            @Override
            public CorsConfiguration getCorsConfiguration(HttpServletRequest request) {
                CorsConfiguration config = new CorsConfiguration();
                config.setAllowedOrigins(Collections.singletonList("http://localhost:4200"));
                config.setAllowedMethods(Collections.singletonList("*"));
                config.setAllowedHeaders(Collections.singletonList("*"));
                config.setAllowCredentials(true);
                config.setMaxAge(3600L);
                return config;
            }
        }).and().csrf().ignoringAntMatchers("/contact").csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
                .and()
                .authorizeRequests().antMatchers("/myAccount").authenticated()
                .antMatchers("/myBalance").authenticated()
                .antMatchers("/user").authenticated()
                .antMatchers("/notices").permitAll()
                .antMatchers("/contact").permitAll()
                .and()
                .formLogin()
                .and()
                .httpBasic();

    }
    
    

    /*Configuring admin & user ( different users ) */
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication().withUser("admin").password("12345").authorities("admin").and()
//                .withUser("user").password("12345").authorities("read").and()
//                .passwordEncoder(NoOpPasswordEncoder.getInstance());
//}
    /* Configuring InMemoryUserDetails Manager */
//     @Override
//     protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        
//         InMemoryUserDetailsManager userDetailsService = new InMemoryUserDetailsManager();
//         UserDetails userDetails1 = User.withUsername("admin").password("12345").authorities("admin").build();
//         UserDetails userDetails2 = User.withUsername("user").password("12345").authorities("read").build();
//         userDetailsService.createUser(userDetails1);
//         userDetailsService.createUser(userDetails2);
//         auth.userDetailsService(userDetailsService);
//         
//     }
//     
//     @Bean
//     public PasswordEncoder passwordEncoder(){
//         return NoOpPasswordEncoder.getInstance();
//     }
    /*Configuring JDBCUserDetails Manager */
//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return NoOpPasswordEncoder.getInstance();
//    }
//    
//    @Bean
//    public UserDetailsService userDetailsService(DataSource dataSource){
//        return new JdbcUserDetailsManager(dataSource);
//    }
    /* Configuring customUserDetails Manager = > CustomerUserDetails Manager*/
    // Adding Repository to the spring Application class & Entity class
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return NoOpPasswordEncoder.getInstance();
//    }
    /*Using BCryptPasswordEncoder */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
