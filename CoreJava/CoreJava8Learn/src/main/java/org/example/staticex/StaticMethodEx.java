package org.example.staticex;

public class StaticMethodEx {
    public static void main(String[] args) {
//        StaticMethodEx.method1();
        System.out.println("Inside main method");
    }

    static void method1() {
        System.out.println("Static method 1");
    }
    static {
        StaticMethodEx.method1();
    }
}
