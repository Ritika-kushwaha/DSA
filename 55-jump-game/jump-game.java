class Solution {
    public boolean canJump(int[] nums) {
        int zero=0;
        if(nums.length==1) return true;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) zero++;
        }
        if(zero==0) return true;
        int max=0;
        for(int i=0;i<nums.length-1;i++){
            if(max<i ){
                return false;
            }
            max=Math.max(nums[i]+i,max);
            
        }
        boolean is=false;
        if(max>=nums.length-1) is=true;
        return is;
    }
}