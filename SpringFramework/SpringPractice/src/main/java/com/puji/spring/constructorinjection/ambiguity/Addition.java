package com.puji.spring.constructorinjection.ambiguity;

public class Addition {

    Addition(double a, double b) {
        System.out.println("Inside constructor double");
    }
    Addition(int a, int b) {
        System.out.println("Inside constructor int");
    }

    Addition(String a, String b) {
        System.out.println("Inside constructor String");
    }

    Addition(int a, double b) {
        System.out.println("Inside constructor int and double");
        System.out.println(a);
        System.out.println(b);
    }

}
