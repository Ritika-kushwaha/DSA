class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int n=nums.length/3;
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])>n && !arr.contains(nums[i])){
                arr.add(nums[i]);
            }
        }
        return arr;
    }
}