package org.java8.numberPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxAndMinNumber {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(12,34,54,23,54,34,1,23);
        int max = intList.stream().max(Comparator.naturalOrder()).get();
        System.out.println(max);
        int min = intList.stream().min(Comparator.naturalOrder()).get();
        System.out.println(min);
    }
}
