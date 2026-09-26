class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int i = 0;
        int j = n-1;
        while(i<j){
            char ch = Character.toLowerCase(s.charAt(i));
            char ch1 = Character.toLowerCase(s.charAt(j));

            if(!((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'))){
                i++;
                continue;
            }
            if(!((ch1 >= 'a' && ch1 <= 'z') || (ch1 >= '0' && ch1 <= '9'))){
                j--;
                continue;
            }
            if(ch != ch1){
                return false;
            }
            System.out.print(s.charAt(i)+" ");
            i++;
            j--;
        }

        return true;
    }
}