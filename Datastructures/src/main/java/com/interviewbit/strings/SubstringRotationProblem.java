package com.interviewbit.strings;

public class SubstringRotationProblem {
    public static void main(String[] args) {
        String str = "abaa";
        String rotated1time = rotate1time(str);
        System.out.println(rotated1time);
    }

    private static String rotate1time(String str) {

        String rotated = str;
        for(int i=1; rotated!=str;i++){
             rotated = rotated.substring(i,rotated.length())+ rotated.substring(0,i);
            System.out.println(rotated);
        }
        return null;
    }
}
