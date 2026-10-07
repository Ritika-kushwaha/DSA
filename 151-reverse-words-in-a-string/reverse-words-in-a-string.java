class Solution {
    public String reverseWords(String s) {
        String[] sb=s.trim().split("\\s+");
        int left=0;
        int right=sb.length-1;
        while(left<right){
            String temp=sb[left];
            sb[left]=sb[right];
            sb[right]=temp;
            left++;
            right--;
        }
        StringBuilder res=new StringBuilder();
        for(int i=0;i<sb.length;i++){
            res.append(sb[i]);
            if(i!=sb.length-1) res.append(" ");
        }
        return new String(res);
    }
}