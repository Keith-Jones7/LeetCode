package Exercises.Second_Medium;
//375 猜数字大小2
public class guess_number_higher_or_lower_2 {
    public static int getMoneyAmount(int n){
        if(n <= 3){
            return n - 1;
        }
        int[][] dp = new int[n+1][n+1];
        for(int i = n - 1; i >=1 ; i--){
            for(int j = i + 1; j <=n; j++){
                int minCost = Integer.MAX_VALUE;
                for(int k = i; k <= j;k++){
                    int cost = k + Math.max(dp[i][k - 1], dp[k + 1][j]);
                    minCost = Math.min(cost, minCost);
                }
                dp[i][j] = minCost;
            }
        }
        return dp[1][n];
    }

    public static void main(String[] args) {
        System.out.println(getMoneyAmount(6));
    }
}
