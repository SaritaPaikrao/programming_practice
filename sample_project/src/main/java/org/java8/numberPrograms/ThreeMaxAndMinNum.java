package org.java8.numberPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ThreeMaxAndMinNum {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(12,34,56,32,56,76,2,3,5,6,7,8,9);
        List<Integer> min = intList.stream().sorted().limit(3).toList();
        System.out.println(min);
        List<Integer> max = intList.stream().sorted(Comparator.reverseOrder()).distinct().limit(3).toList();
        System.out.println(max);
    }
}
