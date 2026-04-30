package org.genz_programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindFirstNameFromStringList {
    public static void main(String[] args) {
        List<String> fullNames = Arrays.asList("Alice Johnson", "Bob Harris", "Charlie Lou");
        List<String> peekedAtNumbers = fullNames.stream()
                .peek(System.out::println)
                .collect(Collectors.toList());
        List<String> firstNames = fullNames.stream().map(e -> e.split(" ")[0]).collect(Collectors.toList());
        System.out.println(firstNames);
    }
}
