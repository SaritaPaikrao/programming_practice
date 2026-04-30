package org.java8.stringprogram;

import java.util.Arrays;

public class PrintEvenLengthWord {
    public static void main(String[] args) {
        String str= "i am Geeks for Geeks and a Geek";

        Arrays.stream(str.split(" ")).filter(s->s.length()%2==0).forEach(System.out::println);

        /*for(String s:str.split(" ")){

            if (s.length()%2==0){
                System.out.println(" "+s);
            }
        }*/
    }

}
