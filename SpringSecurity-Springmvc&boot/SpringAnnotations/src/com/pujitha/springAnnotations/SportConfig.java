/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pujitha.springAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 *
 * @author ppujita5
 */
@Configuration
@ComponentScan("com.pujitha.springAnnotations")
@PropertySource("classpath:sport.properties")
public class SportConfig {
    
   

    @Bean
    public FortuneService sadInterfaceServiceImpl() {
        return new SadInterfaceServiceImpl();
    }

    @Bean
    public Coach chessCoach() {
        return new ChessCoach(sadInterfaceServiceImpl());
    }

    
    
    
}

