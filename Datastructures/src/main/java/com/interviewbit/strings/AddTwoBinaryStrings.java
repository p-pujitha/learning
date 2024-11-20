package com.interviewbit.strings;

public class AddTwoBinaryStrings {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        String A = "110";
        String B = "10";
        int i = A.length()-1;
        int j = B.length()-1;
        int sum, carry =0;
        while(i>=0 ||j>=0){
            sum=carry;
            if(i>=0){
                sum+=A.charAt(i)-'0';
            }
            if(j>=0){
                sum+=B.charAt(j) -'0';
            }
            if(sum==0 || sum==1){
                result.append(sum);
                carry=0;
            }else if(sum==2){
                result.append('0');
                carry=1;
            }else{
                result.append('1');
                carry=1;
            }
            i--;
            j--;
        }
        if(carry == 1){
            result.append('1');
        }
        System.out.println(result.reverse().toString());
    }
}
