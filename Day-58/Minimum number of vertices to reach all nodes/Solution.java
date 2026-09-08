class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        ArrayList<Integer> adj=new ArrayList<>();
        int[] indegree =new int[n];

        int m=edges.size();
        for(int i=0;i<m;i++){
            int v=edges.get(i).get(1);
            indegree[v]++;
        }
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                adj.add(i);
            }
        }
        return adj;
    }
}