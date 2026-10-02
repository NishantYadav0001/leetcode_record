class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();

        if(m > n) return "";    
        String ans = s;
        boolean iscontain = false;
        int [] have = new int[128];
        int [] need = new int[128];
        int satisfy = 0;

        for(int i = 0;i<m;i++){
            if(have[t.charAt(i)] == 0) satisfy++;
            have[t.charAt(i)]++;
        }

        int i = 0;
        int j = 0;
        int totalHave = 0;
        while(j<n){
            int ch = s.charAt(j);
            need[ch]++;
            if(need[ch] == have[ch]) totalHave++;

            while(totalHave == satisfy && i <= j){
                iscontain = true;
                if(s.substring(i,j+1).length() < ans.length()) ans = s.substring(i,j+1);
                int ch1 = s.charAt(i);
                if(need[ch1] == have[ch1]) totalHave--;
                need[ch1]--;
                i++;
            }
           
            j++;
        }
        return iscontain ? ans : "";
    }
}