package org.example;

public class LongestRepetativeSubstringByDyanamicProgram {
    public static void main(String[] args) {
        String s = "gkfkjgdjkj";
        System.out.println("Longest Repeating Substring: " + longestRepeatingSubstring(s));
    }

    private static String longestRepeatingSubstring(String s) {
        int maxLength = 0;
        int lastindex = 0;
        int sLenght = s.length();
        int[][] dynamicAry = new int[sLenght+1][sLenght+1];
        for (int i = 1 ; i<= sLenght ; i++) {
            for (int j = i+1 ; j<= sLenght; j++) {
                if (s.charAt(i - 1) == s.charAt(j - 1)) {
                    dynamicAry[i][j] = dynamicAry[i - 1][j - 1] + 1;
                    if (dynamicAry[i][j] > maxLength) {
                        maxLength = dynamicAry[i][j];
                        lastindex = i ;
                    }
                }
            }
        }
        return s.substring(lastindex - maxLength, lastindex);
    }
}
