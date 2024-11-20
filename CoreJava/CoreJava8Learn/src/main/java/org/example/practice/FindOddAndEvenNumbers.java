package org.example.practice;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FindOddAndEvenNumbers {
    public static void main(String[] args) {
        //find odd & even numbers
        List<Integer> integers = Arrays.asList(10,32,41,62,79);
        Map<Boolean, List<Integer>> evendOddMap = integers.stream().collect(Collectors.partitioningBy(i->i%2==0));
        Set<Map.Entry<Boolean,List<Integer>>> sets = evendOddMap.entrySet();
        for(Map.Entry<Boolean,List<Integer>> entry : sets){
            System.out.println(entry.getKey()?"Even Numbers" : "Odd Numbers");
            System.out.println(entry.getValue().toString());
        }
    }
}
