package com.interviewbit.strings;

import java.util.HashMap;
import java.util.Map;

public class LookAndSaySequence {
    // generator function returns int string from prev int
    // string e.g. -> it will return '1211' for '21' ( One 2's
    // and One 1)
    static String generator(String str)
    {
       String ans="";
       Map<Character,Integer> countMap = new HashMap<>();
       for(int i=0; i<str.length() +1; i++){
           if(i==str.length() || countMap.containsKey(str.charAt(i))== false && i>0){
               ans+=String.valueOf(countMap.get(str.charAt(i-1))    )+str.charAt(i-1);
               countMap.clear();
           }
           if(i==str.length()){
               countMap.put(null,1);
           }else{
               if(countMap.containsKey(str.charAt(i))){
                   countMap.put(str.charAt(i),countMap.get(str.charAt(i))+1);
               }else
               if(i != str.length()) countMap.put(str.charAt(i),1);
           }
       }
       return ans;
     }

    static String countnndSay(int n)
    {
        String res = "1"; // res variable keep tracks of string
        // from 1 to n-1

        // For loop iterates for n-1 time and generate strings
        // in sequence "1" -> "11" -> "21" -> "1211"
        for (int i = 1; i < n; i++) {
            res = generator(res);
        }

        return res;
    }

    // Driver Code
    public static void main(String args[])
    {
        int N = 4;
        System.out.println(countnndSay(N));
    }
}
