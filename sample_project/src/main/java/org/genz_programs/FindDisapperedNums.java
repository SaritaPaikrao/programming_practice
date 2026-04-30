package org.genz_programs;

import java.util.*;

public class FindDisapperedNums {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        int[] nums1 = {1,2,3,4,5};
        int total = Arrays.stream(nums1).reduce(0, Integer::sum);
        System.out.println(total);
        Set<Integer> numSet = new HashSet<>();
        for (int i : nums) {
            numSet.add(i);
        }
        List<Integer> missedNums = new ArrayList<>();
        for (int i = 1 ; i < nums.length ; i++) {
            if (!numSet.contains(i)) {
                missedNums.add(i);
            }
        }
        System.out.println(missedNums);
    }
}
