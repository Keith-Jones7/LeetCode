package Exercises.First_Easy;
//2917 找出数组中的K-or值
public class find_the_k_or_of_an_array {
    public int findKOr(int[] nums, int k) {
        int[] cnt = new int[32];
        for (int num : nums) {
            for (int index = 0; index < 32; index++) {
                cnt[index] += ((num >> index) & 1);
            }
        }
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            if (cnt[i] >= k) {
                ans |= (1 << i);
            }
        }
        return ans;
    }
}
