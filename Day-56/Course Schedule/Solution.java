class Solution {
    public ArrayList<ArrayList<Integer>> conversion(int numCourses,int[][] num){
        int n = numCourses;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < num.length; i++){
            int a = num[i][0];
            int b = num[i][1];
            adj.get(b).add(a);
        }
        return adj;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] vis=new int[numCourses];
        int[] pathVis=new int[numCourses];
        ArrayList<ArrayList<Integer>> arr=conversion(numCourses,prerequisites);
        for(int i=0;i<numCourses;i++){
            if(vis[i]==0){
                if(dfs(i,arr,vis,pathVis)==true){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean dfs(int s,ArrayList<ArrayList<Integer>> adj,int[] vis,int[] pathVis){
        vis[s]=1;
        pathVis[s]=1;

        for(int it:adj.get(s)){
            if(vis[it]==0){
                if(dfs(it,adj,vis,pathVis)==true){
                    return true;
                }
            }else if(pathVis[it]==1){
                return true;
            }
        }
        pathVis[s]=0;
        return false;
    }
}