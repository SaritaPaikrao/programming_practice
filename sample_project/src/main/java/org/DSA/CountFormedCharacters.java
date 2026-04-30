package org.DSA;
/*You are given an array of strings words and a string chars.
A string is good if it can be formed by characters from chars (each character can only be used
 once for eachword in words).
Return the sum of lengths of all good strings in words.
Example 1:
Input: words = ["cat","bt","hat","tree"], chars = "atach"
Output: 6
Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.								*/
public class CountFormedCharacters {

    public int countCharacters(String[] words, String chars) {
        // Frequency of available characters in `chars`
        int[] baseFreq = buildFreq(chars);

        int total = 0;
        for (String w : words) {
            if (canBuild(w, baseFreq)) {
                total += w.length();
            }
        }
        return total;
    }

    private int[] buildFreq(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        return freq;
    }

    private boolean canBuild(String word, int[] baseFreq) {
        // Copy because each word consumes counts independently
        int[] need = new int[26];
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            need[idx]++;
            if (need[idx] > baseFreq[idx]) {
                return false; // early exit if any char exceeds supply
            }
        }
        return true;
    }

    // --- Simple demo ---
    public static void main(String[] args) {
        CountFormedCharacters solver = new CountFormedCharacters();

        System.out.println(
                solver.countCharacters(new String[]{"cat","bt","hat","tree"}, "atach")
        ); // 6

        System.out.println(
                solver.countCharacters(new String[]{"hello","world","leetcode"}, "welldonehoneyr")
        ); // 10
    }

}
