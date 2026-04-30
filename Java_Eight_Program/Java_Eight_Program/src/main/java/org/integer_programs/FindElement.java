package org.integer_programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindElement {
    public static void main(String[] args) {
        List<Integer> int1 = Arrays.asList(1,2,3,4,5);
        List<Integer> int2 = Arrays.asList(1,2,3,4,5,6);
        System.out.println(int1.get(int1.size()-1));
        System.out.println(int2.get(int2.size()-1));
        }
}
