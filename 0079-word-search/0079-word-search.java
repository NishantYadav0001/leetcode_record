class Solution {
    int [] dr = {0,0,-1,1};
    int [] dc = {1,-1,0,0};
    public boolean dfs(int i , int j,char [][] board,String word , boolean [][]vis,int k){
        vis[i][j] = true;
        
        for(int a = 0;a<4;a++){
            int ni = i + dr[a];
            int nj = j + dc[a];

            if(Math.min(ni,nj) >= 0 && ni < board.length && nj < board[0].length && board[ni][nj] == word.charAt(k) && !vis[ni][nj]){
                if(k == word.length()-1) return true;
                if(dfs(ni,nj,board,word,vis,k+1)) return true;
          
            }
            
        }
        vis[i][j] = false;
        return false;
    }
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        boolean [][] vis = new boolean[n][m];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(board[i][j] == word.charAt(0) && word.length() == 1) return true;
                if(board[i][j] == word.charAt(0)){
                    if(dfs(i,j,board,word,vis,1)){
                        return true;
                    }
                }
            }
        }

        return false;
    }
}