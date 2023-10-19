package Exercises.Second_Medium;

import java.util.*;
import java.util.HashMap;

//1726 同积元组
public class tuple_with_same_product {
    public int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int pro = nums[i] * nums[j];
                int cnt = map.getOrDefault(pro, 0);
                ans += 8 * cnt;
                map.put(pro, cnt + 1);
            }
        }
        return ans;
    }
}
