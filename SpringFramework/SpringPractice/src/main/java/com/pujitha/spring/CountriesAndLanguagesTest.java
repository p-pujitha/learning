package com.pujitha.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CountriesAndLanguagesTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("propertiesconfig.xml");
        CountriesAndLanguages cAL = (CountriesAndLanguages) context.getBean("countriesAndLang");
        System.out.println(cAL);
    }

}
