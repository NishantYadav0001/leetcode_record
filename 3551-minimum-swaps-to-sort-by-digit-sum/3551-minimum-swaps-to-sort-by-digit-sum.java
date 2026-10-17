class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;

        int [][] sum = new int[n][3];

        for(int i = 0;i<n;i++){
            int num = nums[i];
            int s = 0;
            while(num > 0){
                s += num % 10;
                num = num/10;
            }

            sum[i][0] = s;
            sum[i][1] = nums[i];
            sum[i][2] = i;
        }

        Arrays.sort(sum,(a,b) -> a[0] != b[0] 
                    ? Integer.compare(a[0],b[0])
                    : Integer.compare(a[1],b[1]));

        boolean [] vis = new boolean[n];

        int swaps = 0;
        for(int i = 0;i<n;i++){
            if(vis[i] || sum[i][2] == i) continue;

            int j = i,len = 0;

            while(!vis[j]){
                vis[j] = true;
                j = sum[j][2];
                len++;
            }
            swaps += len - 1;
        }

        return swaps;
    }
}