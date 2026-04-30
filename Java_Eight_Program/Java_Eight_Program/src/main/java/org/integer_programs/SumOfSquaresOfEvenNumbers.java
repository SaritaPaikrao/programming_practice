package org.integer_programs;

import java.util.Arrays;
import java.util.List;

public class SumOfSquaresOfEvenNumbers {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        int sum = numbers.stream().filter(e -> e%2==0).map(e -> e*e).reduce(0, Integer:: sum);
        System.out.println(sum);
    }
}
