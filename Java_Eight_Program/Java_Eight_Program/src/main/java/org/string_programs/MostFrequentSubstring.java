package org.string_programs;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentSubstring {
    public static void main(String[] args) {

                String input = "abcabcabcabc";

                Map<String, Integer> substringCount = new HashMap<>();
                int maxCount = 0;
                String mostFrequent = "";

                // Generate all possible substrings
                for (int i = 0; i < input.length(); i++) {
                    for (int j = i + 2; j <= input.length(); j++) {
                        String sub = input.substring(i, j);
                        int count = substringCount.getOrDefault(sub, 0) + 1;
                        substringCount.put(sub, count);

                        if (count > maxCount || (count == maxCount && sub.length() > mostFrequent.length())) {
                            maxCount = count;
                            mostFrequent = sub;
                        }
                    }
                }

                System.out.println("Most frequent substring: " + mostFrequent);
                System.out.println("Count: " + maxCount);

    }
}
