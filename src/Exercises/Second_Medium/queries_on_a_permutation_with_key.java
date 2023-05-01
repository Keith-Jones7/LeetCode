package Exercises.Second_Medium;

import java.util.*;

//1409 查询带键的排列
public class queries_on_a_permutation_with_key {
    public int[] processQueries(int[] queries, int m) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= m; i++) {
            list.add(i);
        }
        int[] ans = new int[queries.length];
        for(int i = 0; i < queries.length; i++) {
            int num = queries[i];
            ans[i] = list.indexOf(num);
            list.remove(ans[i]);
            list.add(0, num);
        }
        return ans;
    }
}
