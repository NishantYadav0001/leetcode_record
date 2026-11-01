class Solution {
    public int minMergedInteger(int[] nums) {
        int n = nums.length;

        int min = Integer.MAX_VALUE;

        for(int i = 1;i<n;i+= 2){
            String s = "" + nums[i-1] + "" + nums[i];

            int num = Integer.parseInt(s);
            min = Math.min(num,min);
        }

        return min;
    }
}