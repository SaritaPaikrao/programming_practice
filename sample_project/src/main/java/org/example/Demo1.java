package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,7,4,5,6);
        list.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst();
        System.out.println(list.stream().max(Comparator.naturalOrder()).get());


        int i = Integer.MAX_VALUE;
        System.out.println(i);
        i++;
        System.out.println(i);
    }
}
