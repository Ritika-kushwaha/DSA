class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int v=rooms.size();





        boolean[] vis=new boolean[v];
        dfs(0,rooms,vis);
        for (boolean room : vis) {
            if (!room) {
                return false;
            }
        }

        return true;
    }
    void dfs(int node, List<List<Integer>> rooms,boolean[] vis){
        vis[node]=true;

        for(int neighbour:rooms.get(node)){
            if(!vis[neighbour]){
                dfs(neighbour,rooms,vis);
            }
            
        }
    }
}