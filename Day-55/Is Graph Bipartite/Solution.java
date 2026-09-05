class Solution {
    public boolean isBipartite(int[][] graph){
        int n=graph.length;
        int[] vis=new int[n];
        Arrays.fill(vis,-1);

        for(int i=0;i<n;i++){
            if(vis[i]==-1){
                Queue<Integer> q=new LinkedList<>();
                q.add(i);
                vis[i]=0;
                while(!q.isEmpty()){
                    int node=q.poll();
                    for(Integer it:graph[node]){
                        if(vis[it]==-1){
                            vis[it]=1-vis[node];
                            q.add(it);
                        }
                        else if(vis[it]==vis[node]){
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }
}
