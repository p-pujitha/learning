package org.example.practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacter {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day";
Map<Character,Long> counts  = inputString.chars().mapToObj(c->(char)c).sorted().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
Map<Character,Long> counts2 = counts.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(o1,o2)->o1,LinkedHashMap::new));

System.out.println(counts);
System.out.println(counts2);
    }
}