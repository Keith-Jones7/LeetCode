package Exercises.Third_Hard;
//1092 最短公共超序列
public class shortest_common_supersequence {
    public String shortestCommonSupersequence(String str1, String str2) {
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        int[][] dp = new int[chars1.length + 1][chars2.length + 1];
        for (int i = 1; i <= chars1.length; i++) {
            for (int j = 1; j <= chars2.length; j++) {
                if (chars1[i - 1] == chars2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }else {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + 1;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        int i = chars1.length, j = chars2.length;
        while (i > 0 && j > 0) {
            if (chars1[i - 1] == chars2[j - 1]) {
                sb.append(chars1[i - 1]);
                i--;
                j--;
            } else if (dp[i - 1][j] < dp[i][j - 1]) {
                sb.append(chars1[i - 1]);
                i--;
            } else {
                sb.append(chars2[j - 1]);
                j--;
            }
        }
        while (i > 0) {
            sb.append(chars1[i - 1]);
            i--;
        }
        while (j > 0) {
            sb.append(chars2[j - 1]);
            j--;
        }
        return sb.reverse().toString();
    }
}
