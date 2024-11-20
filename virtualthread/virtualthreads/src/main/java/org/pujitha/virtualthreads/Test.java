package org.pujitha.virtualthreads;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String s = "HereWeGo";
        // HereWeGo
        List<String> strings = getSubString(s);
        for(String sub:strings){
            System.out.println(sub);
        }
    }

    private static List<String> getSubString(String s) {
        List<String> output = new ArrayList<>();
        int length= s.length();
        for(int i=0; i< length; i++){
            for(int j=i+1; j<=length;j++){
                output.add(s.substring(i,j));
            }
        }
        return output;
    }
}
