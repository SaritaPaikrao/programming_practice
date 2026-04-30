package org.java8.numberPrograms;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeUnsrtedTwoArrayToSortedArray {
    public static void main(String[] args) {
        int[] a = {23, 45, 12, 2, 4, 1, 9};
        int[] b = {12, 4, 76, 24, 8, 23, 10};
        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
        System.out.println(Arrays.toString(c));
    }
}
