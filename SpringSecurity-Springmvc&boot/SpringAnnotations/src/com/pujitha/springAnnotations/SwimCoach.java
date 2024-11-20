/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pujitha.springAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author ppujita5
 */
@Component
public class SwimCoach implements Coach {

    @Autowired
    @Qualifier("fortuneServiceImpl2")
    private FortuneService fortuneService;

    @Value("${sport.email}")
    private String email;

    @Value("${sport.team}")
    private String team;

    @Override
    public String getDailyWorkout() {
        return "Do swimming regularly";
    }

    @Override
    public String getDailyFortune() {
        return "In SwimCoach :" + fortuneService.getFortune();
    }

    public void getPropertyValues() {
        System.out.println("EMAIL :" + getEmail() + "TEAM :" + getTeam());
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

}
