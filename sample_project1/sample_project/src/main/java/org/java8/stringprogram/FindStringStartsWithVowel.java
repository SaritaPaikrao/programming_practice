package org.java8.stringprogram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindStringStartsWithVowel {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("Sarita", "Uma", "Vinay", "Apple");

        List<String > list = strList.stream().filter(str -> str.matches("(?i)^[aeiou].*")).collect(Collectors.toList());
        System.out.println(list);
    }
}
