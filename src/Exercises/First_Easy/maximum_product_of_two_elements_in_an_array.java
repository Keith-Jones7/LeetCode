package Exercises.First_Easy;

import java.util.Arrays;

//1464 数组中两元素的最大乘积
public class maximum_product_of_two_elements_in_an_array {
    public int maxProfit(int[] nums) {
        int first = -1, second = -1;
        for (int num : nums) {
            if (num > first) {
                second = first;
                first = num;
            }else if (num > second) {
                second = num;
            }
        }
        return (first - 1) * (second - 1);
    }
}
