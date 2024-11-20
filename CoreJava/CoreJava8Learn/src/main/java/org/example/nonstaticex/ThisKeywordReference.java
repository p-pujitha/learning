package org.example.nonstaticex;

public class ThisKeywordReference {

    int x;
    ThisKeywordReference(){
        System.out.println(this);
    }

    public static void main(String[] args) {
        new ThisKeywordReference();
        new ThisKeywordReference();
    }
}
