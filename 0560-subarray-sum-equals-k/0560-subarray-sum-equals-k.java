class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int totalSum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            totalSum += nums[i];
            if(k == totalSum) count++;
            if(map.containsKey(totalSum - k)){
                count += map.get(totalSum-k);
            }

            map.put(totalSum,map.getOrDefault(totalSum,0)+1);
        }

        return count;
    }
}