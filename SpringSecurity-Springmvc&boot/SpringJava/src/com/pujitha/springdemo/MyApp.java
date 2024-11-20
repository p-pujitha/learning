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
public class MyApp {

    public static void main(String[] args) {

        Coach baseBallCoach = new BaseBallCoach();
        System.out.println(baseBallCoach.getDailyWorkOut());

        Coach trackCoach = new TrackCoach();
        System.out.println(trackCoach.getDailyWorkOut());
    }
}
