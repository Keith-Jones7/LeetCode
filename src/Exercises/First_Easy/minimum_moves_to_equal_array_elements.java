package Exercises.First_Easy;
//453 最小操作次数使数组元素相等
public class minimum_moves_to_equal_array_elements {
    public int minMoves(int[] nums) {
        int sum = 0, count = 0;
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        for(int num : nums) {
            max = Math.max(max, num);
        }
        for(int num : nums) {
            sum += (max - num);
            if(sum >= (n - 1)) {
                count++;
                sum -= (n - 1);
            }
        }
        if(count == 0) {
            return count;
        }
        count += ((n - 1) - sum + 1);
        return count;
    }
}
