package Exercises.Second_Medium;
//2575 找出字符串的可整除数组
public class find_the_divisibility_array_of_a_string {
    public int[] divisibilityArray(String word, int m) {
        int len = word.length();
        int[] ans = new int[len];
        char[] chars = word.toCharArray();
        long mod = 0;
        for (int i = 0; i < len; i++) {
            int val = chars[i] - '0';
            mod = mod * 10 + val;
            mod %= m;
            if (mod == 0) {
                ans[i] = 1;
            }
        }
        return ans;
    }
}
