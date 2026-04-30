package org.DSA;

import java.util.Arrays;

public class RemoveOverLappingIntervals {
    private static int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a1, a2) -> Integer.compare(a1[1], a2[1]));
        int pre = Integer.MIN_VALUE;
        int ans = intervals.length;

        for (int[] in : intervals) {
            int start = in[0];
            int end = in[1];
            if(start >= pre) {
                pre = end;
                ans--;
            }
        }
        return ans;
        }

    public static void main(String[] args) {
        int[][] intervals = {{1,2}, {2,3}, {3,4}, {1,3}};
        System.out.println("Minimum intervals to remove: " + eraseOverlapIntervals(intervals));
    }


}
