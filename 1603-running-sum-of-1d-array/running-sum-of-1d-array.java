class Solution {
    public int[] runningSum(int[] nums) {
        
        int n = nums.length;
        int[] prefix = new int[n ];
        prefix[0]=nums[0];
        for (int i = 0; i < n-1; i++) {
            prefix[i + 1] = prefix[i] + nums[i+1];
        }
        return prefix;
    }
}