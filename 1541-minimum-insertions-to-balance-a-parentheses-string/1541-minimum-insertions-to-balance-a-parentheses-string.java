
class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        int count = 0;

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                st.push(ch);
            } 
            else {
                if (i + 1 < n && s.charAt(i + 1) == ')') {
                    if (!st.isEmpty()) {
                        st.pop();
                    } else {
                        count++;
                    }
                    i++;
                } 
                else {
                    if (!st.isEmpty()) {
                        st.pop();
                    } else {
                        count++;
                    }
                    count++;
                }
            }
        }
        count += st.size() * 2;

        return count;
    }
}
