package Exercises.Second_Medium;
import java.util.*;
//310 最小高度树
public class minimum_height_trees {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> ans = new ArrayList<>();
        if(n == 1) {
            ans.add(0);
            return ans;
        }
        List<Integer>[] adj = new List[n];
        for(int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }
        for(int[] edge : edges) {
            adj[edge[0]].add(edge[1]);
            adj[edge[1]].add(edge[0]);
        }
        int[] parent = new int[n];
        Arrays.fill(parent, -1);
        int x = findFarthest(0, parent, adj);
        int y = findFarthest(x, parent, adj);
        List<Integer> path = new ArrayList<>();
        parent[x] = -1;
        while (y != -1) {
            path.add(y);
            y = parent[y];
        }
        int m = path.size();
        if(m % 2 == 0) {
            ans.add(path.get(m / 2 - 1));
        }
        ans.add(path.get(m / 2));
        return ans;
    }
    public int findFarthest(int start, int[] parent, List<Integer>[] adj) {
        int n = adj.length;
        Queue<Integer> queue = new ArrayDeque<>();
        boolean[] visit = new boolean[n];
        queue.add(start);
        visit[start] = true;
        int node = -1;
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            node = cur;
            for(int end : adj[cur]) {
                if(!visit[end]) {
                    visit[end] = true;
                    parent[end] = cur;
                    queue.add(end);
                }
            }
        }
        return node;
    }
    public static void main(String[] args) {

    }
}

