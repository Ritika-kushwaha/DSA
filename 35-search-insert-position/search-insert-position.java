class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int ans=0;
        boolean found=true;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                ans=i;
                found=false;
                break;
            }
        }
        if(found==true){
            for(int i=0;i<n-1;i++){
                if(target>nums[i] && target<nums[i+1]){
                    ans=i+1;
                }
               
                  
                
            }
        }
        if(target>nums[n-1]){
            ans=n;
        }
        return ans;
    }
}