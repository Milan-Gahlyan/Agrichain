/* 
The approach I took to solve this problem is the sliding window technique.
The main idea is to avoid re-checking substrings we already know are valid. 
Instead of looking at every single possible substring, we create a 'window' that represents our current, non-repeating substring. 
We then try to expand this window as much as possible.
*/

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
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

    public static void main(String[] args) {
        LongestSubstring solution = new LongestSubstring();

        // Test Case 1
        String s1 = "abcabcbb";
        System.out.println("Input: \"" + s1 + "\"");
        System.out.println("Length of longest substring: " + solution.lengthOfLongestSubstring(s1));

        // Test Case 2
        String s2 = "bbbbb";
        System.out.println("\nInput: \"" + s2 + "\"");
        System.out.println("Length of longest substring: " + solution.lengthOfLongestSubstring(s2));

        // Test Case 3
        String s3 = "pwwkew";
        System.out.println("\nInput: \"" + s3 + "\"");
        System.out.println("Length of longest substring: " + solution.lengthOfLongestSubstring(s3));

        // Test Case 4: Empty string
        String s4 = "";
        System.out.println("\nInput: \"" + s4 + "\"");
        System.out.println("Length of longest substring: " + solution.lengthOfLongestSubstring(s4));
    }
}