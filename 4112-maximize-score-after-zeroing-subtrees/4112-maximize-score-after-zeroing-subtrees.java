
class Solution {
    long[] sum;
    List<List<Integer>> adj;
    int[] score;

    public long dfs(int root, int[] op) {
        long total = score[root];

        long min = Long.MAX_VALUE;
        long childSum = 0;

        for (int v : adj.get(root)) {
            long val = dfs(v, op);
            total += val;
            childSum += val;
            min = Math.min(min, val);
        }

        if (adj.get(root).size() > 0) {
            if (op[root] == 1) {
                total -= min;
            } else {
                total -= Math.min(0, min);
            }
        }

        return sum[root] = total;
    }

    public int maxScore(int[] parent, int[] op, int[] score) {
        int n = parent.length;

        adj = new ArrayList<>();
        sum = new long[n];
        this.score = score;

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 1; i < n; i++) {
            adj.get(parent[i]).add(i);
        }

        return (int) dfs(0, op);
    }
}
