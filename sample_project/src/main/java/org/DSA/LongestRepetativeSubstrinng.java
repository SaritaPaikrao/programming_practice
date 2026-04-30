package org.DSA;

public class LongestRepetativeSubstrinng {
    // Function to find longest repeating substring
    public static String longestRepeatingSubstring(String str) {
        int n = str.length();
        String lrs = "";
        // longest repeating substring
        // Compare all substrings
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                String x = longestCommonPrefix(str.substring(i), str.substring(j));
                if (x.length() > lrs.length()) {
                    lrs = x;
                }
            }
        }
        return lrs;
    } // Helper function to find longest common prefix between two string

    private static String longestCommonPrefix(String s1, String s2) {
        int n = Math.min(s1.length(), s2.length());
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.substring(0, i);
            }
        }
        return s1.substring(0, n);
    }

    public static void main(String[] args) {
        String str = "acbdfghybdf";
        System.out.println("Longest Repeating Substring: " + longestRepeatingSubstring(str));
    }
}
