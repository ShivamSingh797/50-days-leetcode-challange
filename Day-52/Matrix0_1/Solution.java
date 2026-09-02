class Triplet{
    int first;
    int second;
    int third;
    Triplet(int f,int s,int t){
        first=f;
        second=s;
        third=t;
    }
}
class Solution {
    public int[][] bfs(int[][] mat,int[][] vis){
        int n=mat.length;
        int m=mat[0].length;
        int[][] res=new int[n][m];
        int[] delRow={-1,0,1,0};
        int[] delCol={0,1,0,-1};
        Queue<Triplet> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    q.add(new Triplet(i,j,0));
                    vis[i][j]=1;
                }
            }
        }
        while(!q.isEmpty()){
            Triplet t=q.poll();
            int row=t.first;
            int col=t.second;
            int dis=t.third;
            res[row][col]=dis;

            for(int i=0;i<4;i++){
                int nrow=row+delRow[i];
                int ncol=col+delCol[i];

                if(nrow>=0 && nrow<n &&
                   ncol>=0 && ncol<m &&
                   vis[nrow][ncol]==0){
                    vis[nrow][ncol]=1;
                    q.add(new Triplet(nrow,ncol,dis+1));
                }
            }
        }
        return res;
    }
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int[][] vis=new int[n][m];
        int [][] ans=bfs(mat,vis);
        return ans;

    }
}