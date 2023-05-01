package Exercises.Third_Hard;
//629 k个逆序对数组
public class k_inverse_pairs_array {
    public int kInversePairs(int n, int k){
        if(k == 0){
            return 1;
        }
        if(k >(n*(n-1)/2)){
            return 0;
        }
        if(n < 3){
            return 1;
        }
        long[][] dp = new long[n + 1][k + 1];
        int mod = (int)1e9 + 7;
        dp[1][0] = 1;
        for(int i = 2; i <= n; i++){
            int max_pairs = (i * (i - 1))/2;
            for(int j = 0; j < k + 1 && j <= max_pairs; j++){
                if(j == 0){
                    dp[i][j] = 1;
                    continue;
                }
                if(j > max_pairs/2) {
                    dp[i][j] = dp[i][max_pairs - j];
                    continue;
                }
                if(j < i){
                    dp[i][j] = (dp[i][j - 1] + dp[i - 1][j]) % mod;
                }
                else{
                    dp[i][j] = (dp[i][j - 1] + dp[i - 1][j] - dp[i - 1][j - i] + mod) % mod;
                }
            }
        }
        return (int)dp[n][k];
    }

    public static void main(String[] args) {
        int n = 1000;
        int k = 1000;
        k_inverse_pairs_array test = new k_inverse_pairs_array();
        int q = test.kInversePairs(n, k);
        System.out.println(q);
    }
}
