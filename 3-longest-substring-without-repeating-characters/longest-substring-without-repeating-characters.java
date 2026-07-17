class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> unique = new HashSet<>();
        int left=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            while (unique.contains(s.charAt(i))) {
                unique.remove(s.charAt(left));
                left++;
            }
            unique.add(s.charAt(i));
            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}