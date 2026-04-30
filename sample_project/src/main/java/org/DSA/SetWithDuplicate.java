package org.DSA;

import java.util.HashSet;
import java.util.Set;

public class SetWithDuplicate {
    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();

        strings.add("Hello");
        strings.add("hello");
        System.out.println(strings);


    }
}
