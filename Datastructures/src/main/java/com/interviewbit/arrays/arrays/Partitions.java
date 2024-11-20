package com.interviewbit.arrays.arrays;

import java.util.ArrayList;

public class Partitions {
    public static void main(String[] args) {
        int n = 5;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(0);
        arr.add(3);
        int ans = solve(n, arr);
        System.out.println(ans);

    }

    public static int solve(int A, ArrayList<Integer> B) {
        int sum = 0;
        for (int i = 0; i < A; i++) {
            sum += B.get(i);
        }
        if (sum % 3 != 0) return 0;
        sum = sum / 3;
        ArrayList<Integer> prefix = new ArrayList<Integer>();
        ArrayList<Integer> suffix = new ArrayList<Integer>();
        int x = 0;
        for (int i = 0; i < A; i++) {
            x += B.get(i);
            if (x == sum) prefix.add(i);
        }
        x = 0;
        for (int i = A - 1; i > 0; i--) {
            x += B.get(i);
            if (x == sum) suffix.add(i);
        }
        int count = 0;
        for (int i = 0; i < prefix.size(); i++) {
            for (int j = 0; j < suffix.size(); j++) {
                x = 0;
                int n = 0;
                for (int k = prefix.get(i) + 1; k < suffix.get(j); k++) {
                    x += B.get(k);
                    n = 1;
                }
                if (x == sum && n == 1) count++;
            }
        }
        return count;

    }
}
