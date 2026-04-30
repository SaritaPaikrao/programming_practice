package org.DSA;

import java.util.Arrays;

public class LogestRepeatativeSubString {

    public static String longestRepeatedSubstring(String s) {
        int n = s.length();
        if (n <= 1) return "";

        // Build all suffixes with their start index (to break ties consistently)
        String[] suffixes = new String[n];
        for (int i = 0; i < n; i++)
        {
            suffixes[i] = s.substring(i);
        }

        Arrays.sort(suffixes); // lexicographic order

        String best = "";
        for (int i = 0; i < n - 1; i++) {
            String lcp = lcp(suffixes[i], suffixes[i + 1]);
            if (lcp.length() > best.length()) {
                best = lcp;
            }
        }
        return best;
    }

    private static String lcp(String a, String b) {
        int len = Math.min(a.length(), b.length());
        int i = 0;
        while (i < len && a.charAt(i) == b.charAt(i))
        {
            i++;
        }
        return a.substring(0, i);
    }

    // demo
    public static void main(String[] args) {
        System.out.println(longestRepeatedSubstring("banana"));   // "ana"
        System.out.println(longestRepeatedSubstring("abcd"));     // ""
        System.out.println(longestRepeatedSubstring("aaaa"));     // "aaa" (overlaps allowed)
        System.out.println(longestRepeatedSubstring("mississippi")); // "issi" or "ss" (max is "issi")
    }

}
