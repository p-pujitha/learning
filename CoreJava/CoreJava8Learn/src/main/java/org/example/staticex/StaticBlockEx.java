package org.example.staticex;

public class StaticBlockEx {
    public static void main(String[] args) {
        System.out.println("In Main Method");
    }
    static {
        System.out.println("called before main method");
    }
    static {
        System.out.println("Called before main method 2");
    }
}

