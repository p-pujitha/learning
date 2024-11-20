package com.interviewbit.strings;

public class AtoIImplentation {
    public static void main(String[] args) {
        String str = "9 2704";
        String str1 = "-123";
        int val = atoi(str);
        int val1 =atoi(str1);
        System.out.println(val+ " "+val1);
    }

    private static int atoi(String A) {
        char[] str = A.toCharArray();
        int i = 0, base = 0, sign = 1;
        while (str[i] == ' ') {
            i++;
        }
        if (str[i] == '-' || str[i] == '+') {
            sign = 1 - 2 * (str[i++] == '-' ? 1 : 0);
        }
        while(i<str.length && str[i]>='0' && str[i]<='9'){
            if (base > Integer.MAX_VALUE / 10  || (base == Integer.MAX_VALUE / 10 && str[i] - '0' > 7)){
                if (sign == 1)
                    return Integer.MAX_VALUE;
                else
                    return Integer.MIN_VALUE;
            }
            base= base*10+(str[i++]-'0');
        }
        return base*sign;
    }
}
