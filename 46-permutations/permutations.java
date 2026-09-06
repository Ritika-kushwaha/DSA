class Solution {
    List<List<Integer>> list=new ArrayList<>();
    
    public List<List<Integer>> permute(int[] nums) {
        boolean[] ans=new boolean[nums.length];
        back(nums,new ArrayList<>(),ans);
        return list;
    }
    private void back(int[] nums, List<Integer> current,boolean[] ans){
        if(current.size()==nums.length){
            list.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(ans[i]) continue;
            current.add(nums[i]);
            ans[i]=true;
            back(nums,current,ans);
            current.remove(current.size()-1);
            ans[i]=false;
        }
    }
}