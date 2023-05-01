package Exercises.First_Easy;
//1137 第N个泰波那契数
public class n_th_tribonacci_number {
    public int tribonacci(int n) {
        if(n < 3){
            return n == 2?1:n;
        }
        int tn_3 = 0;
        int tn_2 = 1;
        int tn_1 = 1;
        int tn = 0;
        for(int i = 3; i <= n; i++) {
            tn = tn_1 + tn_2 + tn_3;
            tn_3 = tn_2;
            tn_2 = tn_1;
            tn_1 = tn;
        }
        return tn;
    }
}
