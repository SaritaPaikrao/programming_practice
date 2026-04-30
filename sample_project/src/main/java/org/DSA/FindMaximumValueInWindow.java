package org.DSA;

public class FindMaximumValueInWindow {
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        System.out.println(findMaximumValueInWindo(nums, k));
    }

    private static int[] findMaximumValueInWindo(int[] nums, int k) {
        for (int i : nums) {
            int[] window = new int[k];
            for (int j = i; j < k; j++) {
                window[i] = nums[j];
            }
            //int max = window

        }
        return null;
    }
}
