/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sprinbootspringsecurity.springsecurityauthtoken.controller;

import com.sprinbootspringsecurity.springsecurityauthtoken.model.JWTRequest;
import com.sprinbootspringsecurity.springsecurityauthtoken.model.JWTResponse;
import com.sprinbootspringsecurity.springsecurityauthtoken.service.UserService;
import com.sprinbootspringsecurity.springsecurityauthtoken.utitlity.JWTUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ppujita5
 */
@RestController
public class AuthenticateController {

    @Autowired
    private JWTUtility jWTUtility;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserService userService;

    @PostMapping("/jwtauthenticate")
    public JWTResponse JWTauthenticate(@RequestBody JWTRequest jWTRequest) {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(jWTRequest.getUsername(), jWTRequest.getPassword()));

        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        UserDetails userDetails = userService.loadUserByUsername(jWTRequest.getUsername()); 
        String token = jWTUtility.generateToken(userDetails);
        return new JWTResponse(token);
    }
}
