class Solution {
    boolean [][] vis;
    int[][] grid;
    int n;
    int m;
    int [] dr = {0,0,-1,1};
    int [] dc = {1,-1,0,0};
    public void dfs(int i,int j){
        vis[i][j] = true;

        for(int k = 0;k<4;k++){
            int ni = i + dr[k];
            int nj = j + dc[k];

            if(Math.min(ni,nj) >= 0 && ni < n && nj < m && !vis[ni][nj] && grid[ni][nj] == 0){
                dfs(ni,nj);
            }
        }
    }
    public int closedIsland(int[][] grid) {

        n = grid.length;
        m = grid[0].length;
        this.grid = grid;
        vis = new boolean[n][m];

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(!vis[i][j] && (i == 0 || j == 0 || i == n-1 || j == m-1) && grid[i][j] == 0){
                    dfs(i,j);
                }
            }
        }

        int count = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(!vis[i][j] && grid[i][j] == 0){
                    dfs(i,j);
                    count++;
                }
            }
        }
        return count;
    }
}