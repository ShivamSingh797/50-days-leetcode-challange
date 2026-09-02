class Pair {
    int first;
    int second;

    Pair(int f, int s) {
        first = f;
        second = s;
    }
}

class Solution {
    int count = 0;
    public int[][] bfs(int[][] grid, int[][] vis) {
        int n = grid.length;
        int m = grid[0].length;
        int[] delRow = {-1, 0, 1, 0};
        int[] delCol = {0, 1, 0, -1};
        Queue<Pair> q = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {

                if(grid[i][j] == 2) {
                    q.add(new Pair(i, j));
                    vis[i][j] = 1;
                }
            }
        }
        while(!q.isEmpty()) {
            int size = q.size();
            boolean rotten = false;
            for(int k = 0; k < size; k++) {
                Pair p = q.poll();
                int row = p.first;
                int col = p.second;
                for(int i = 0; i < 4; i++) {
                    int nrow = row + delRow[i];
                    int ncol = col + delCol[i];
                    if(nrow >= 0 && nrow < n &&
                       ncol >= 0 && ncol < m &&
                       vis[nrow][ncol] == 0 &&
                       grid[nrow][ncol] == 1) {

                        vis[nrow][ncol] = 1;
                        grid[nrow][ncol] = 2;

                        q.add(new Pair(nrow, ncol));

                        rotten = true;
                    }
                }
            }
            if(rotten) {
                count++;
            }
        }
        return grid;
    }
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        int[][] ans = bfs(grid, vis);
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {

                if(ans[i][j] == 1) {
                    return -1;
                }
            }
        }

        return count;
    }
}