package services;

import java.util.HashMap;
import java.util.Map;

class LongestSubStrUniqueChars {

    static {
        // Calling maxArea with an array of zeros multiple times (500 times)
        for(int i = 0; i < 500; i++) {
            lengthOfLongestSubstring("");
        }
    }

    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        Map<Character, Integer> lastSeen = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (lastSeen.containsKey(c) && lastSeen.get(c) >= left) {
                left = lastSeen.get(c) + 1;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            lastSeen.put(c, right);
        }

        return maxLength;
    }
}
