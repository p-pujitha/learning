package com.interviewbit.strings;

import java.util.HashMap;
import java.util.Map;

public class FrequencyMap {
    public static void main(String[] args) {
        String frequency = solve("qzsehzskwvw");
        System.out.println(frequency);
    }

    public static String solve(String A) {
        Map<Character,Integer> frequencyMap = new HashMap<>();
        for(int i=0; i<A.length(); i++){
            char ch = A.charAt(i);
            if(frequencyMap.get(ch)!=null){
                int val = frequencyMap.get(ch);
                frequencyMap.put(ch,val+1);
            }
            else{
                frequencyMap.put(ch,1);
            }
        }
        String returnString = "";
        for(int i=0; i<A.length(); i++){
            if(frequencyMap.get(A.charAt(i)) !=0){
                returnString+=A.charAt(i);
                returnString+=frequencyMap.get(A.charAt(i));
                frequencyMap.put(A.charAt(i),0);
            }
        }
        return returnString;
    }
}
