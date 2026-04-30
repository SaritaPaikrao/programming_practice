package org.DSA;

public class LogestSubstringdynamicpro {
    private static String longestRepeatingSubstring(String str) {
        int n = str.length();
        int[][] dp = new int[n+1][n+1];
        int maxLength = 0;
        int endIndex = 0;
        for (int i = 1; i <= n; i++)  {
            for (int j = i+1; j <= n; j++)
            {
                if (str.charAt(i-1) == str.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                    if (dp[i][j] > maxLength) {
                        maxLength = dp[i][j];
                        endIndex = i;
                    }
                }
            }
        }
        return str.substring(endIndex - maxLength, endIndex);
}


    public static void main(String[] args) {
        String s = "gkfkjgdjkj";
        System.out.println("Longest Repeating Substring: " + longestRepeatingSubstring(s));
    }


}
