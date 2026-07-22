class Solution {
    public int subtractProductAndSum(int n) {
        if(n==0){
            return n;
        }
        int product=1;
        int key=n;
        while(key>0){
            product=product*(key%10);
            key=key/10;
        }
        int sum=0;
        while(n>0){
            sum=sum+(n%10);
            n=n/10;
        }
        return product-sum;
    }
}