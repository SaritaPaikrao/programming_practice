package org.java8.numberPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeparateEvenAndOddNumbers {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        Map<Boolean,List<Integer>> evenOdd = listOfIntegers.stream().
                    collect(Collectors.partitioningBy(e -> e%2 ==0));
        for (Map.Entry<Boolean,List<Integer>> mp: evenOdd.entrySet()){
            if(mp.getKey()){
                System.out.println("Even number");
            }else{
                System.out.println("Odd number");
            }
            System.out.println(mp.getValue());
        }
    }
}
