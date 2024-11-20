package com.interviewbit.strings;

public class Multiply2Strings {
    public static void main(String[] args) {
        String num1 ="5";
        String num2 = "7";
        int[] n1 = new int[num1.length()];
        int[] n2 = new int[num2.length()];
        int[] result = new int[n1.length+n2.length];

        for(int i=0; i<num1.length();i++){
            n1[i]= num1.charAt(num1.length()-1-i)-'0';
        }
        for(int j=0; j<num2.length();j++){
            n2[j]= num2.charAt(num2.length()-1-j)-'0';
        }

        for(int i=0; i<n2.length;i++){
            int carry=0;
            for(int j=0;j<n1.length;j++){
                int multiply = n1[j]*n2[i]+carry+result[i+j];
                carry= multiply/10;
                result[i+j]=multiply%10;
            }
            result[i+n1.length] =carry;
        }

        StringBuilder s1 = new StringBuilder();
        int i=result.length-1;
        while (i > 0 && result[i] == 0) {
            i--;
        }

        while (i >= 0) {
            s1.append(result[i]);
            i--;
        }
        System.out.println(s1.toString());
    }
}
