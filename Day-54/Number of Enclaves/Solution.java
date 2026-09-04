class Pair{
    int first;
    int second;
    Pair(int f,int s){
        first=f;
        second=s;
    }
}
class Solution {
    public void bfs(int[][] grid,int[][] ch,int r,int c){
        int n=grid.length;
        int m=grid[0].length;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(r,c));
        ch[r][c]=0;
        int[] delRow={-1,0,1,0};
        int[] delCol={0,1,0,-1};

        while(!q.isEmpty()){
            Pair p=q.poll();
            int row=p.first;
            int col=p.second;

            for(int i=0;i<4;i++){
                int nrow=row+delRow[i];
                int ncol=col+delCol[i];

                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]==1 && ch[nrow][ncol]==1){
                    q.add(new Pair(nrow,ncol));
                    ch[nrow][ncol]=0;
                }
            }
        }
    }
    public int numEnclaves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        int[][] c=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                c[i][j]=grid[i][j];
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(i == 0 || i == n-1 || j == 0 || j == m-1){
                    if(grid[i][j]==1){
                        bfs(grid,c,i,j);
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(c[i][j]==1){
                    count++;
                }
            }
        }
        return count;
    }
}