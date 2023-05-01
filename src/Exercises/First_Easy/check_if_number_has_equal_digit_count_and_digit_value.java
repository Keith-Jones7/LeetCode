package Exercises.First_Easy;
//2283 判断一个数的数字计数是否等于数位的值
public class check_if_number_has_equal_digit_count_and_digit_value {
    public boolean digitCount(String num) {
        char[] chars = num.toCharArray();
        int[] count = new int[10];
        for (char ch : chars) {
            count[ch - '0']++;
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] - '0' != count[i]) {
                return false;
            }
        }
        return true;
    }
}
