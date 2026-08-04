class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans=new LinkedList<>();
        int max=nums[0];
        int min=nums[0];
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            if(max<nums[i]){
                max=nums[i];
            }
            if(min>nums[i]){
                min=nums[i];
            }
        }
        for(int i=min;i<max;i++){
            
                if(!set.contains(i)){
                    ans.add(i);
                }
            
        }
        return ans;
     
    }
}