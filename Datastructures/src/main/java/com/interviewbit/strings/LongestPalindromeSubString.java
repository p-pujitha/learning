package com.interviewbit.strings;

public class LongestPalindromeSubString {
    public static void main(String[] args) {
        String str = "aaaabaaa";
        String longestlength = longestPalindromeLength(str);
        System.out.println(longestlength);
    }

    private static String longestPalindromeLength(String str) {
        int n = str.length();
        int start = 0, end = 1;
        int low, hi;

        // Traverse the input string
        for (int i = 0; i < n; i++) {

            // Find longest palindromic substring of even size
            low = i - 1;
            hi = i;

            // Expand substring while it is palindrome and in bounds
            while (low >= 0 && hi < n && str.charAt(low) == str.charAt(hi)) {

                // Update maximum length and starting index
                if (hi - low + 1 > end) {
                    start = low;
                    end = hi - low + 1;
                }
                low--;
                hi++;
            }

            // Find longest palindromic substring of odd size
            low = i - 1;
            hi = i + 1;

            // Expand substring while it is palindrome and in bounds
            while (low >= 0 && hi < n && str.charAt(low) ==str.charAt(hi)) {

                // Update maximum length and starting index
                if (hi - low + 1 > end) {
                    start = low;
                    end = hi - low + 1;
                }
                low--;
                hi++;
            }
        }

        return str.substring(start,start+end);
    }
}
