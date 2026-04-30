package org.example;

import java.util.ArrayList;
import java.util.List;

public class FinalList {
    public static void main(String[] args) {
        final List<String> list = new ArrayList<>();
        list.add("Sarita");
        list.add("Riva");
        list.add("Vikas");
        System.out.println(list);
        //list = new ArrayList<>(); not allowed
        final String str;
        str = "Riva";
        System.out.println(str);
    }
}
