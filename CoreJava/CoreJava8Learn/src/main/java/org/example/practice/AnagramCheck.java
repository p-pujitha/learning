package org.example.practice;

import java.util.stream.Collectors;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "RaceCar";
        String s2 = "CarRace";
           String s3 =  s1.toUpperCase().chars().sorted().mapToObj(c->String.valueOf((char) c)).collect(Collectors.joining());
           String s4= s2.toUpperCase().chars().sorted().mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());
           if(s3.equals(s4)) System.out.println("anagram");
        }
}
