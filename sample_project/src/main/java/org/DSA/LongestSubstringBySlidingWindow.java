package org.DSA;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringBySlidingWindow {
    public static int lengthOfLongestSubstring(String s) {

        int l = 0;
        int r = 0;
        if (s.length() == 0) return 0;
        int max = 0;

        char arr[] = s.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        while (r < arr.length) {

            if (map.containsKey(arr[r])) {
                if (map.get(arr[r]) >= l) {
                    l = map.get(arr[r]) + 1;
                }
            }
            map.put(arr[r], r);
            int length = r - l + 1;
            if (length > max) {
                max = length;

            }
            r++;
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "bdabbdabsa";
        System.out.println("Longest Repeating Substring: " + lengthOfLongestSubstring(s));
    }
}
