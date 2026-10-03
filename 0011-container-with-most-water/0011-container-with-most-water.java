class Solution {
    public int maxArea(int[] height) {
        int n = height.length;

        int i = 0;
        int j = n-1;
        int maxArea = 0;
        while(i<j){
            maxArea = Math.max(Math.min(height[i],height[j]) * (j - i), maxArea);

            if(height[i] < height[j]){
                i++;
            }else j--;

            System.out.print(maxArea + " ");
        }
        return maxArea;
    }
}