package Exercises.First_Easy;
//392 判断子序列
public class is_subsequence {
    public boolean isSubsequence(String s, String t) {
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        if(chars2.length == 0) {
            return false;
        }
        int[] dp = new int[chars2.length + 1];
        dp[0] = 0;
        for(int i = 0; i < chars2.length; i++) {
            if(dp[i] >= chars1.length - 1) {
                return true;
            }
            if(chars2[i] == chars1[dp[i]]) {
                dp[i + 1] = dp[i] + 1;
            }else {
                dp[i + 1] = dp[i];
            }
        }
        System.out.println(dp[chars2.length]);
        return dp[chars2.length] == chars1.length - 1;
    }
}
