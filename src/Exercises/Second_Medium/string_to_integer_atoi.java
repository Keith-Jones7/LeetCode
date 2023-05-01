package Exercises.Second_Medium;

//8 字符串转整数(atoi)
public class string_to_integer_atoi {
    public int myAtoi(String s) {
        char[] chars = s.toCharArray();
        int start = 0, len = chars.length;
        boolean flag = false;
        while (start < len && (chars[start] == ' ')) {
            start++;
        }
        if (start < len && (chars[start] == '+' || chars[start] == '-')) {
            flag = chars[start] == '-';
            start++;
        }
        while (chars[start] == '0') {
            start++;
        }
        int end = start;
        while (end < len && Character.isDigit(chars[end])) {
            end++;
        }
        if(end - start > 10) {
            if(flag) {
                return Integer.MIN_VALUE;
            }else {
                return Integer.MAX_VALUE;
            }
        }
        if(start == end) {
            return 0;
        }
        long num = Long.parseLong(s.substring(start, end));
        if(flag) {
            num = -num;
        }
        if(num < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        if(num > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return (int) num;
    }

    public static void main(String[] args) {
        String s = "3.1415";
        string_to_integer_atoi test = new string_to_integer_atoi();
        test.myAtoi(s);
    }
}
