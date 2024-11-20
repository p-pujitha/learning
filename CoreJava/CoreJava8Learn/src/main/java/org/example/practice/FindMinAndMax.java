package org.example.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMinAndMax {
    public static void main(String args[]){
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        int maxNum = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
        int minNu = listOfIntegers.stream().min(Comparator.naturalOrder()).get();
        System.out.println(maxNum + " " +minNu);
    }
}
