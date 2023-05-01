package Exercises.Second_Medium;
//1750 删除字符串两端相同字符后的最短长度
public class minimum_length_of_string_after_deleting_similar_ends {
    public int minimumLength(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right && chars[left] == chars[right]) {
            char c = chars[left];
            while (left <= right && chars[left] == c) {
                left++;
            }
            while (left <= right && chars[right] == c) {
                right--;
            }
        }
        return right - left + 1;
    }
}
