package Exercises.First_Easy;
// 面试题01.09 字符串轮转
public class string_rotation_lcci {
    public boolean isFlippedString(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        String s3 = s2 + s2;
        return s3.contains(s1);
    }
}
