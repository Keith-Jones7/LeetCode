package Exercises.Second_Medium;
//467 环绕字符串中唯一的子字符串
public class unique_substrings_in_wraparound_string {
    public int findSubStringInWraparoundString(String p) {
        char[] chars = p.toCharArray();
        int len = chars.length, ans = 0;
        int[] dp = new int[len];
        int[] count = new int[26];
        dp[0] = 1;
        count[chars[0] - 'a'] = 1;
        for(int i = 1; i < len; i++) {
            if(chars[i] - chars[i - 1] == 1 || (chars[i] == 'a' && chars[i - 1] == 'z')) {
                dp[i] = 1 + dp[i - 1];
            }else {
                dp[i] = 1;
            }
            count[chars[i] - 'a'] = Math.max(dp[i], count[chars[i] - 'a']);
        }
        for(int num : count) {
            ans += num;
        }
        return ans;
    }
}
