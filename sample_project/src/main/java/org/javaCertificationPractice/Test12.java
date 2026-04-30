package org.javaCertificationPractice;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Test12 {
    public static void main(String[] args) {
        List<StringBuilder> days = new ArrayList<>();

        days.add(new StringBuilder("Sunday"));
        days.add(new StringBuilder("Monday"));
        days.add(new StringBuilder("Tuesday"));

        if (days.contains(new StringBuilder("Sunday"))) {
            days.add(new StringBuilder("Wednesday"));
        }

        System.out.println(days.size());

        List<String> list = new ArrayList<>();
        list.add(new String("X"));
        list.add("Y");
        list.add("X");
        list.add("Y");
        list.add("Z");
        if (list.contains(new String("Y"))) {
            list.remove(new String("Y"));
        }
        System.out.println(list);
        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.parse("2018-07-11"));
        dates.add(LocalDate.parse("1919-10-25"));
        dates.add(LocalDate.of(2020, 4, 8));
        dates.add(LocalDate.of(1980, Month.DECEMBER, 31));
        dates.removeIf(x -> x.getYear() < 2000);
        System.out.println(dates);

        List<String> list1 = new ArrayList<>();
        list1.add(new String("ONE"));
        list1.add(new String("TWO"));
        list1.add(new String("THREE"));
        list1.add(new String("THREE"));
        list1.remove(new String("ONE"));
        if(list.contains(new String("ONE"))){
            System.out.println("Printed");
        }

        System.out.println(list1);
    }
}
