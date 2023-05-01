import java.util.Arrays;
import java.util.Comparator;

public class Main {
}
class Solution {
    public int minimumCost(int[] start, int[] target, int[][] specialRoads) {
        int n = specialRoads.length;
        int[][] dist = new int[n + 2][n + 2];
        for (int[] dists : dist) {
            Arrays.fill(dists, Integer.MAX_VALUE);
        }
        dist[0][n + 1] = Math.abs(start[0] - target[0]) + Math.abs(start[1] - target[1]);
        dist[n + 1][0] = dist[0][n + 1];
        for (int i = 0; i < n; i++) {
            dist[0][i + 1] = getDist(start[0], start[1], specialRoads[i][0], specialRoads[i][1]);
            dist[i + 1][n + 1] = getDist(specialRoads[i][2], specialRoads[i][3], target[0], target[1]);
            for (int j = 0; j < n; j++)  {
                dist[i + 1][j + 1] = getDist(specialRoads[i][2], specialRoads[i][3],
                        specialRoads[j][0], specialRoads[j][1]);
            }
        }
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n + 2; i++) {
                for (int j = 0; j < n + 2; j++) {
                    dist[i][j] = Math.min(dist[i][j], dist[i][k + 1] + dist[k + 1][j]
                    + specialRoads[k][4]);
                }
            }

        }
        return dist[0][n + 1];
    }
    public int getDist(int ox, int oy, int dx, int dy) {
        return Math.abs(ox - dx) + Math.abs(oy - dy);
    }
}

