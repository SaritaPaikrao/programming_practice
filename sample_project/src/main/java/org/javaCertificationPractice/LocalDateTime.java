package org.javaCertificationPractice;

import java.time.Clock;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class LocalDateTime {
    public static void main(String[] args) {
        //throws runtime exception
        String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE);
        System.out.println(date);
        System.out.println("---------------------");
        LocalDate date1 = LocalDate.parse("2000-01-01");
        System.out.println(date1);
        Period period = Period.ofYears(-3000);
        System.out.println(period);
        System.out.println(date1.plus(period));
        System.out.println("------------------------");
        LocalDate localDate =  LocalDate.ofYearDay(2000,36);
        LocalDate localDate1 = LocalDate.EPOCH;
        System.out.println(localDate1);
        LocalDate obj = LocalDate.now();
        //System.out.println(obj.getHour());
    }

}
