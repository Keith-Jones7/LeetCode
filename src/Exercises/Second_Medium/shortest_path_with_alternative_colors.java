package Exercises.Second_Medium;

import java.util.*;

//1129 颜色交替的最短路径
public class shortest_path_with_alternative_colors {
    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        int[] ans_red = new int[n];
        int[] ans_blue = new int[n];
        Arrays.fill(ans_red, Integer.MAX_VALUE);
        Arrays.fill(ans_blue, Integer.MAX_VALUE);
        ans_red[0] = 0;
        ans_blue[0] = 0;
        int[][] map_red = new int[n][n];
        int[][] map_blue = new int[n][n];
        for (int[] redEdge : redEdges) {
            map_red[redEdge[0]][redEdge[1]] = 1;
        }
        for (int[] blueEdge : blueEdges) {
            map_blue[blueEdge[0]][blueEdge[1]] = -1;
        }
        int len = 1;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 1});
        queue.add(new int[]{0, -1});
        while (!queue.isEmpty() && len < 2 * n) {
            System.out.println(len + "  " + queue.size());
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] cur = queue.poll();
                assert cur != null;
                if (cur[1] == 1) {
                    for (int j = 0; j < n; j++) {
                        if (map_blue[cur[0]][j] != 0) {
                            if (len < ans_blue[j]) {
                                ans_blue[j] = len;
                                queue.add(new int[]{j, -1});
                            }
                        }
                    }
                }else {
                    for (int j = 0; j < n; j++) {
                        if (map_red[cur[0]][j] != 0) {
                            if (len < ans_red[j]) {
                                ans_red[j] = len;
                                queue.add(new int[]{j, 1});
                            }
                        }
                    }
                }
            }
            len++;
        }
        for (int i = 0; i < n; i++) {
            if (ans_blue[i] < ans_red[i]) {
                ans_red[i] = ans_blue[i];
            }else if (ans_red[i] == Integer.MAX_VALUE) {
                ans_red[i] = -1;
            }
        }
        return ans_red;
    }
}
