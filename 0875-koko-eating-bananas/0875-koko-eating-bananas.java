class Solution {
    public boolean check(int limit,int [] piles,int h){
        int n = piles.length;
        int count = 0;

        for(int i = 0;i<n;i++){
            int pile = piles[i];
            int rem = pile % limit;
            int temp = pile/limit;
            if(rem != 0) count++;
            count += temp;
        }
        return count <= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;

        int start = 1;
        int end = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;
        while(start <= end){
            int mid = start + (end-start)/2;

            if(check(mid,piles,h)){
                ans = Math.min(ans,mid);
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }

        return ans;
    }
}