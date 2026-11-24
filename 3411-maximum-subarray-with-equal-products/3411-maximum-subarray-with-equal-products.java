class Solution {
    public int gcd(int a ,int b){
        while(a % b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return b;
    }
    public int lcm(int a,int b){
        int max = Math.max(a,b);
        int product = 1;
        while((max * product) % a != 0 || (max * product) % b != 0){
            product++;
        }
        return max * product;
    }
    public int maxLength(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i = 0;i<n;i++){
            long product = nums[i];
            int l = nums[i];
            int g = nums[i];
            for(int j = i+1;j<n;j++){
                l = lcm(l,nums[j]);
                g = gcd(g,nums[j]);
                System.out.print(l + " " + g);
                System.out.println("");
                product = product * nums[j];
                if(product == (long)l * (long)g){
                    ans = Math.max(ans , j - i + 1);
                }
                else break;
            }
        }

        return ans;
    }
}