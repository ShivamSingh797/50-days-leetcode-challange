class Pair{
    int first;
    int second;
    Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int cnt=0;
        int[][] vis=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1' && vis[i][j]==0){
                    cnt++;
                    dfs(i,j,vis,grid);
                }
            }
        }
        return cnt;
    }
    // public void bfs(int row, int col, int[][] vis, char[][] grid) {

    //     Queue<Pair> q = new LinkedList<>();

    //     vis[row][col] = 1;
    //     q.add(new Pair(row, col));

    //     int n = grid.length;
    //     int m = grid[0].length;

    //     int[] delRow = {-1, 0, 1, 0};
    //     int[] delCol = {0, 1, 0, -1};
    //     while (!q.isEmpty()) {
    //         Pair current = q.poll();
    //         int r = current.first;
    //         int c = current.second;
    //         for (int i = 0; i < 4; i++) {
    //             int nRow = r + delRow[i];
    //             int nCol = c + delCol[i];
    //             if (nRow >= 0 && nRow < n &&
    //                 nCol >= 0 && nCol < m &&
    //                 vis[nRow][nCol] == 0 &&
    //                 grid[nRow][nCol] == '1') {

    //                 vis[nRow][nCol] = 1;
    //                 q.add(new Pair(nRow, nCol));
    //             }
    //         }
    //     }
    // }

    public void dfs(int row,int col,int[][] vis,char[][] grid){
        vis[row][col]=1;
        int n=grid.length;
        int m=grid[0].length;

        int[] rows={-1,0,1,0};
        int[] cols={0,1,0,-1};

        for(int i=0;i<4;i++){
            int nrow=row+rows[i];
            int ncol=col+cols[i];

            if(nrow>=0 && nrow<n &&
               ncol>=0 && ncol<m &&
               vis[nrow][ncol]==0 && grid[nrow][ncol]=='1'){
                dfs(nrow,ncol,vis,grid);
               }
        }

    }
}