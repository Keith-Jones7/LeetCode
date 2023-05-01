package Exercises.First_Easy;

import java.util.*;

//2011 执行操作后的变量值
public class find_value_pf_variable_after_performing_operations {
    public int finalValueAfterOperations(String[] operations) {
        Map<String, Integer> map = new HashMap<>();
        map.put("--X", -1);
        map.put("X--", -1);
        map.put("++X", 1);
        map.put("X++", 1);

        int ans = 0;
        for (String str : operations) {
            ans += map.get(str);
        }
        return ans;
    }
}
