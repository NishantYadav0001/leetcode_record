class Solution {
    public String digitSum(String s, int k) {

        StringBuilder sb = new StringBuilder(s);
        while(sb.length() > k){
            int n = sb.length();
            StringBuilder temp = new StringBuilder();
            for(int i = 0;i<n;i += k){
                int sum = 0;
                for(int j = i;j<i+k && j<n;j++){
                    int ch = (int)(sb.charAt(j) - '0');
                    sum += ch;
                }
                temp.append(sum);   
            }
            sb = temp;
        } 
        return sb.toString();
    }
}