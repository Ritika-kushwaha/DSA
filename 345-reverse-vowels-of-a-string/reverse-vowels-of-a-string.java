class Solution {
    public String reverseVowels(String s) {
        char[] arr= s.toCharArray();
        int i=0;
        int right=arr.length-1;
        while(i<right){
            
            if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u'|| arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U'){
                if(arr[right]=='a' || arr[right]=='e' || arr[right]=='i' || arr[right]=='o' || arr[right]=='u' || arr[right]=='A' || arr[right]=='E' || arr[right]=='I' || arr[right]=='O' || arr[right]=='U'){
                    char temp=arr[i];
                    arr[i]=arr[right];
                    arr[right]=temp;
                    i++;
                    right--;
                }else{ right--;}
            }else{
                i++;
            }
        }
        return new String(arr);
    }
}