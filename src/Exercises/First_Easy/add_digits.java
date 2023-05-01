package Exercises.First_Easy;
//258 各位相加
public class add_digits {
    /**
     * 非递归实现
     */
    public int addDigits2(int num) {
        return (num - 1) % 9 + 1;
    }
    /**
     * 递归实现
     */
    public int addDigits(int num) {
        if(num < 10) {
            return num;
        }
        return addDigits(add(num));
    }
    public int add(int num) {
        int add = 0;
        while (num > 0) {
            add += (num % 10);
            num = num/10;
        }
        return add;
    }

}
