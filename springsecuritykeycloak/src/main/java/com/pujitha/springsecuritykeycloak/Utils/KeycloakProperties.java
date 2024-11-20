/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pujitha.springsecuritykeycloak.Utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 *
 * @author ppujita5
 */
@Component
@ConfigurationProperties(prefix="keycloakprop")
public class KeycloakProperties {
//     @Value("${keycloakprop.realm}")
    private String realm;
     
//     @Value("${keycloakprop.authServerUrl}")
    private String authServerUrl;
     
//     @Value("${keycloakprop.sslRequired}")
    private String sslRequired;
     
//     @Value("${keycloakprop.resource}")
    private String resource;
     
//     @Value("${keycloakprop.credentialSecret}")
    private String credentialSecret;
     
//     @Value("${keycloakprop.bearerOnly}")
    private String bearerOnly;
    
    
    public String getRealm() {
        return realm;
    }

    public void setRealm(String realm) {
        this.realm = realm;
    }

    public String getAuthServerUrl() {
        return authServerUrl;
    }

    public void setAuthServerUrl(String authServerUrl) {
        this.authServerUrl = authServerUrl;
    }

    public String getSslRequired() {
        return sslRequired;
    }

    public void setSslRequired(String sslRequired) {
        this.sslRequired = sslRequired;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getCredentialSecret() {
        return credentialSecret;
    }

    public void setCredentialSecret(String credentialSecret) {
        this.credentialSecret = credentialSecret;
    }

    public String getBearerOnly() {
        return bearerOnly;
    }

    public void setBearerOnly(String bearerOnly) {
        this.bearerOnly = bearerOnly;
    }
    
    
    
    
}
