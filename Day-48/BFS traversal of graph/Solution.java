class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        int v=adj.size();
        boolean[] vis=new boolean[v+1];
        Queue<Integer> q=new LinkedList<>();
        ArrayList <Integer> res=new ArrayList<>();
        q.add(0);
        vis[0]=true;
        while(q.isEmpty()==false){
            Integer node=q.poll();
            res.add(node);
            for(Integer it:adj.get(node)){
                if(vis[it]==false){
                    vis[it]=true;
                    q.add(it);
                }
            }
        }
        return res;
    }
}