/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pujitha.springAnnotations;

/**
 *
 * @author ppujita5
 */
public class SadInterfaceServiceImpl implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is the Sad Day!!";
    }

}