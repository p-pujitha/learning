package com.interviewbit.strings;

import java.util.ArrayList;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("geeksforgeeks");
        al.add("geeks");
        al.add("geek");
        al.add("geezer");

        longestCommonPrefix(al);
    }

    public static String longestCommonPrefix(ArrayList<String> A) {
        int length= A.size();
        String result = A.get(0);
        if(length ==1 )return result;
        for(int i=1; i<length;i++){
            while(A.get(i).indexOf(result) !=0){
                result = result.substring(0,result.length()-1);
                if(result.isEmpty()) return "";
            }
        }
        return result;

    }
}
