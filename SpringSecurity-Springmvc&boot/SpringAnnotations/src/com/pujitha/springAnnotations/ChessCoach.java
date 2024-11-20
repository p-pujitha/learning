/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pujitha.springAnnotations;

import org.springframework.beans.factory.annotation.Value;

/**
 *
 * @author ppujita5
 */
public class ChessCoach implements Coach {

    private FortuneService fortuneService;

    @Value("${sport.email}")
    private String email;

    @Value("${sport.team}")
    private String team;

    public ChessCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice chess daily";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

}
