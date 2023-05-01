package Exercises.Third_Hard;

import java.util.*;

//902 最大为N的数字组合
public class numbers_at_most_n_given_digit_set {
    int[] list;//存放digits
    int list_size;
    int digit_count;//记录n的位数
    int[] bits;//记录n的每位数字
    public int atMostNGivenDigitSet(String[] digits, int n) {
        list_size = digits.length;
        list = new int[list_size];
        for (int i = 0; i < list_size; i++) {
            list[i] = Integer.parseInt(digits[i]);
        }
        digit_count = digitCount(n);
        int count = 0;
        for (int i = 1; i < digit_count; i++) {//求小于n的位数的数字组合数目
            count += combinationDigit(i);
        }

        bits = new int[digit_count];//将n的各个位作为数组元素保存
        for (int i = 0; i < digit_count; i++) {
            bits[i] = n % 10;
            n /= 10;
        }
        count += dfs(bits, digit_count - 1);//dfs求每一位有多少种可能
        return count;
    }

    public int combinationDigit(int k) {//求digits中的数字组成k位数有多少中组合，每位均有可能是任意数字
        return (int)Math.pow(list.length, k);
    }

    public int digitCount(int n) {//求n有几位数字
        if (n < 10) {
            return 1;
        }else {
            return digitCount(n / 10) + 1;
        }
    }
    public int dfs(int[] bits, int index) {//dfs，从最高位开始
        if (index < 0) {//边界条件
            return 1;
        }
        int count = 0;
        int bit = bits[index];
        for (int num : list) {
            if (num < bit) {//如果digits中的数字小于n的第index位数，那么index后面的位可以随意组合，直接剪枝
                count += combinationDigit(index);
            }else if (num == bit) {//如果digits中的数字小于n的第index位数，那么dfs下一位数
                count += dfs(bits, index - 1);
            }
        }
        return count;
    }
}
