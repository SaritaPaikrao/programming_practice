package org.integer_programs;

import java.util.Arrays;
import java.util.List;

public class NumberStartsWithOne {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        myList.stream().map(s->s+"")
                .filter(x->x.startsWith("1")).forEach(System.out::println);
    }
}
