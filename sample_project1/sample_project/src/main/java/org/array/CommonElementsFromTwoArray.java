package org.array;

import java.util.HashSet;
import java.util.Set;


public class CommonElementsFromTwoArray {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        int[] arr2 = new int[] { 1, 3, 4, 5, 6, 9, 8 };
        findCommonElements(arr1, arr2);
    }

    private static void findCommonElements(int[] arr1, int[] arr2) {

        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for (int i:arr1){
            set1.add(i);
        }
        for (int j:arr2) {
            set2.add(j);
        }
        set1.retainAll(set2);
        System.out.println(set1);
    }
}
