class Solution {
    public int uniquePaths(int[][] grid) {
        int n = grid.length , m = grid[0].length;

        if(n == 1 && m == 1) return 1;
        int mod = 1000000007;
        int [][][] dp = new int[n][m][2];

        if(m > 1) dp[0][1][0] = 1;
        if(n > 1) dp[1][0][1] = 1;

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){

                if((i == 0 && j == 0) || (i == 0 && j == 1) || (i == 1 && j == 0)) continue;

                if(j>0){
                    if(grid[i][j-1] == 0) dp[i][j][0] = (dp[i][j-1][0] + dp[i][j-1][1]) % mod;
                    else dp[i][j][0] = dp[i][j-1][1]; 
                }

                if(i > 0){
                    if(grid[i-1][j] == 0){
                        dp[i][j][1] = (dp[i-1][j][0] + dp[i-1][j][1]) % mod;
                    }
                    else dp[i][j][1] = dp[i-1][j][0];
                }
            }
        }

        return (dp[n-1][m-1][0] + dp[n-1][m-1][1]) % mod;
    }
}