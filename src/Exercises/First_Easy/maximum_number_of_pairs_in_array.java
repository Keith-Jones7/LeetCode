package Exercises.First_Easy;
//2341 数组能形成多少数对
public class maximum_number_of_pairs_in_array {
    public int[] numbersOfPairs(int[] nums) {
        int ans = 0;
        int[] count = new int[101];
        for (int num : nums) {
            count[num]++;
        }
        for (int num : count) {
            if (num % 2 != 0) {
                ans++;
            }
        }
        return new int[]{(nums.length - ans) / 2, ans};
    }
}
