package com.interviewbit.strings;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "abecbea";
        int idx = solve(str);
        System.out.println(idx);
    }

    public static int solve(String str) {
        int low = 0, high = str.length() - 1;

        while (low < high) {
            if (str.charAt(low) == str.charAt(high)) {
                low++;
                high--;
            } else {
                if (isPalindrome(str, low + 1, high) || isPalindrome(str, low, high - 1)) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
        // If we reach here, it means the string was already a palindrome
        // and removing one character will never make it a non-palindrome.
        return 1;
    }

    public static boolean isPalindrome(String str, int low, int high) {
        while (low < high) {
            if (str.charAt(low) != str.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}

