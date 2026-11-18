class Solution {
    public int minChanges(String s) {
        int n = s.length();

        String zero = "00";
        String one = "11";

        int count = 0;
        for(int i = 0;i<n;i+= 2){
            String temp = s.substring(i,i+2);
            if(temp.equals(zero) || temp.equals(one)) continue;
            else count++;
        }
        return count;
    }
}