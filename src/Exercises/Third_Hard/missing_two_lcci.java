package Exercises.Third_Hard;
//面试题 17.19 消失的两个数字
public class missing_two_lcci {
    public int[] missingTwo(int[] nums) {
        long sum_sqr = 0, sum = 0;
        int n = nums.length + 2;
        for (int i = 0; i < n - 2; i++) {
            sum_sqr += ((long) nums[i] * nums[i]);
            sum += nums[i];
        }
        sum_sqr -= (n * (n + 1) * (2L * n + 1)) / 6 - sum_sqr;
        sum = ((long) n * (n + 1) / 2) - sum;
        long c = (sum * sum) - sum_sqr;
        System.out.println(c + "   "+ sum);
        int[] ans = new int[2];
        double sqrt = Math.sqrt(sum * sum - 2 * c);
        ans[0] = (int)((sum - sqrt) / 2);
        ans[1] = (int)((sum + sqrt) / 2);
        return ans;
    }
}
