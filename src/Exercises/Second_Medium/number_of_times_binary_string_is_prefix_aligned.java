package Exercises.Second_Medium;
//1375 二进制字符串前缀一致的次数
public class number_of_times_binary_string_is_prefix_aligned {
    public int numTimesAllBlue(int[] flips) {
        int max = -1, cnt = 0, ans = 0;
        for (int num : flips) {
            if (num > max) {
                max = num;
            }
            cnt++;
            if (cnt == max) {
                ans++;
            }
        }
        return ans;
    }
}
