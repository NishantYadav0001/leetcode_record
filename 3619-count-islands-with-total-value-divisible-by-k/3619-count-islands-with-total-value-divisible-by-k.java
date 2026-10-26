class Solution {
    int[][] grid;
    boolean [][] vis;
    int n , m;
    int [] dr = {0,0,-1,1};
    int [] dc = {1,-1,0,0};
    public long dfs(int i,int j){
        vis[i][j] = true;
        long sum = grid[i][j];

        for(int k = 0;k<4;k++){
            int ni = i + dr[k];
            int nj = j + dc[k];

            if(Math.min(ni,nj) >= 0 && ni < n && nj < m && !vis[ni][nj] && grid[ni][nj] > 0){
                sum += dfs(ni,nj);
            }
        }
        return sum;
    }
    public int countIslands(int[][] grid, int k) {
        n = grid.length;
        m = grid[0].length;

        vis = new boolean[n][m];
        this.grid = grid;

        int ans = 0;

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(!vis[i][j] && grid[i][j] > 0){
                    long sum = dfs(i,j);

                    if(sum % k == 0) ans++;
                }
            }
        }

        return ans;
    }
}