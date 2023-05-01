package Exercises.Second_Medium;

import java.util.Stack;

//503 下一个更大元素2
public class next_greater_element_2 {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int len = nums.length;
        int[] ans = new int[len];
        for(int i = 2 * len - 1; i >= 0; i--) {
            while (!stack.empty() && nums[i % len] >= stack.peek()) {
                stack.pop();
            }
            ans[i % len] = stack.empty() ? -1 : stack.peek();
            stack.push(nums[i % len]);
        }
        return ans;
    }
}
