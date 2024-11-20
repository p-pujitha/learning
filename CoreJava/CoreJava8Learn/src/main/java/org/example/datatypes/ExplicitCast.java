package org.example.datatypes;

public class ExplicitCast {
    public static void main(String[] args) {
        //higher to lower;
        int i=100;
        byte b = (byte)i;
        System.out.println(b);
        char ch = (char)i;
        System.out.println(ch);
        int j = 130;
        byte b1= (byte)j;
        System.out.println(b1);
    }
}
