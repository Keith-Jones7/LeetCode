package Exercises.Second_Medium;
//1234 替换子串得到平衡字符串
public class replace_the_substring_for_balanced_string {
    public int balancedString(String s) {
        char[] chars = s.toCharArray();
        int[] count1 = new int[26];
        int n = chars.length;
        int equal = n / 4;
        for (char ch : chars) {
            count1[ch - 'A']++;
        }
        int[] count2 = new int[26];
        int left = 0, right = 0, ans = n;
        while (right < n) {
            count2[chars[right++] - 'A']++;
            while ((left < n) && (count1[chars[left] - 'A'] - count2[chars[left] - 'A'] < equal)) {
                count2[chars[left++] - 'A']--;
            }
            if (count1['Q' - 'A'] - count2['Q' - 'A'] <= equal &&
                    count1['W' - 'A'] - count2['W' - 'A'] <= equal &&
                    count1['E' - 'A'] - count2['E' - 'A'] <= equal &&
                    count1['R' - 'A'] - count2['R' - 'A'] <= equal) {
                ans = Math.min(ans, right - left);
            }
        }
        return ans;
    }
}
