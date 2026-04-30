package org.java8.numberPrograms;

import java.util.Arrays;

public class PlaceZeroToLAst {
    public static void main(String[] args) {
        int[] strAry = {2, 0, 1, 0, 5, 12};
        int[] nonZero = Arrays.stream(strAry).filter(n -> n!=0 ).sorted().toArray();

        int zeros = strAry.length -nonZero.length;
        int[] result = Arrays.copyOf(nonZero, strAry.length);
        Arrays.fill(result,nonZero.length,strAry.length,0);
        System.out.println(Arrays.toString(result));
    }
}
