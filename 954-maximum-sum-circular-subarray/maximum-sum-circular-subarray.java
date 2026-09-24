class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total=0;
        int max=nums[0];
        int currentmax=0;
        int min=nums[0];
        int currentmin=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
            currentmax=Math.max(currentmax+nums[i],nums[i]);
            max=Math.max(max,currentmax);
            currentmin=Math.min(currentmin+nums[i],nums[i]);
            min=Math.min(min,currentmin);
        }
        if(max<0){
            return max;
        }
        return Math.max(max,total-min);
    }
}