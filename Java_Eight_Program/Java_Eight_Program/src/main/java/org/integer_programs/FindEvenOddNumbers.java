package org.integer_programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindEvenOddNumbers {
    public static void main(String[] args) {
        //Method one
        System.out.println("Even numbers =>");
        List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        list.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
        System.out.println("Odd numbers =>");
        list.stream().filter(i -> i % 2 != 0).forEach(System.out::println);

        //Method 2
        int[] arr = {10, 15, 8, 49, 25, 98, 32};
        Map<Boolean, List<Integer>> list2 = Arrays.stream(arr).boxed()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));
        for (Map.Entry<Boolean, List<Integer>> mp : list2.entrySet()) {
            System.out.println("------------------");
            if (mp.getKey()) {
                System.out.println("Even Numbers");
            } else {
                System.out.println("Odd Numbers");
            }
            List<Integer> values = mp.getValue();
            for (int i : values) {
                System.out.println(i);
            }
        }
        System.out.println(list2);

        //Method 3

    }
}
