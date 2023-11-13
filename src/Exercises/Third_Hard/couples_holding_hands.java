package Exercises.Third_Hard;
import java.util.*;
//765 情侣牵手
public class couples_holding_hands {
    public int minSwapsCouples(int[] row) {
        int len = row.length;
        int N = len / 2;

        // 创建一个图
        List<Integer>[] graph = new List[N];
        for (int i = 0; i < N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < len; i += 2) {
            int u = row[i] / 2;
            int v = row[i + 1] / 2;
            if (u != v) {
                graph[u].add(v);
                graph[v].add(u);
            }
        }

        // 查找图中的连通分量
        boolean[] visited = new boolean[N];
        int swaps = 0;
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                int size = dfs(graph, i, visited);
                swaps += size - 1; // 在一个连通分量中需要的交换次数
            }
        }

        return swaps;
    }

    private int dfs(List<Integer>[] graph, int u, boolean[] visited) {
        visited[u] = true;
        int size = 1;
        for (int v : graph[u]) {
            if (!visited[v]) {
                size += dfs(graph, v, visited);
            }
        }
        return size;
    }
}
