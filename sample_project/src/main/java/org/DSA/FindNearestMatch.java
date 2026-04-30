package org.DSA;

public class FindNearestMatch {

    // Returns best matching word (longest) that can be formed from input letters, else "-"
    public static String nearestMatchingWord(String[] words, String input) {
        int[] freqInput = freq(input.toLowerCase());

        String best = "-";
        for (String w : words) {
            String word = w.toLowerCase();
            if (canForm(word, freqInput)) {
                if (best.equals("-")
                        || word.length() > best.length()
                        || (word.length() == best.length() && word.compareTo(best) < 0)) {
                    best = word;
                }
            }
        }
        return best;
    }

    // Check if word can be formed from input frequency without reusing chars
    private static boolean canForm(String word, int[] freqInput) {
        int[] need = new int[26];
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c < 'a' || c > 'z') return false; // if only lowercase allowed
            int idx = c - 'a';
            need[idx]++;
            if (need[idx] > freqInput[idx]) return false;
        }
        return true;
    }

    private static int[] freq(String s) {
        int[] f = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') f[c - 'a']++;
        }
        return f;
    }

    public static void main(String[] args) {
        String[] a = {"Text", "cat", "bag", "dad", "baby"};

        System.out.println(nearestMatchingWord(a, "txtea"));       // text
        System.out.println(nearestMatchingWord(a, "ctay"));
        System.out.println(nearestMatchingWord(a, "breadmaking")); // Output: "cat"
        System.out.println(nearestMatchingWord(a, "tbaykkjlga"));  // Output: "-"
    }

}
