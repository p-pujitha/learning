/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pujitha.springAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author ppujita5
 */
@Component
public class TennisCoachQualifier implements Coach{
    
    @Autowired
    @Qualifier("fortuneServiceImpl3")
    FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley - TennisCoachQualifier";
    }

    @Override
    public String getDailyFortune() {
        return "TennisCoachQualifier - " + fortuneService.getFortune();
    }
    
}
