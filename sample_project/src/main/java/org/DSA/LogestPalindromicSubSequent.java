package org.DSA;

public class LogestPalindromicSubSequent {
    // Function to find the length of LPS
    static int longestPalSubseq(String str)
    {
        int n = str.length();
        int[][] dp = new int[n][n];
        // Every single character is a palindrome of length 1
        for (int i = 0; i < n; i++)
        {
            dp[i][i] = 1;
        }
        // Build the table
        for (int cl = 2; cl <= n; cl++)
        {
            for (int i = 0; i < n - cl + 1; i++)
            {
                int j = i + cl - 1;
                if (str.charAt(i) == str.charAt(j) && cl == 2)
                {
                    dp[i][j] = 2;
                }
                else if (str.charAt(i) == str.charAt(j))
                    {
                        dp[i][j] = dp[i + 1][j - 1] + 2;
                    }
                    else
                    {
                        dp[i][j] = Math.max(dp[i][j - 1], dp[i + 1][j]);
                    }
            }
        }
        return dp[0][n - 1];
    } // Driver code
     public static void main(String[] args)
     {
         String seq = "BBABCBCAB"; System.out.println("The length of the LPS is: " + longestPalSubseq(seq));
     }
}
