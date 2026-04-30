package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumOFInts {
    public static void main(String[] args) {
        List<Integer> intList= Arrays.asList(1,2,1,3,4,5,6,2,7,3,4,8,9);
        double intSum =  intList.stream().mapToInt(Integer::intValue).sum();
        System.out.println(intSum/intList.size());
       // System.out.println(intSum);

        Map<Integer,Long> intCount;
        intCount = intList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       // System.out.println(intCount);
    }
}
