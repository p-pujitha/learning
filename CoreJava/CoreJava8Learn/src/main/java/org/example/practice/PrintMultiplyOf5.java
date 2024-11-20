package org.example.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintMultiplyOf5 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(10,45,21);
        List<Integer> multiply5 = integers.stream().filter(i->i%5==0).collect(Collectors.toList());
        System.out.println(multiply5);
    }
}
