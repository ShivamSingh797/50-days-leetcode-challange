class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length;
        int m=image[0].length;

        int[][] clone=image;
        int initialColor=image[sr][sc];
        int[] delRow={-1,0,1,0};
        int[] delCol={0,1,0,-1};
        dfs(sr,sc,clone,image,initialColor,color,delRow,delCol);
        return clone;
    }
    public void dfs(int row,int col,int[][] clone,int[][] image,int initialColor,int color,int[] delRow,int[] delCol){
        clone[row][col]=color;
        int n=image.length;
        int m=image[0].length;

        for(int i=0;i<4;i++){
            int nrow=row+delRow[i];
            int ncol=col+delCol[i];
            if(nrow>=0 && nrow<n &&
               ncol>=0 && ncol<m &&
               image[nrow][ncol]==initialColor && clone[nrow][ncol]!=color){
                dfs(nrow,ncol,clone,image,initialColor,color,delRow,delCol);
               }
        }
    }
}