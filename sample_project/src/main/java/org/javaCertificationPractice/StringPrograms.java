package org.javaCertificationPractice;

import java.util.ArrayList;
import java.util.List;

public class StringPrograms {

    static String msg; //Line 2

    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder("Hello");
        List<StringBuilder> list = new ArrayList<>();
        list.add(sb);
        list.add(new StringBuilder("Hello"));
        list.add(sb);
        sb.append("World!");

        System.out.println(list);


        String[] arr = {"abc", "TrUe", "false", null, "FALSE"};
        for (String s : arr) {
            System.out.print(Boolean.valueOf(s) ? "T" : "F");
        }

        final boolean flag;
        flag = false;
        while (flag) {
            System.out.println("Good Morning!");
        }

        String msg; //Line 4
        if (args.length > 0) {
            msg = args[0]; //Line 6
        }
        //System.out.println(msg); //
        String javaworld = "JavaWorld";
        String java = "Java";
        String world = "World";
        java += world;
        System.out.println(java == javaworld);
        String fName = "James";
        String lName = "Gosling";
        System.out.println(fName = lName);
        String s1 = "OcA";
        String s2 = "oCa";
        System.out.println(s1.equalsIgnoreCase(s2));
        List list1 = new ArrayList<String>(); //Line 5
        List<String> list2 = new ArrayList(); //Line 6
        //List<> list3 = new ArrayList<String>(); //Line 7
        List<String> list4 = new ArrayList<String>(); //Line 8
        List<String> list5 = new ArrayList<>(); //Line 9

        //String[] arr = new String[7];
        System.out.println(arr);

    }
}
