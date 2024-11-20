package org.example.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "Java Concept Of The Day";
       String strfinal = Arrays.stream(str.split(" ")).map(word -> new StringBuffer(word).reverse())
               .collect(Collectors.collectingAndThen(Collectors.toList() , list -> {
                   Collections.reverse(list);
                   return list.stream();
               })).collect(Collectors.joining(" "));
       System.out.println(strfinal);
    }
}
