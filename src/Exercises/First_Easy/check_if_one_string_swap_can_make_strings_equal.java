package Exercises.First_Easy;
//1790 仅执行一次字符串交换能否使两个字符相等
public class check_if_one_string_swap_can_make_strings_equal {
    public boolean areAlmostEqual(String s1, String s2) {
        int or1 = 0, sum1 = 0;
        int or2 = 0, sum2 = 0;
        int count_diff = 0;
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] != chars2[i]) {
                count_diff++;
                or1 ^= chars1[i];
                sum1 += chars1[i];
                or2 ^= chars2[i];
                sum2 += chars2[i];
            }
        }
        return count_diff <= 2 && or1 == or2 && sum1 == sum2;
    }
}
