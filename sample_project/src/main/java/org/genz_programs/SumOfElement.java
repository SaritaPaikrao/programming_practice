package org.genz_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        int sum1 = list.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println(sum1);

    }
}
