package org.agrichain.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Contains the business logic to calculate the length of the longest substring.
 * This is used to verify the output shown on the website.
 */
public class LongestSubstringLogic {

    public int calculate(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        Map<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            if (charIndexMap.containsKey(currentChar)) {
                start = Math.max(start, charIndexMap.get(currentChar) + 1);
            }

            charIndexMap.put(currentChar, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}
