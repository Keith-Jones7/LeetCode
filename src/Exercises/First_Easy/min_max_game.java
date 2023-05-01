package Exercises.First_Easy;
//2293 极大极小游戏
public class min_max_game {
    public int minMaxGame(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int[] arr = new int[nums.length / 2];
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
            }else {
                arr[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
            }
        }
        return minMaxGame(arr);
    }
}
