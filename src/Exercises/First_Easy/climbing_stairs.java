package Exercises.First_Easy;
//70 爬楼梯
public class climbing_stairs {
    public int climbStairs(int n) {
        int fn_2 = 1;
        int fn_1 = 2;
        int fn = 0;
        if(n < 3) {
            return n;
        }
        for(int i = 2; i < n; i++) {
            fn = fn_1 + fn_2;
            fn_2 = fn_1;
            fn_1 = fn;
        }
        return fn;
    }
}
