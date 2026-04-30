package org.java8.stringprogram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonWordFromString {
    public static void main(String[] args) {
        String str = "Java is fun and Java is powerful";
        List<String> strList = Arrays.asList(str.split(" ")).stream().map(st -> st.toLowerCase()).distinct().sorted().collect(Collectors.toList());
        Set<String> strSet = new HashSet<>();
        Arrays.asList(str.split(" ")).stream().filter(e -> !strSet.add(e)).forEach(System.out::println);
        System.out.println(strList);
    }
}
