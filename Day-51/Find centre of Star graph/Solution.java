class Solution {
    public int findCenter(int[][] edges) {
        //solution 1


        // int n=edges.length;
        // int[] res=new int[n+2];
        // for(int i=0;i<n;i++){
        //     int a=edges[i][0];
        //     int b=edges[i][1];

        //     res[a]++;
        //     res[b]++;
        // }
        // for(int i=1;i<=n+1;i++){
        //     if(res[i]==n){
        //         return i;
        //     }
        // }
        // return -1;

        //Optimal solution

        if(edges[0][0]==edges[1][0] || edges[0][0]==edges[1][1]){
            return edges[0][0];
        }
        return edges[0][1];
    }
}