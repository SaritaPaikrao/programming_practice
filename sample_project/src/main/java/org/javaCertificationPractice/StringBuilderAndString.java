package org.javaCertificationPractice;

public class StringBuilderAndString {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Java");
        String s = "Java";
        if(stringBuilder.toString().equals(s.toString())){
            System.out.println("match 1");
        }else if(stringBuilder.equals(s)){
            System.out.println("match 2");
        }else{
            System.out.println("no match");
        }
    }

    }
