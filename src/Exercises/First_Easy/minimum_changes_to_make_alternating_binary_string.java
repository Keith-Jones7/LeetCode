package Exercises.First_Easy;
//1758 生成交替二进制字符串的最少操作数
public class minimum_changes_to_make_alternating_binary_string {
    public int minOperations(String s) {
        char[] chars = s.toCharArray();
        int[] array = generateBinary(chars.length);
        int count1 = 0, count2 = 0;
        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] - '0') == array[i]) {
                count1++;
            }else {
                count2++;
            }
        }
        return Math.min(count1, count2);
    }
    public int[] generateBinary(int len) {
        int[] chars = new int[len];
        for (int i = 1; i < chars.length; i++) {
            chars[i] = (1 - chars[i - 1]);
            System.out.println(chars[i]);
        }
        return chars;
    }
}
