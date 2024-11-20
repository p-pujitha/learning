package org.example.datatypes;

public class ImplicitCast {
    public static void main(String[] args) {
        //lower to higher;
        byte b = 100;
        int c ;
        c = b;
        long l = b;
        System.out.println(c);
        System.out.println(l);

        char ch = 'A';
        int charInt = ch;
        System.out.println(charInt);
    }


}
