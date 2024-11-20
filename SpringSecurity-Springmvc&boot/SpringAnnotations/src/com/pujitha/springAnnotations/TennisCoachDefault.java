/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pujitha.springAnnotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author ppujita5
 */
@Component
//@Scope("prototype")
public class TennisCoachDefault implements Coach {

    private FortuneService fortuneService;

    //Constructor Injection
//    @Autowired
//    TennisCoachDefault(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    public TennisCoachDefault() {
        System.out.println(">>> Default Constructor - TennisCoachDefault");
    }
    
    

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley - Default";
    }

    @Override
    public String getDailyFortune() {
        return "Default - " + fortuneService.getFortune();
    }

    //Setter Injections
//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        System.out.println("Inside setFortuneService setter method - TennisCoachDefault");
//        this.fortuneService = fortuneService;
//    }
//    
    
    @Autowired
    @Qualifier("fortuneServiceImpl")
    public void doSomeCrazyStuff(FortuneService fortuneService) {
        System.out.println("Inside doSomeCrazyStuff method - TennisCoachDefault");
        this.fortuneService = fortuneService;
    }
    
    @PostConstruct 
    public void init() {
        System.out.println("Inside TennisDefualt  Coach : INIT method");
    }

    //add an destroy method
    @PreDestroy
    public void deinit() {
        System.out.println("Inside TennisDefault Coach : DEINIT method");
    }
    
    
}
