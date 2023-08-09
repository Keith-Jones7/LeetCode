package Exercises.Second_Medium;
//1749 任意子数组和的绝对值的最大值
public class maximum_absolute_sum_of_any_subarray {
    public int maxAbsoluteSum(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sumPos = 0, sumNeg = 0;
        for (int num : nums) {
            if (sumPos >= 0) {
                sumPos += num;
            }else {
                sumPos = num;
            }
            if (sumNeg <= 0) {
                sumNeg += num;
            }else {
                sumNeg = num;
            }
            int tempMax = 0;
            if (sumPos + sumNeg < 0) {
                tempMax = -sumNeg;
            }else {
                tempMax = sumPos;
            }
            max = Math.max(max, tempMax);
        }
        return max;
    }
}
