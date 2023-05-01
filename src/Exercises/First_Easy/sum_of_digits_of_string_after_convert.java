package Exercises.First_Easy;
//1945 字符串转化后的各位数字之和
public class sum_of_digits_of_string_after_convert {
    public int getLucky(String s, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : s.toCharArray()) {
            stringBuilder.append(ch - 'a' + 1);
        }
        String str = stringBuilder.toString();
        for (int i = 0; i < k; i++) {
            str = convert(str);
        }
        return Integer.parseInt(str);
    }
    public String convert(String s) {
        int sum = 0;
        for (char ch : s.toCharArray()) {
            sum += (ch - '0');
        }
        return Integer.toString(sum);
    }
}
