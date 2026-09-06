class Solution {
    List<List<Integer>> arr=new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        
        back(n,k,1,new ArrayList<>());
        return arr;
    }
    private void back(int n,int k,int start, List<Integer> current){
        if(current.size()==k){
            arr.add(new ArrayList<>(current));
            return;
        }
        for(int i=start;i<=n;i++){
            
            current.add(i);
            
            back(n,k,i+1,current);
            current.remove(current.size()-1);
            
        }
    }
}