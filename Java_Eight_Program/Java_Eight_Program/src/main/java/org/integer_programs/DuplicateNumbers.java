package org.integer_programs;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateNumbers {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        //returns only duplicate elements
        Set<Integer> duplicates = new HashSet<>();
        System.out.println("Duplicate elements =>");
        myList.stream().filter(n -> !duplicates.add(n)).forEach(System.out::println);

//**********************************************************

        //other way to get only duplicates from list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 3, 5, 6, 1);

        Set<Integer> duplicatess = numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
        System.out.println(duplicatess);

//**********************************************************

        //gives all unique elements remove duplicates
        System.out.println("Unique elements =>");
        myList.stream().distinct().forEach(System.out::println);

    }
}
