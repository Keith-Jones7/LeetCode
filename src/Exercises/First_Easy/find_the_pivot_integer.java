package Exercises.First_Easy;
// 2485 找出中枢整数
public class find_the_pivot_integer {
    public int pivotInteger(int n) {
        int sum = getSum(n), tempSum = 0;
        for (int i = 1; i <= n; i++) {
            tempSum += i;
            if (tempSum == sum - tempSum + i) {
                return i;
            }
        }
        return -1;
    }

    public int getSum(int x) {
        return x * (x + 1) / 2;
    }
}
