class Solution {
    public long maxDifference(int[] nums) {
        int n = nums.length;

        long [] dp = new long[n+2];

        for(int i = n-1;i >= 0;i--){
            int s1 = nums[i];

            long option1 = (s1 % 3 == 0) ? s1 - dp[i+1] : s1 + dp[i+1];
            long option2 = Long.MIN_VALUE;
            if(i + 1 < n){
                long s2 = nums[i] + (long)nums[i+1];

                option2 = (s2 % 3 == 0) ? s2 - dp[i+2] : s2 + dp[i+2];

            }
            dp[i] = Math.max(option1,option2); 
        }

        return dp[0];
    }
}