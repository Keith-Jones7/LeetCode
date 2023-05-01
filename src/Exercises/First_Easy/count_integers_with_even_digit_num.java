package Exercises.First_Easy;
//2180 统计各位数字之和为偶数的整数个数
public class count_integers_with_even_digit_num {
    public int countEven(int num) {
        int pre = num - num % 10;
        int count = 0;
        for (int i = pre; i <= num; i++) {
            count += count(i);
            System.out.println(count(i));
        }
        return pre / 2 - 1 + count;
    }
    public int count(int num) {
        String str = "" + num;
        int count = 0;
        for (char ch : str.toCharArray()) {
            count += (ch - '0');
        }
        return 1 - (count % 2);
    }
}
