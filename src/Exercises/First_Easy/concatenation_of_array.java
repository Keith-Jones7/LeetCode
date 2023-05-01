package Exercises.First_Easy;
//1929 数组串联
public class concatenation_of_array {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] ans = new int[2 * len];
        System.arraycopy(nums, 0, ans, 0, len);
        System.arraycopy(nums, 0, ans, len, 2 * len - len);
        return ans;

    }
}
