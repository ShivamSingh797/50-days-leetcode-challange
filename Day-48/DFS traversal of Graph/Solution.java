class Solution {
    public void dfst(int node,ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> res,boolean[] vis){
        vis[node]=true;
        res.add(node);
        for(Integer it:adj.get(node)){
            if(vis[it]==false){
                dfst(it,adj,res,vis);
            }
        }
    }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        int v=adj.size();
        boolean[] vis=new boolean[v+1];
        ArrayList<Integer> res=new ArrayList<>();
        vis[0]=true;
        dfst(0,adj,res,vis);
        return res;
        
    }
}