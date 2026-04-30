package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sample2 {
    public static void main(String[] args) {
        String lang = "java";
        System.out.println(lang.hashCode());
        lang = "python";
        List<Integer> intv = Arrays.asList(1,2,3,4,5);
        int intsum = intv.stream().collect(Collectors.summingInt(Integer::valueOf));
        System.out.println(intsum);
        Double aDouble;

        System.out.println(lang.hashCode());
        int i =12345;
        int sum =  Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(sum);
    }
}
