package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

            int n=30;
            List<String> list=new ArrayList<>();
            for (int j = 1; j <= n; j++) {
                if(j%3==0 && j%5==0){
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

    }
}