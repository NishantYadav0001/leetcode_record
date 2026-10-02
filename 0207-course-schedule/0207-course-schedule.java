class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int len = prerequisites.length;
        if(len == 0) return true;
        int [] inDegree = new int[numCourses];
        List<List<Integer>> adj = new ArrayList<>();

        for(int i = 0;i<numCourses;i++) adj.add(new ArrayList<>());
        for(int i = 0;i<prerequisites.length;i++){
            int u = prerequisites[i][0];
            int v = prerequisites[i][1];

            adj.get(v).add(u);
            inDegree[u]++;
        }
        boolean [] visit = new boolean[numCourses];
        Queue<Integer> q = new ArrayDeque<>();
        for(int i = 0;i<numCourses;i++){
            if(inDegree[i] == 0){
                q.add(i);
                visit[i] = true;
            }
        }

        while(!q.isEmpty()){
            int u = q.poll();
            visit[u] = true;
            for(int v : adj.get(u)){
                inDegree[v]--;
                if(inDegree[v] == 0){
                    q.add(v);
                }
            }
        }
        for(int i = 0;i<numCourses;i++){
            if(!visit[i]) return false;
        }
        return true;
    }
}