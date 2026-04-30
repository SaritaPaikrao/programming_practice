package org.string_programs;

import java.util.List;
import java.util.stream.Stream;

public class StrignLength {
    public static void main(String[] args) {
        String str ="Hello worlds";
        List<String> strLsit = List.of(str.split(" "));
       // System.out.println(strLsit);
        strLsit.stream().skip(1).map(String::length).forEach(System.out::println);
    }
}
