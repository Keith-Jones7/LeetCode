package Exercises.First_Easy;
//509 斐波那契数
public class fibonacci_number {
    public int fib(int n) {
        if(n < 2){
            return n;
        }
        int fn_2 = 0;
        int fn_1 = 1;
        int fn = 0;
        for(int i = 2; i <= n; i++) {
            fn = fn_1 + fn_2;
            fn_2 = fn_1;
            fn_1 = fn;
        }
        return fn;
    }
}
