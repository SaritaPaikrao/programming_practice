package org.example;

import java.util.TreeSet;
import java.util.stream.Stream;

public class Sample4 {
    public static void main(String... args) {
        TreeSet<Integer> tSet = new TreeSet<>();
       // tSet.add(null); throghs null pointer exception
        tSet.add(0);
        System.out.println(tSet);
    A a = null;
    String str = a.m1();
    System.out.println(str);


        Stream.of("10", "x", "20")
                .map(s -> Integer.parseInt(s))       // NumberFormatException may occur
                .forEach(System.out::println);

    }


}
class A{
    static String m1(){
        return "Hello world !!";
    }
}
