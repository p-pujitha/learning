package com.interviewbit.strings;

public class MinCharacterForStringPalandromic {

    public static void main(String[] args) {
//        String str = "AACECAAAA";
        String str = "ABC";
        System.out.println(getMinCharToAddedToMakeStringPalin(str));
    }
    static int getMinCharToAddedToMakeStringPalin(String str) {
        StringBuilder s = new StringBuilder();
        s.append(str);
        System.out.println(s);

        // Get concatenation of string, special character
        // and reverse string
        String rev = s.reverse().toString();
        s.reverse().append("$").append(rev);

        int lps[] = computeLPSArray(s.toString());
        return str.length() - lps[s.length() - 1];

    }

    private static int[] computeLPSArray(String string) {
        int n = string.length();
        int lps[] = new int[n];
        int i = 1, len = 0;
        lps[0] = 0;
        while (i < n) {
            if (string.charAt(i) == string.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }

        }
        return lps;
    }


}
