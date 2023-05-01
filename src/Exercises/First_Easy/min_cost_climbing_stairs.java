package Exercises.First_Easy;
//746 使用最小花费爬楼梯
public class min_cost_climbing_stairs {
    public int minCostClimbingStairs(int[] cost) {
        if(cost.length == 1) {
            return cost[0];
        }
        if(cost.length == 2) {
            return Math.min(cost[0], cost[1]);
        }
        int fn_2 = cost[0];
        int fn_1 = cost[1];
        int fn = 0;
        for(int i = 2; i < cost.length; i++) {
            fn = cost[i] + Math.min(fn_1, fn_2);
            fn_2 = fn_1;
            fn_1 = fn;
        }
        fn = Math.min(fn_1, fn_2);
        return fn;
    }
}
