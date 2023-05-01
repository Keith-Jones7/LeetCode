package Exercises.Second_Medium;
//915 分割数组
public class partition_array_into_disjoint_intervals {
    public int partitionDisjoint(int[] nums) {
        int len = nums.length;
        int[] right_min = new int[len];
        int min = Integer.MAX_VALUE;
        for (int i = len - 1; i >= 0; i--) {
            min = Math.min(min, nums[i]);
            right_min[i] = min;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < len - 1; i++) {
            max = Math.max(max, nums[i]);
            if (max <= right_min[i + 1]) {
                return i + 1;
            }
        }
        return len;
    }
}
