package Exercises.First_Easy;
//1796 字符串中第二大的数字
public class second_largest_digit_in_a_string {
    public int secondHighest(String s) {
        int first_max = -1, second_max = -1;
        for (char ch : s.toCharArray()) {
            int val = ch - '0';
            if (val >= 0 && val <= 9) {
                if (val > first_max) {
                    second_max = first_max;
                    first_max = val;
                }else if (val > second_max && val != first_max) {
                    System.out.println(second_max);
                    System.out.println(val);
                    second_max = val;
                }
            }
        }
        return second_max;
    }
}
