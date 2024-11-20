package org.pujitha.learning.programs;

public class Fibonacci {
    public static void main(String[] args) {

    }

    public int calculate(int n){
        if(n==0) return 0;
        if(n==1) return 1;

        int cal1 = calculate(n-1);
        int cal2 = calculate(n-2);

        int res = cal1 + cal2;
        return res;
    }
}
