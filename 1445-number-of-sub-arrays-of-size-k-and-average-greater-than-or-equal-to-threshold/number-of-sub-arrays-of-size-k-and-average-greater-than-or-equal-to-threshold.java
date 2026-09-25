class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int avg=0;
        int sum=0;
        int count=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        avg=sum/k;
        if(avg>=threshold){
            count++;
        }
        for(int i=0;i<arr.length-k;i++){
            sum=sum-arr[i]+arr[k+i];
            avg=sum/k;
            if(avg>=threshold){
                count++;
            }
        }
        return count;
    }
}