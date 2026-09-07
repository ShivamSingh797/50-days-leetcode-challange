class Solution {
    ArrayList<Integer> arr = new ArrayList<>();
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        int[] vis = new int[n];
        int[] pathVis = new int[n];
        for(int i = 0; i < n; i++){
            if(dfs(i, graph, vis, pathVis)){
                arr.add(i);
            }
        }
        Collections.sort(arr);
        return arr;
    }
    public boolean dfs(int node,int[][] graph,int[] vis,int[] pathVis){
        vis[node] = 1;
        pathVis[node] = 1;
        for(int i = 0; i < graph[node].length; i++){
            int it = graph[node][i];
            if(pathVis[it] == 1){
                return false;
            }
            if(vis[it] == 0){
                if(dfs(it, graph, vis, pathVis) == false){
                    return false;
                }
            }
        }
        pathVis[node] = 0;
        return true;
    }
}