package com.interviewbit.strings;

import java.util.ArrayList;

public class StringToValidIps {
    public static void main(String[] args) {
        String givenString = "25525511135";
        ArrayList<String> ips = giveIps(givenString);
        System.out.println(ips);
    }

    private static ArrayList<String> giveIps(String givenString) {
        ArrayList<String> ans = new ArrayList<>();
        int n = givenString.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    String validString = generateValidIp(givenString, n, i, j, k);
                    if (!validString.isEmpty()) {
                        ans.add(validString);
                    }
                }
            }
        }
        return ans;

    }

    private static String generateValidIp(String str, int n, int i, int j, int k) {
        String str1 = str.substring(0, i + 1);
        String str2 = str.substring(i + 1, j + 1);
        String str3 = str.substring(j + 1, k + 1);
        String str4 = str.substring(k + 1);
        if (checkIsValid(str1) && checkIsValid(str2) && checkIsValid(str3) && checkIsValid(str4)) {
            return str1 + "." + str2 + "." + str3 + "." + str4;
        } else return "";
    }

    private static boolean checkIsValid(String str) {
        if (str.length() < 1 || str.length() > 3) return false;
        if (str.charAt(0) == '0' && str.length() > 1) return false;
        int value = Integer.valueOf(str);
        if (value < 0 || value > 255) return false;
        return true;
    }
}
