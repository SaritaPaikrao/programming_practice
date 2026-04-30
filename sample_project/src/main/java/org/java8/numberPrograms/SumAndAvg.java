package org.java8.numberPrograms;

import java.util.Arrays;
import java.util.List;

public class SumAndAvg {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(1, 2, 3, 4, 5);
       // int[] intAry = listOfIntegers.stream().mapToInt(Integer::intValue).toArray();
        int sum = Arrays.stream(listOfIntegers.stream().mapToInt(Integer::intValue).toArray()).sum();
        System.out.println(sum);
        double avg = Arrays.stream(listOfIntegers.stream().mapToInt(Integer::intValue).toArray()).average().getAsDouble();
        System.out.println(avg);
    }
}
