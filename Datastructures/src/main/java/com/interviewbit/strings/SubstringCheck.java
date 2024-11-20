package com.interviewbit.strings;

public class SubstringCheck {
    public static void main(String[] args) {
        String s1 = "strstr";
        String s2 = "str";

        int res = isSubstring(s1, s2);

        if (res == -1)
            System.out.println("Not present");
        else
            System.out.println("Present at index " + res);
    }

    static int isSubstring(String s1, String s2) {
        int M = s2.length();
        int N = s1.length();
        if (M == 0) {
            return 0;
        }

        // A loop to slide s2 one by one over s1
        for (int i = 0; i <= N - M; i++) {
            int j;

            // For current index i, check for pattern match
            for (j = 0; j < M; j++) {
                if (s1.charAt(i + j) != s2.charAt(j)) {
                    break;
                }
            }

            // If s2 is found, return the starting index
            if (j == M) {
                return i;
            }
        }

        // If s2 is not found in s1, return -1
        return -1;

    }
}

