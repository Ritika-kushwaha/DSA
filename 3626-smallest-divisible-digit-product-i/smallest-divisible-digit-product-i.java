class Solution {
    public int smallestNumber(int n, int t) {
        int product=1;
        while(n!=0){

        int temp=n;
        while(temp!=0){
            product=product*(temp%10);
            temp=temp/10;
        }
        temp=n;
        if(product%t==0){
            break;
        }
        product=1;
        n=n+1;
        }
        return n;

    }
}