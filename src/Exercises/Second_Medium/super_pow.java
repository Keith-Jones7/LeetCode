package Exercises.Second_Medium;
//372 超级次方
public class super_pow {
    private static final int MOD = 1337;
    public int superPow(int a, int[]b){
        return dfs(a % MOD, b, b.length - 1);
    }
    private int dfs(int a, int[] b, int index){
        if(index == -1 || a == 1){
            return 1;
        }
        return qPow(dfs(a, b, index - 1), 10) * qPow(a, b[index]) % MOD;
    }
    private int qPow(int a, int b){
        int ans = 1;
        a %= MOD;
        while (b > 0){
            if((b & 1) != 0){
                ans = ans * a % MOD;
            }
            a = a * a % MOD;
            b >>= 1;
        }
        return ans;
    }
}
