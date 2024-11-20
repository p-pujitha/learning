/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pujitha.springsecuritykeycloak.config;

import com.pujitha.springsecuritykeycloak.Utils.KeycloakProperties;
import org.keycloak.adapters.KeycloakConfigResolver;
import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.keycloak.adapters.springsecurity.config.KeycloakWebSecurityConfigurerAdapter;
import org.keycloak.representations.adapters.config.AdapterConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.web.authentication.session.RegisterSessionAuthenticationStrategy;
import org.springframework.security.web.authentication.session.SessionAuthenticationStrategy;

/**
 *
 * @author ppujita5
 */
@Configuration
@EnableConfigurationProperties({KeycloakProperties.class})
public class SecurityConfig extends KeycloakWebSecurityConfigurerAdapter {


    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(keycloakAuthenticationProvider());
    }

    @Autowired
    public SecurityConfig(KeycloakProperties keycloakProperties, AdapterConfig config) throws Exception {
        if (keycloakProperties != null) {
            System.out.println("------ Setting Keycloak Properties ------");
            config.setRealm(keycloakProperties.getRealm());
            config.setAuthServerUrl(keycloakProperties.getAuthServerUrl());
            config.setBearerOnly(Boolean.parseBoolean(keycloakProperties.getBearerOnly()));
//            config.setSslRequired(ConfigUtil.getProperty("keycloakprop.sslRequired"));
            config.setResource(keycloakProperties.getResource());
            
            System.out.println("----- AdapterConfig----- : " + config.toString());
        }

    }

    @Bean
    @Override
    protected SessionAuthenticationStrategy sessionAuthenticationStrategy() {
        return new RegisterSessionAuthenticationStrategy(new SessionRegistryImpl());
    }
   

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        super.configure(http);
        http
                .authorizeRequests()
                .anyRequest().authenticated();
    }
}
