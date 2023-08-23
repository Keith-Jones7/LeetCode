package Exercises.Third_Hard;
//1782 统计点对的数目
import java.util.*;

public class count_pairs_of_nodes {
    public int[] countPairs(int n, int[][] edges, int[] queries) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] cnt = new int[n + 1];
        for (int[] edge : edges) {
            int x = Math.max(edge[0], edge[1]);
            int y = Math.min(edge[0], edge[1]);
            int key = (x << 16) + y;
            map.put(key, map.getOrDefault(key, 0) + 1);
            cnt[x]++;
            cnt[y]++;
        }
        int[] clone = cnt.clone();
        int[] ans = new int[queries.length];
        Arrays.sort(clone);
        for (int i = 0; i < queries.length; i++) {
            int query = queries[i];
            int left = 1, right = n;
            int sum = 0;
            while (left < right) {
                if (clone[left] + clone[right] <= query) {
                    left++;
                }else {
                    sum += (right - left);
                    right--;
                }
            }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int key = entry.getKey();
                int val = entry.getValue();
                int x = key >> 16;
                int y = key - (x << 16);
                if (cnt[x] + cnt[y] > query && cnt[x] + cnt[y] - val <= query) {
                    sum--;
                }
            }
            ans[i] = sum;
        }
        return ans;
    }
}
