class Solution {
    public void dfs(char[][] board,char[][] ch,int row,int col){
        int n=board.length;
        int m=board[0].length;
        ch[row][col]='O';
        int[] delRow={-1,0,1,0};
        int[] delCol={0,1,0,-1};

        for(int i=0;i<4;i++){
            int nrow=row+delRow[i];
            int ncol=col+delCol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && board[nrow][ncol]=='O' && ch[nrow][ncol]=='X'){
                dfs(board,ch,nrow,ncol);
            }
        }
    }
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        char[][] c=new char[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                c[i][j]='X';
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(i == 0 || i == n-1 || j == 0 || j == m-1){
                    if(board[i][j]=='O'){
                        dfs(board,c,i,j);
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                board[i][j] = c[i][j];
            }
        }
    }
}