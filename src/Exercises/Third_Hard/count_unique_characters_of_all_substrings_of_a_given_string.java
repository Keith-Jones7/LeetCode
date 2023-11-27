package Exercises.Third_Hard;
import java.util.*;
//828 统计子串中的唯一字符
public class count_unique_characters_of_all_substrings_of_a_given_string {
    public int uniqueLetterString(String s) {
        // 将字符串转换为字符数组
        char[] chars = s.toCharArray();

        // 用于存储每个大写字母的最后两次出现位置
        int[][] lastIndex = new int[26][2];
        for (int i = 0; i < 26; i++) {
            lastIndex[i][0] = -1;
            lastIndex[i][1] = -1;
        }

        int result = 0;

        for (int i = 0; i < chars.length; i++) {
            int c = chars[i] - 'A';

            // 获取该字符的上一次和上上一次的出现位置
            int[] last = lastIndex[c];

            // 计算贡献
            result += (i - last[1]) * (last[1] - last[0]);

            // 更新最后两次出现位置
            last[0] = last[1];
            last[1] = i;
        }

        // 处理字符串末尾
        for (int i = 0; i < 26; i++) {
            int[] last = lastIndex[i];
            result += (chars.length - last[1]) * (last[1] - last[0]);
        }

        return result;
    }

}
