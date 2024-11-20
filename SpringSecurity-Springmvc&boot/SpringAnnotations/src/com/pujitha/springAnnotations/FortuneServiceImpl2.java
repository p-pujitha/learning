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
public class FortuneServiceImpl2 implements FortuneService{

    @Override
    public String getFortune() {
        return "FortuneServiceImpl2 - It's Your lucky day!!";
    }
    
}
