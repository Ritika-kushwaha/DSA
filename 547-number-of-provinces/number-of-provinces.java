class Solution {

    public int findCircleNum(int[][] isConnected) {

        int v = isConnected.length;
        boolean[] vis = new boolean[v];
        int count = 0;

        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                dfs(i, isConnected, vis);
                count++;
            }
        }

        return count;
    }

    void dfs(int node, int[][] isConnected, boolean[] vis) {

        vis[node] = true;

        for (int neighbour = 0; neighbour < isConnected.length; neighbour++) {

            if (isConnected[node][neighbour] == 1 && !vis[neighbour]) {
                dfs(neighbour, isConnected, vis);
            }
        }
    }
}