package org.javaCertificationPractice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test6 {
    public static void main(String[] args) {
        LocalDateTime localDate1 = LocalDateTime.of(2014,7,31,1,1);
        localDate1.plusDays(30);
        localDate1.plusMonths(1);
        //System.out.println(localDate1 (DateTimeFormatter.ISO_DATE));
        int data[] ={2010,2011,2012,2013,2014,22015};
        int key  = 2014;
        int count =0;
        for(int e:data){
            if(e!=key){
                continue;
               // count++; unreachable statement
            }
        }
    }
}
