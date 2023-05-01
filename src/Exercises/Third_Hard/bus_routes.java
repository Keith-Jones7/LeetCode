package Exercises.Third_Hard;
import java.util.*;
//815 公交线路
public class bus_routes {
    int sum = 0;
    boolean flag = false;
    public int numBusesToDestination(int[][] routes, int source, int target) {
        Set<Integer>[] sets = new Set[routes.length];
        boolean[] visited = new boolean[routes.length];
        for (int i = 0; i < routes.length; i++) {
            Set<Integer> set = new HashSet<>();
            visited[i] = false;
            for (int j = 0; j < routes[i].length; j++) {
                set.add(routes[i][j]);
            }
            sets[i] = set;
        }
        sum = routes.length + 1;
        BFS(visited, 0, source, target, sets);
        if (sum == routes.length + 1) {
            return -1;
        }
        return sum;
    }

    public void BFS(boolean[] visited, int sumVisited, int source, int target, Set<Integer>[] sets) {
        if (source == target) {
            flag = true;
            sum = Math.min(sum, sumVisited);
            return;
        }
        if (sumVisited == visited.length) {
            return;
        }
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i] && sets[i].contains(source)) {
                sets[i].remove(source);
                visited[i] = true;
                sumVisited++;
                for (Integer ints : sets[i]) {
                    BFS(visited, sumVisited, ints, target, sets);
                }
                sets[i].add(source);
                visited[i] = false;
                sumVisited--;
            }
        }
    }
}
