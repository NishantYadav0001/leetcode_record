class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;

        int moves = 0;
        int min = nums[0];
        for(int num : nums){
            min = Math.min(num,min);
        }

        for(int num : nums){
            moves += num - min;
        }

        return moves;
    }
}