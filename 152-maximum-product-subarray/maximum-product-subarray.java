class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int globalMax = nums[0];
        int currentMax = nums[0];
        int currentMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            if (num < 0) {
                int temp = currentMax;
                currentMax = currentMin;
                currentMin = temp;
            }

            currentMax = Math.max(num, currentMax * num);
            currentMin = Math.min(num, currentMin * num);

            globalMax = Math.max(globalMax, currentMax);
        }

        return globalMax;
    }
}