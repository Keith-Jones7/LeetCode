package Exercises.First_Easy;
//1822 数组元素积的符号
public class sign_of_the_product_of_an_array {
    public int arraySign(int[] nums) {
        int ans = 1;
        for (int num : nums) {
            if (num == 0) {
                return 0;
            }
            if (num < 0) {
                ans = (-ans);
            }
        }
        return ans;
    }
}
