package Exercises.Second_Medium;
//1785 构成特定和需要添加的最少元素
public class minimum_elements_to_add_to_form_a_given_sum {
    public int minElements(int[] nums, int limit, int goal) {
        long sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return (int)((Math.abs(sum - goal) + limit - 1) / limit);
    }
}
