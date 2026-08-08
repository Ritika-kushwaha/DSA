class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int ans=0;
        int left=0;
        int right=n-1;
        boolean found=false;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                ans=mid;
                found=true;
                break;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        if(found==false){
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