package Exercises.Second_Medium;
//1663 具有给定数值的最小字符串
public class smallest_string_with_a_given_numeric_value {
    public String getSmallestString(int n, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        while (k + 26 <= 26 * n) {
            stringBuilder.append('a');
            k--;
            n--;
        }
        int val = k - 26 * (n - 1);
        k -= val;
        if (val > 0) {
            stringBuilder.append((char) ('a' + val - 1));
        }
        stringBuilder.append("z".repeat(k / 26));
        return stringBuilder.toString();
    }
}
