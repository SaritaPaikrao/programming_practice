package org.example;

import java.util.*;

public class MinChangesForKDistinct {

    public static int minChanges(int[] arr, int k) {
        int n = arr.length;
        Set<Integer> distinct = new HashSet<>();
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            distinct.add(num);
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int currentDistinct = distinct.size();

        if (currentDistinct >= k) {
            return 0; // Already has at least K distinct elements
        }

        int changesNeeded = k - currentDistinct;

        // Sort frequencies in descending order to find which elements to replace
        List<Integer> frequencies = new ArrayList<>(freq.values());
        Collections.sort(frequencies, Collections.reverseOrder());

        return changesNeeded;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3}; // Example array
        int k = 4; // Desired number of distinct elements

        System.out.println("Minimum changes needed: " + minChanges(arr, k));
    }

}
