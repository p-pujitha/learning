/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pujitha.springAnnotations;

import org.springframework.stereotype.Component;

/**
 *
 * @author ppujita5
 */
@Component
public class FortuneServiceImpl implements FortuneService{

    @Override
    public String getFortune() {
        return "Today is your lucky day!!";
    }
    
}
