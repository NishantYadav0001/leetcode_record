class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;

        int [] dp = new int[n];
        Arrays.fill(dp,1);
        int max = 1;
        for(int i = 1;i<n;i++){
            if(nums[i] > nums[i-1]){
                dp[i] = dp[i-1] + 1;
            }
            max = Math.max(dp[i] , max);
        }

        Arrays.fill(dp,1);
        int decre = 1;
        for(int i = 1;i<n;i++){
            if(nums[i] < nums[i-1]){
                dp[i] = dp[i-1] + 1;
            }
            decre = Math.max(dp[i],decre);
        }

        return Math.max(decre,max);
    }
}