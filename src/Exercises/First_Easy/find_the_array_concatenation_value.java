package Exercises.First_Easy;
//2562 找出数组的串联值
public class find_the_array_concatenation_value {
    public long findTheArrayConcVal(int[] nums) {
        int len = nums.length;
        long ans = 0;
        int left = 0, right = len - 1;
        while (left <= right) {
            if (left == right) {
                ans += nums[left];
            }else {
                ans += concatNum(nums[left], nums[right]);
            }
            left++;
            right--;
        }
        return ans;
    }

    public long concatNum(int num1, int num2) {
        return (long) num1 * countIndex(num2) + num2;
    }

    public long countIndex(int num) {
        long cnt = 1;
        while (num > 0) {
            cnt *= 10;
            num /= 10;
        }
        return cnt;
    }
}
