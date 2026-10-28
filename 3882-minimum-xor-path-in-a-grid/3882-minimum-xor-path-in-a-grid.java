class Solution {
    public int minCost(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int xor_k = 1024;
        boolean[][][] dp = new boolean[m][n][xor_k];

        dp[0][0][grid[0][0]] = true;

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){

                for(int k = 0;k<xor_k;k++){
                    if(i>0 && dp[i-1][j][k]){
                        dp[i][j][k ^ grid[i][j]] = true;
                    }
                    if(j > 0 && dp[i][j-1][k]){
                        dp[i][j][k ^ grid[i][j]] = true;
                    }
                }
            }
        }

        for(int k = 0;k<xor_k;k++){
            if(dp[m-1][n-1][k]) return k;
        }
        return 0;
    }
}