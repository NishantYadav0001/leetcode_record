class Solution {
    public int countServers(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                boolean flag = false;
                for (int k = i + 1; k < n; k++) {
                    if (grid[i][j] == 1 && grid[k][j] == 1) {
                        String s = k + "," + j;
                        set.add(s);
                        flag = true;
                    }
                }
                for (int k = j + 1; k < m; k++) {
                    if (grid[i][j] == 1 && grid[i][k] == 1) {
                        String s = i + "," + k;
                        set.add(s);
                        flag = true;
                    }
                }
                if(flag){
                    String s = i + "," + j;
                    set.add(s);
                }
            }
        }

        return set.size();
    }
}