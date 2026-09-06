class Solution {
    List<List<Integer>> arr=new ArrayList<>();
    int[] nums;
    public List<List<Integer>> subsets(int[] nums) {
        this.nums=nums;
        List<Integer> current=new ArrayList<>();
        back(0,current);
        return arr;

    }
    public void back(int idx, List<Integer> current){
        if(idx==nums.length){
            arr.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[idx]);
        back(idx+1,current);
        current.remove(current.size()-1);
        back(idx+1,current);
    }
}