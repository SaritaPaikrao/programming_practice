package org.example;

public class LongestPalindrominSubsequentusingLCS {
    public static void main(String[] args) {
        String str = "babad";
        System.out.println("Length of LPS: " + lps1(str));
    }

    private static int lps1(String str) {
        String rev = new StringBuilder(str).reverse().toString();
        return lcs(str, rev);
    }

    private static int lcs(String str, String rev) {
        int n = str.length(), m = rev.length();
        int dp[][] = new int[n+1][m+1];

        for (int i = 1; i<=n ; i++) {
            for (int j = 1; j<=m ; j++) {
                if (str.charAt(i - 1) == rev.charAt(j - 1)) {
                    dp[i][j] = dp[i -1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n][m];
    }
}
