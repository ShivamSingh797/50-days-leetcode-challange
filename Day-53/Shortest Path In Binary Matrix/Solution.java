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
    public int bfs(int[][] grid){
        int n=grid.length;
        int m=grid[0].length;
        if (grid[0][0] != 0 || grid[n - 1][m - 1] != 0) {
            return -1;
        }
        Queue<Triplet> q=new LinkedList<>();
        q.add(new Triplet(0,0,1));
        while(!q.isEmpty()){
            Triplet t=q.poll();
            int row=t.first;
            int col=t.second;
            int dis=t.third;

            if (row == n - 1 && col == m - 1) {
                return dis;
            }
            for(int i=-1;i<=1;i++){
                for(int j=-1;j<=1;j++){
                    if (i == 0 && j == 0) 
                        continue;
                    int nrow=row+i;
                    int ncol=col+j;

                    if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]==0){
                        grid[nrow][ncol] = 1;
                        q.add(new Triplet(nrow,ncol,dis+1));
                    }
                }
            }
        }
        return -1;
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int ans=bfs(grid);
        return ans;
    }
}