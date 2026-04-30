package org.array;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonDuplicateNoCount {
    public static void main(String[] args) {
        int nums[] = {2,2,3,4,5,6,3,8};
        Map<Integer, Long> frequencyCount = new HashMap<>();
       frequencyCount =  Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(frequencyCount);
    }
}
