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
public class CricketCoach implements Coach {

    private String emailAddress;

    private String team;

    //create no-arg constructor
    CricketCoach() {
        System.out.println("CricketCoach : No arg constructor");
    }

    private FortuneService fortuneService;

    @Override
    public String getDailyWorkOut() {
        return " Practice fast bowling for 15 min a day";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    //Injecting setter methods
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach : Setter method");
        this.fortuneService = fortuneService;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach : Setter method for email Address");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach : Setter method for team name");
        this.team = team;
    }

}
