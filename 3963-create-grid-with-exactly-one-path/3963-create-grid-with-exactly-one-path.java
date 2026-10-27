class Solution {
    public String[] createGrid(int m, int n) {
        String [] grid = new String[m];

        for(int i = 0;i<m;i++){
            if(i == m-1){
                StringBuilder temp = new StringBuilder();
                for(int j = 0;j<n;j++){
                    temp.append('.');
                }
                grid[i] = temp.toString();
            }
            else{
                StringBuilder temp = new StringBuilder();
                temp.append('.');
                for(int j = 1;j<n;j++){
                    temp.append('#');
                }
                grid[i] = temp.toString();
            }
        }
        return grid;
    }
}