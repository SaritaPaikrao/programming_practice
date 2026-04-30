package org.DSA;

public class LongestNonOverlappingRepeatedSubstring {
    public static int longestNonOverlappingSubstringLength(String s) {
        int n = s.length();
        if (n <= 1) return 0;

        int[][] dp = new int[n][n];
        int ans = 0;

        // i < j ensures different starting positions
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (i > 0) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    } else {
                        dp[i][j] = 1;
                    }

                    // ✅ non-overlapping condition
                    dp[i][j] = Math.min(dp[i][j], j - i);

                    ans = Math.max(ans, dp[i][j]);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(longestNonOverlappingSubstringLength("banana"));       // 2 ("an")
        System.out.println(longestNonOverlappingSubstringLength("aaaaa"));        // 2 ("aa")
        System.out.println(longestNonOverlappingSubstringLength("abababa"));      // 3 ("aba")
        System.out.println(longestNonOverlappingSubstringLength("abcd"));         // 0
        System.out.println(longestNonOverlappingSubstringLength("acdcdacdc"));    // 4 ("acdc")
    }
}
