package Exercises.Second_Medium;
//1334 阈值距离内邻居最少的城市
public class find_the_city_with_the_smallest_number_of_neighbors_at_a_threshold_distance {
    private final int INF = 100000000;
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] dist = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dist[i][j] = INF;
            }
        }
        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            int weight = edge[2];
            dist[from][to] = weight;
            dist[to][from] = weight;
        }
        int minCnt = INF, cityNum = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    dist[j][k] = Math.min(dist[j][k], dist[j][i] + dist[i][k]);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (i != j && dist[i][j] <= distanceThreshold) {
                    cnt++;
                }
            }
            if (cnt < minCnt) {
                minCnt = cnt;
                cityNum = i;
            }else if (cnt == minCnt) {
                cityNum = i;
            }
        }
        return cityNum;
    }
}
