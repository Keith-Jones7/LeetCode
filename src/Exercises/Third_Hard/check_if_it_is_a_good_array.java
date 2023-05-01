package Exercises.Third_Hard;
//1250 检查好数组
public class check_if_it_is_a_good_array {
    public boolean isGoodArray(int[] nums) {
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ans = gcd(ans, nums[i]);
        }
        return ans == 1;
    }

    public int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        if (num2 > num1) {
            return gcd(num2, num1);
        }else {
            return gcd(num2, num1 % num2);
        }
    }
}
