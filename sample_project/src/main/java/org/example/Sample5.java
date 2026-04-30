package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sample5 {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("ABCD","kjl","pouye");

        strList.stream().map(String::length).forEach(System.out::println);
        List<Integer> intList = Arrays.asList(1,2,3,4,5,3,2);
        int sum = intList.stream().collect(Collectors.summingInt(Integer::valueOf));
        System.out.println(sum);
        Set<Integer> unique = new HashSet<>();

        System.out.println(intList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
        String str2 = "jjava";
        LinkedHashMap<String, Long> mp = (LinkedHashMap<String, Long>) Stream.of(str2.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
        System.out.println("result = "+mp);
        String repeated = mp.entrySet().stream().filter(e->e.getValue()>1).map(e->e.getKey()).findFirst().get();
        System.out.println(repeated);
        String firstRepeated = mp.entrySet().stream().filter(e->e.getValue()>1).map(e->e.getKey()).findFirst().get();
        System.out.println(firstRepeated);
    }
}
