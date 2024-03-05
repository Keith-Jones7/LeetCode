package Problems.Third_Hard;
import java.util.*;
//2867 统计树中的合法路径数目
public class count_valid_paths_in_a_tree {
    long[][] dp;
    boolean[] notPrime;
    List<List<Integer>> tree = new ArrayList<>();
    public long countPaths(int n, int[][] edges) {
        notPrime = new boolean[n + 1];
        notPrime[0] = true;
        notPrime[1] = true;
        for (int i = 2; i <= n; i++) {
            if (!notPrime[i]) {
                for (int j = 2; j * i <= n; j++) {
                    notPrime[i * j] = true;
                }
            }
        }
        for (int i = 0; i <= n; i++) {
            System.out.println(i + "   " + notPrime[i]);
            tree.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int x = edge[0];
            int y = edge[1];
            tree.get(x).add(y);
            tree.get(y).add(x);
        }
        dp = new long[n + 1][2];
        dfs(1, 0);
        long totalPaths = 0;
        for (int i = 1; i <= n; i++) {
            totalPaths += dp[i][1];
        }
        return totalPaths;
    }

    public void dfs(int node, int parent) {
        dp[node][0] = 1;
        dp[node][1] = notPrime[node] ? 0 : 1;
        for (int child : tree.get(node)) {
            if (child != parent) {
                dfs(child, node);
                dp[node][1] += dp[child][1] + (notPrime[node] ? 0 : dp[child][0]);
                dp[node][0] += dp[child][0];
            }
        }
    }
}
