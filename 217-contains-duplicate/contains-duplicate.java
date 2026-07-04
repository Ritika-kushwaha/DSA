import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Create a set to store the unique numbers we have seen so far
        HashSet<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}