package org.example.practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequenceyDescendingSort {
    public static void main(String[] args) {
        String inputString2 = "Java Concept Of The Day";

        Map<Character, Long> frequencyCountMap2 = inputString2.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Sorting the map based on values in descending order
        Map<Character, Long> sortedByValue = frequencyCountMap2.entrySet()
                .stream()
                .sorted(Map.Entry.<Character, Long>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

        // Printing the sorted map
        sortedByValue.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
