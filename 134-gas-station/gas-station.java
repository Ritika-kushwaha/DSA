class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tgas=0;
        int tcos=0;
        for(int i=0;i<gas.length;i++){
            tgas+=gas[i];
            tcos+=cost[i];
        }
        if(tgas<tcos){
            return -1;
        }
        int sum=0;
        int pos=0;
        for(int i=0;i<gas.length;i++){
            sum+=gas[i]-cost[i];
            if(sum<0){
                sum=0;
                pos=i+1;
            }
        }
        return pos;
    }
}