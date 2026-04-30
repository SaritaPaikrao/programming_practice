package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Sample6 {
    public static void main(String[] args) {
    String str = "jjava";
    Map<String, Long> charCount = new HashMap<>();
        charCount = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(charCount);
        List<Integer> intList  = Arrays.asList(1,2,3,4,5,6);

        int sum = intList.stream().filter(i -> i%2==0 ).collect(Collectors.summingInt(Integer::valueOf));
        System.out.println(sum);

    }
}
