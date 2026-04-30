package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Sample1 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(11, 12, 21, 32, 11);
        Set<Integer> unique = new HashSet<>();

        Set<Integer> duplicate = list.stream().
                filter(e -> !unique.add(e)).collect(Collectors.toSet());

        System.out.println(duplicate);

        String input = "0001234500";

        String outputS = input.chars().dropWhile(e-> e=='0').map();
        System.out.println(outputS);

    }
}
