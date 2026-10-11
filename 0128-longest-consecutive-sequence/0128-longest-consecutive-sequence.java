class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Set<Integer> set = ConcurrentHashMap.newKeySet();

        for(int i : nums){
            set.add(i);
        }

        int max = 0;
        for(int i : set){
            int tempmax = 1;
            int val = i;
            int temp = val;
            while(set.contains(val+1)){
                tempmax++;
                val = val + 1;
                set.remove(val);
            }
            val = temp;
            while(set.contains(val-1)){
                tempmax++;
                val = val - 1;
                set.remove(val);
            }
            max = Math.max(max,tempmax);
        }
        return max;
    }
}