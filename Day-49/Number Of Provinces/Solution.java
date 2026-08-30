class Solution {
    public ArrayList<ArrayList<Integer>>  conversionMatrixToList(int [][] isConnected){
        int n=isConnected.length;
        boolean[] vis=new boolean[n+1];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (isConnected[i][j] == 1 && i != j) {
                    adj.get(i).add(j);
                }
            }
        }
        return adj;
    }
    public void dfs(int node,ArrayList<ArrayList<Integer>> adj,boolean[] vis,ArrayList<Integer> ls){
        vis[node]=true;
        ls.add(node);
        for(Integer it:adj.get(node)){
            if(vis[it]==false){
                dfs(it,adj,vis,ls);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int s=isConnected.length;
        ArrayList<ArrayList<Integer>> adj = conversionMatrixToList(isConnected);
        boolean[] vis=new boolean[s+1];
        ArrayList<Integer> ls=new ArrayList<>();
        int count = 0;
        for (int i=0;i<s; i++) {
            if (vis[i] == false) {
                dfs(i, adj, vis, ls);
                count++;
            }
        }
        return count;
    }
}