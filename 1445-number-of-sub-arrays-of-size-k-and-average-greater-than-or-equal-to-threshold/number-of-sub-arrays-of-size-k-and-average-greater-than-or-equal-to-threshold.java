class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int avg=0;
        int sum=0;
        int count=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
            
        }

        avg=sum/k;
        if(avg>=threshold) count++;
        for(int i=k;i<arr.length;i++){
            avg=avg-(arr[i-k]/k)+(arr[i]/k);
            if(avg>=threshold) count++;
        }
        return count;
    }
}