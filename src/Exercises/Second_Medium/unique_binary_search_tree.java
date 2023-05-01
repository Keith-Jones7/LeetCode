package Exercises.Second_Medium;
//96 不同的二叉搜索树
public class unique_binary_search_tree {
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++) {
            int sum = 0;
            for(int j = 0; j < i; j++) {
                sum += (dp[j] * dp[i - j - 1]);
            }
            dp[i] = sum;
        }
        return dp[n];
    }
}
