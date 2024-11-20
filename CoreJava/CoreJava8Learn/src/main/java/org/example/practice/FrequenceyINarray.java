package org.example.practice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequenceyINarray {
    public static void main(String[] args) {
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");

        // Collecting the counts while maintaining the order
        Map<String, Long> counts = stationeryList.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new, // Use LinkedHashMap to maintain order
                        Collectors.counting()
                ));

        // Sorting the map by key
        Map<String, Long> countsSortByKey = counts.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new // Use LinkedHashMap to maintain order
                ));

        // Printing the counts
        System.out.println("Original counts (maintaining insertion order): " + counts);
        System.out.println("Counts sorted by key: " + countsSortByKey);
    }
}
