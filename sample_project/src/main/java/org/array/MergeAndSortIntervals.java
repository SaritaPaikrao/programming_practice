package org.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeAndSortIntervals {
    public static void main(String[] args) {
        List<List<Integer>> intervals = new ArrayList<>();
        intervals.add(Arrays.asList(1, 6));
        intervals.add(Arrays.asList(2, 6));
        intervals.add(Arrays.asList(8, 10));
        intervals.add(Arrays.asList(15, 18));
        System.out.println(mergeHighDefinitionIntervals(intervals));
    }
    public static List<List<Integer>> mergeHighDefinitionIntervals(List<List<Integer>> intervals) {
        // Write your code here

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> intial = intervals.get(0);
        System.out.println(intial);
        for (int i = 1 ; i <= intervals.size() - 1 ; i++) {
            List<Integer> second = intervals.get(i);

            if (intial.get(1) > second.get(0)) {
                List<Integer> list = Arrays.asList(intial.get(0), second.get(1));
                result.add(list);
                intial = list;
            } else {
                result.add(second);
                intial = second;
            }

        }
        return result;
    }
}
