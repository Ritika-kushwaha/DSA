class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int arr[]=new int[2];
        int right=numbers.length-1;
        while(left<right){
            int currentSum = numbers[left] + numbers[right];

            if (currentSum == target) {
                arr[0]=left+1;
                arr[1]=right+1;
                break;
            } else if (currentSum < target) {
                left++;
            }else{
                right--;
            }
        }
        return arr;
    }
}