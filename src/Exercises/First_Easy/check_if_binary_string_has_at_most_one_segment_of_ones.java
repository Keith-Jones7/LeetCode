package Exercises.First_Easy;
//1784 检查二进制字符串字段
public class check_if_binary_string_has_at_most_one_segment_of_ones {
    public boolean checkOnesSegment(String s) {
        char[] chars = s.toCharArray();
        int count1 = 0, count2 = 0;
        for (char aChar : chars) {
            if (aChar == '1') {
                count2++;
            } else {
                if (count2 > 0) {
                    count1++;
                }
                count2 = 0;
            }
        }
        if (count2 > 0) {
            count1++;
        }
        return count1 < 2;
    }
}
