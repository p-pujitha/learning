package com.interviewbit.strings;

public class StringPermutation {
    public static void main(String[] args) {
        String str1="scaler";
        String str2="relasc";
       System.out.println( permuteStrings(str1,str2));
    }

    public static int permuteStrings(String A, String B) {
        int count[] = new int[256];
        if(A.length()!=B.length()){
            return 0;
        }else{
            for(int i=0; i<A.length() && i<B.length();i++){
                count[A.charAt(i)]++;
                count[B.charAt(i)]--;
            }
        }
        for(int i=0; i< count.length;i++){
            if(count[i]!=0){
                return 0;
            }
        }
         return 1;
    }
}
