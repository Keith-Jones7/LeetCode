package Exercises.Second_Medium;
//97 交错字符串
public class interleaving_string {
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length() + s2.length() != s3.length()) {
            return false;
        }
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        char[] chars3 = s3.toCharArray();
        boolean[][] dp = new boolean[chars1.length + 1][chars2.length + 1];
        dp[0][0] = true;
        for(int j = 1; j <= chars2.length; j++) {
            dp[0][j] = dp[0][j - 1] && (chars2[j] == chars3[j]);
        }
        for(int i = 1; i <= chars1.length; i++) {
            dp[i][0] = dp[i - 1][0] && (chars1[i] == chars3[i]);
        }
        for(int i = 1; i <= chars1.length; i++) {
            for(int j = 1; j <= chars2.length; j++) {
                dp[i][j] = (dp[i - 1][j] && chars1[i - 1] == chars3[i + j - 1]) || (dp[i][j - 1] && chars2[j - 1] == chars3[i + j - 1]);
            }
        }
        return dp[chars1.length][chars2.length];
    }

    public static void main(String[] args) {
        interleaving_string test = new interleaving_string();
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";
        test.isInterleave(s1, s2, s3);
    }
}
