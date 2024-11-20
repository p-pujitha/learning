package com.interviewbit.strings;

public class BalParanthesis {
    public static void main(String[] args) {
        String str = "((";
        int ot =  balparanthesis(str);
        System.out.println(ot);
    }

    private static int balparanthesis(String str) {
        int ans=0;
        int bal=0;
        for(int i=0; i<str.length();i++){
            bal+=str.charAt(i) =='('?1:-1;
            if(bal==-1){
                ans++;
                bal++;
            }
        }
        return ans+bal;
    }

}
