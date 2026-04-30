package org.DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersectionInintervals {
    public static int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        Arrays.sort(firstList, (a1, a2) -> Integer.compare(a1[0], a2[0]));
        Arrays.sort(secondList, (a1, a2) -> Integer.compare(a1[0], a2[0]));
        List<int[]> mergered = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < firstList.length && j < secondList.length) {
            int start1 = firstList[i][0];
            int end1 = firstList[i][1];
            int start2 = secondList[j][0];
            int end2 = secondList[j][1];

            int startMax = Math.max(start1, start2);
            int endMin = Math.min(end1, end2);

            if (startMax <= endMin) {
                mergered.add(new int[]{startMax, endMin});
            }

            if (end1 < end2) {
                i++;
            } else {
                j++;
            }

        }

        return mergered.toArray(new int[firstList.length][]);
    }

    public static void main(String[] args) {
        int[][] firstList = {{0, 2}, {5, 10}, {13, 23}, {24, 25}};
        int[][] secondList = {{1, 5}, {8, 12}, {15, 24}, {25, 26}};

        //output = [[1,2],[5,5],[8,10],[15,23],[24,24],[25,25]]

        System.out.println(Arrays.deepToString(intervalIntersection(firstList, secondList))); // [[1,6],[8,10],[15,18]]
    }

}
