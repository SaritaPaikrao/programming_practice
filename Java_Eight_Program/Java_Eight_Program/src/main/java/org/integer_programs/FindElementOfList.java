package org.integer_programs;

import java.util.Arrays;
import java.util.List;

public class FindElementOfList {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(12,32,1,24,55,43,67);
        intList.stream().findFirst().ifPresent(System.out::println);
    }
}
