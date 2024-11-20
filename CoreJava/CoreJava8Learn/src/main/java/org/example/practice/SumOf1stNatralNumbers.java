package org.example.practice;

import java.util.stream.IntStream;

public class SumOf1stNatralNumbers {
    public static void main(String[] args) {
       int sum =  IntStream.range(1,11).sum();
       System.out.println(sum);
    }
}
