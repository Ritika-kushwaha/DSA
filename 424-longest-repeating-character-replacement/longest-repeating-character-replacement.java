class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
    int maxFrequency = 0;
    int maxLength = 0;

    HashMap<Character, Integer> map = new HashMap<>();

    for (int right = 0; right < s.length(); right++) {

        char ch = s.charAt(right);

        // Add character to the window
        map.put(ch, map.getOrDefault(ch, 0) + 1);

        // Highest frequency in the window
        maxFrequency = Math.max(maxFrequency, map.get(ch));

        // Shrink window if too many replacements are needed
        while (right - left + 1 - maxFrequency > k) {

            char leftChar = s.charAt(left);

            map.put(leftChar, map.get(leftChar) - 1);

            left++;
        }
        maxLength = Math.max(maxLength, right - left + 1);
    }

    return maxLength;
    }
}