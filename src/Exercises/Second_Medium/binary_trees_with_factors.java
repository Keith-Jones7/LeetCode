package Exercises.Second_Medium;

import java.util.*;

//823 带因子的二叉树
public class binary_trees_with_factors {
    public int numFactorBinaryTrees(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(arr);
        System.out.println(arr.length);
        int MOD = (int) (1e9 + 7);
        int ans = 0;
        for (int num : arr) {
            map.put(num, 1);
            ans++;
            for (int i = 0; i < arr.length && arr[i] <= Math.sqrt(num); i++) {
                if (num % arr[i] == 0 && map.containsKey(num / arr[i])) {
                    int rootValue = map.get(num);
                    int leftValue = map.get(arr[i]);
                    int rightValue = map.get(num / arr[i]);
                    int count = 0;
                    if (arr[i] == num / arr[i]) {
                        count += (leftValue * rightValue % MOD);
                    }else {
                        count += (2 * leftValue * rightValue % MOD);
                    }

                    ans += count;
                    ans %= MOD;
                    rootValue += count;
                    rootValue %= MOD;
                    map.put(num, rootValue);
                }
            }
        }
        return ans;
    }
}
