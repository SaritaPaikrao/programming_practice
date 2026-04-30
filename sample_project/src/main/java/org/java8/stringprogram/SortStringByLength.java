package org.java8.stringprogram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStringByLength {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("Sarita", "Riva", "Vikas", "Aditi", "Sakshi");
        strList.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
    }
}
