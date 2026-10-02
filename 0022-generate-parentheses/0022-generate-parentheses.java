class Solution {
    List<String> result;
    public void f(int i,int n,int front,int back,String temp){
        if(temp.length() == 2*n){
            result.add(temp);
            return;
        }

        if(front < n){
            f(i+1,n,front + 1,back,temp + "(");
        }
        if(front > back){
            f(i+1,n,front,back+1,temp + ")");
        }

    }
    public List<String> generateParenthesis(int n) {
        result = new ArrayList<>();

        f(0,n,0,0,"");

        return result;
    }
}