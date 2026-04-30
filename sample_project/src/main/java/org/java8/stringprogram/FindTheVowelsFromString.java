package org.java8.stringprogram;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindTheVowelsFromString {
    public static void main(String[] args) {
        String str = "Java is Fun and Java is powerful";
        Set<Character> vowelList = str.toLowerCase().chars().mapToObj(c -> (char) c).filter(e -> "aeiou".indexOf(e) !=-1).collect(Collectors.toSet());
        System.out.println(vowelList);
    }
}
