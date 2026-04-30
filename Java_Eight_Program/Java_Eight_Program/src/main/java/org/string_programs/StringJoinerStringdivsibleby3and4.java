package org.string_programs;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerStringdivsibleby3and4 {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("hello", "worldwideweb", "javaisfun", "abcdefghijkl", "openai", "chatgptrocks");
        StringJoiner stringJoiner = new StringJoiner("-");
        strings.stream().filter(e -> e.length()%3==0 || e.length()%4==0).forEach(stringJoiner::add);
        System.out.println(stringJoiner);
    }

}
