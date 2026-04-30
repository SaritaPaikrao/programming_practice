package org.DSA;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDiffOfOddAndEvenFeqCount {
    public static void main(String[] args) {
        String str = "aabbbcccddd";
        Map<String, Long> freCount = new HashMap<>();
       String[] chAry = str.split("");
       freCount = Arrays.stream(chAry).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        long oddMax = freCount.entrySet().stream().filter(e -> (e.getValue()) % 2 == 1).max(Map.Entry.comparingByValue()).get().getValue();
        System.out.println(oddMax);
        long evenMin = freCount.entrySet().stream().filter(e -> (e.getValue()) % 2 == 0).min(Map.Entry.comparingByValue()).get().getValue();
        long diff = oddMax - evenMin;
        System.out.println(diff);
    }

}
