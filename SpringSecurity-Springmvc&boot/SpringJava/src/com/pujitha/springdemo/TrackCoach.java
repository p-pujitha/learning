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
public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    TrackCoach(FortuneService fs) {
        fortuneService = fs;
    }

    TrackCoach() {

    }

    @Override
    public String getDailyWorkOut() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "In Track Coach :" + fortuneService.getFortune();
    }

    //add an init method
    public void init() {
        System.out.println("Inside Track Coach : INIT method");
    }

    //add an destroy method
    public void deinit() {
        System.out.println("Inside Track Coach : DEINIT method");
    }
}
