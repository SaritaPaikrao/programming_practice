package org.integer_programs;

import java.util.Arrays;
import java.util.List;

public class FindTheTotalNumberOfElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        int count = (int) list.stream().count();
        System.out.println(count);
    }
}
