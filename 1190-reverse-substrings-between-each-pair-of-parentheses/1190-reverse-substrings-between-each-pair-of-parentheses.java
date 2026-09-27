class Solution {
    public String reverseParentheses(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();

        for(int i = 0;i<n;i++){
            char ch = s.charAt(i);

            if(ch == ')'){
                StringBuilder sb = new StringBuilder();
                while(st.peek() != '('){
                    sb.append(st.pop());
                }
                st.pop();
                int j = 0;
                while(j<sb.length()){
                    st.push(sb.charAt(j));
                    j++;
                }
                continue;
            }
            st.push(ch);
        }
        StringBuilder result = new StringBuilder();
        while(!st.isEmpty()){
            result.append(st.pop());
        }
        result.reverse();
        return result.toString();
    }
}