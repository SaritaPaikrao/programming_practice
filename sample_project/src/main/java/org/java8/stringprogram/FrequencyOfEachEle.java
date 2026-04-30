package org.java8.stringprogram;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachEle {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("Pen", "Eraser", "Pen", "Book", "Notebook", "Book");
        Map<String, Long> strMap = strList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(strMap);
    }
}
