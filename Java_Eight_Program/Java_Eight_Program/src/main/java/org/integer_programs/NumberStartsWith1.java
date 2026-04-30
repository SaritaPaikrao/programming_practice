package org.integer_programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartsWith1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 21, 13, 41, 15, 1, 100, 23);
        List<Integer> startsWithOne = numbers.stream().filter(num -> String.valueOf(num).startsWith("1"))
                .collect(Collectors.toList());
        System.out.println(startsWithOne);
    }
}
