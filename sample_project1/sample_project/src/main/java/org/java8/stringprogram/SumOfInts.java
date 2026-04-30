package org.java8.stringprogram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumOfInts {
    public static void main(String[] args) {
        List<Integer> intList= Arrays.asList(1,2,1,3,4,5,6,2,7,3,4,8,9);

        int intSum =  intList.stream().mapToInt(Integer::intValue).sum();
        System.out.println(intSum);

        Map<Integer,Long> intCount= new HashMap<Integer,Long>();
        intCount=intList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(intCount);
    }
}
