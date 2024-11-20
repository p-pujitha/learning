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
public class TennisCoachFieldInject implements Coach {
    
    @Autowired
    @Qualifier("fortuneServiceImpl3")
    private FortuneService fortuneService;

    public TennisCoachFieldInject() {
        System.out.println("Inside TennisCoachFieldInject constructor");
    }

    
    
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley - TennisCoachFieldInject";
    }

    @Override
    public String getDailyFortune() {
        return "TennisCoachFieldInject - " + fortuneService.getFortune();
    }

}
