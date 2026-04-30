package org.DSA;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindNoteInWord {
    public static void main(String[] args) {
        String[] words = {"baby", "referee", "cat", "dada", "dog", "bird", "ax", "baz"};
        System.out.println(find(words, "ctay"));           // Output: "cat"
        System.out.println(find(words, "breadmaking")); // Output: "cat"
        System.out.println(find(words, "tbaykkjlga"));     // Output: "-"
        System.out.println(find(words, "bbbblkkjbaby"));   // Output: "baby"
    }

    public static String find(String[] words, String note) {
        // Step 1: Count character frequencies in the note
        int[] noteCounts = countChars(note);

        for (String word : words) {
            // Step 2: Count character frequencies for the current word
            int[] wordCounts = countChars(word);
            // Step 3: Check if the word can be formed from the note
            if (canForm(wordCounts, noteCounts)) {
                return word;
            }
        }

        // Return "-" if no word matches
        return "-";
    }

    private static int[] countChars(String str) {
        int[] counts = new int[256]; // Assuming ASCII characters
        for (char c : str.toCharArray()) {
            counts[c]++;
        }
        return counts;
    }

    private static boolean canForm(int[] wordCounts, int[] noteCounts) {
        for (int i = 0; i < 256; i++) {
            // If the word requires more of a letter than the note has, fail
            if (wordCounts[i] > noteCounts[i]) {
                return false;
            }
        }
        return true;
    }

}

