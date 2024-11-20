/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pujitha.springdemo;

/**
 *
 * @author ppujita5
 */
public class BaseBallCoach implements Coach {

    //define private field for dependency
    private FortuneService fortuneService;

    //define constructor for dependency injection 
    public BaseBallCoach(FortuneService fs) {
        fortuneService = fs;
    }

    public BaseBallCoach() {
    }

    @Override
    public String getDailyWorkOut() {
        return "Spend 30 min on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
