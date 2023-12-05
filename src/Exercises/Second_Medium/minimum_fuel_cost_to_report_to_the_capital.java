package Exercises.Second_Medium;
import java.util.*;
//2477 到达首都的最少油耗
public class minimum_fuel_cost_to_report_to_the_capital {
    long ans = 0;
    public long minimumFuelCost(int[][] roads, int seats) {
        int n = roads.length + 1;
        List<Integer>[] lists = new ArrayList[n];
        Arrays.setAll(lists, e -> new ArrayList<Integer>());
        for (int[] road : roads) {
            int a = road[0];
            int b = road[1];
            lists[a].add(b);
            lists[b].add(a);
        }
        dfs(0, -1, lists, seats);
        return ans;
    }

    public int dfs(int cur, int father, List<Integer>[] lists, int seats) {
        int peopleSum = 1;
        for (int next : lists[cur]) {
            if (next != father) {
                peopleSum += dfs(next, cur, lists, seats);
            }
        }
        if (cur != 0) {
            ans += Math.ceil(peopleSum / (double)seats);
        }
        return peopleSum;
    }
}

