package com.interviewbit.strings;

public class TwoConsecutiveRemove {
    public static void main(String[] args) {
        String returnString = solve("aabbccd",2);
        System.out.println(returnString);
        String returnString2 = solve("aabcd",2);
        System.out.println(returnString2);
    }

    public static String solve(String A, int B) {
        String returnString = "";
        int i=0,j=1;
        int count=1;
        while(j<A.length()){
            if(A.charAt(i) == A.charAt(j)){
                count++;
            }else{
                if(A.charAt(i)!=A.charAt(j)){
//                    System.out.println(i + " "+ j);
                    if(count!=B){
                        returnString+=A.substring(i,j);
                    }
//                    if(j==(A.length()-1)) {
//                        returnString+=A.charAt(j);
//                    }
//                    System.out.println(returnString);
                    count=1;
                }
                i=j;
            }
            j++;
        }
        if (count != B) {
            returnString += A.substring(i, j);
        }
        // System.out.println("returnstring :"+ returnString);
        return returnString;
    }
}
