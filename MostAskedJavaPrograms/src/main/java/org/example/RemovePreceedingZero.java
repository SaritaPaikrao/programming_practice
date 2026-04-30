package org.example;

import java.util.stream.IntStream;

public class RemovePreceedingZero {
    public static void main(String[] args) {
        String input = "0001234500";

        int intvalue = Integer.parseInt(input);
        String result = String.valueOf(intvalue);
        System.out.println(result);
        //----------------------------------------------------------
        int firstNonZeroIndex = IntStream.range(0, input.length()).
                filter(i -> input.charAt(i) != '0')
                .findFirst()
                .orElse(input.length());
        String result1 = input.substring(firstNonZeroIndex);
        System.out.println(result1);
        //-----------------------------------------------------------
        String outputS = input.chars().dropWhile(e -> e == '0')
                .collect(StringBuilder::new, StringBuilder::appendCodePoint
                        , StringBuilder::append).toString();
        System.out.println(outputS);
    }
}
