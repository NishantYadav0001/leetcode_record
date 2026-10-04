class Solution {
    public int minRotations(String s) {
        int n = s.length();

        int prev = 0;
        int ans = 0;
        for(int i = 0;i<n;i++){
            int ch = s.charAt(i) - '0';
            int temp = Integer.MAX_VALUE;
            if(ch < prev){
                temp = ch + 10 - prev;
            }
            else temp = prev + 10 - ch;
            temp = Math.min(temp,Math.abs(prev - ch));
            ans += temp;
            prev = ch;
        }
        return ans;
    }
}