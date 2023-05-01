package Exercises.Second_Medium;
//1781 所有子字符串美丽值之和
public class sum_of_beauty_of_all_substrings {
    public int beautySum(String s) {
        char[] chars = s.toCharArray();
        int ans = 0;
        for (int i = 0; i < chars.length; i++) {
            int[] count = new int[26];
            for (int j = i; j < chars.length; j++) {
                count[chars[j] - 'a']++;
                ans += beauty(count);
            }
        }
        return ans;
    }
    public int beauty(int[] count) {
        int min = 1001, max = 0;
        for (int num : count) {
            if (num != 0) {
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            }
        }
        return max - min;
    }
}
