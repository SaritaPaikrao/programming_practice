package org.DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergerOverLap {
    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        List<int[]> mergerd = new ArrayList<>();
        // Step 1: Sort intervals by start time
        Arrays.sort(intervals, (a1,a2) -> Integer.compare(a1[0], a2[0]));

        int[] current = intervals[0];
        // Step 2: Traverse and merge overlapping intervals
        for (int i = 1; i < intervals.length ; i++){
            int[] next = intervals[i];
            if (current[1] >= next[0]) {
                current[1] = Math.max(current[1], next[1]);
            } else {
                mergerd.add(current);
                current = next;
            }
        }



        // Add the last interval
        mergerd.add(current);
        // Convert list back to array
        return mergerd.toArray(new int[mergerd.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals1 = {{1,3},{2,6},{8,10},{15,18}};
        int[][] intervals2 = {{1,4},{4,5}};
        int[][] intervals3 = {{4,7},{1,4}};

        System.out.println(Arrays.deepToString(merge(intervals1))); // [[1,6],[8,10],[15,18]]
        System.out.println(Arrays.deepToString(merge(intervals2))); // [[1,5]]
        System.out.println(Arrays.deepToString(merge(intervals3))); // [[1,7]]
    }
}

