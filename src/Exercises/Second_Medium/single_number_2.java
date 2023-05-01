package Exercises.Second_Medium;
//137 只出现一次的数字2
public class single_number_2 {
    public int singleNumber1(int[] nums) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int total = 0;
            for (int num : nums) {
                total += ((num >> i) & 1);
            }
            if (total % 3 == 1) {
                ans += (1 << i);
            }
        }
        return ans;
    }
}
