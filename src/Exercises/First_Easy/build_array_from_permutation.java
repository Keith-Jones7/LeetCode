package Exercises.First_Easy;
//1920 基于排列构建数组
public class build_array_from_permutation {
    public int[] buildArray(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        for(int i = 0; i < len; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
