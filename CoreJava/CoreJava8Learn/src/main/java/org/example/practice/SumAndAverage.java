package org.example.practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SumAndAverage {
    public static void main(String[] args) {
        int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
        int sum = Arrays.stream(a).sum();
        double avg = Arrays.stream(a).average().getAsDouble();
        System.out.println(sum + " " + avg);
    }
}
