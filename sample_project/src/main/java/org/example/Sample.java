package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sample {
    public static void main(String[] args) {
        int n=30;
        List<String> list=new ArrayList<>();
        for (int j = 1; j <= n; j++) {
            if (j % 3 == 0 && j % 5 == 0) {
                list.add("FIZZBUSS");
            }else if(j%3==0){
                list.add("FIZZ");
            }else if (j%5==0){
                list.add("BUZZ");
            }else{
                list.add(String.valueOf(j));
            }
        }

        list.forEach(System.out::println);

























        /*int[] ary= {1,2,3,4,5,6,7,8,9};
        Arrays.stream(ary).filter(i->i%2==0).mapToDouble(Math::sqrt).forEach(System.out::println);
    String s="Sarita";
        System.out.println(s.hashCode());
    s="Sagar";
        System.out.println(s.hashCode());*/
    }
}
