package Exercises.First_Easy;
import java.util.*;
//989 数组形式的整数加法
public class add_to_array_form_of_integer {
    public List<Integer> addToArrayForm(int[] num, int k) {
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        int add = 0;
        while (index < num.length || k > 0) {
            int val1 = 0, val2 = 0;
            if(index < num.length) {
                val1 = num[num.length - 1 - index];
                index++;
            }
            if(k > 0) {
                val2 = k % 10;
                k /= 10;
            }
            int sum = val1 + val2 + add;
            if(sum >= 10) {
                add = 1;
                sum -= 10;
            }else {
                add = 0;
            }
            stack.add(sum);
        }
        if(add > 0) {
            stack.add(add);
        }
        List<Integer> ans = new ArrayList<>();
        while (!stack.empty()) {
            ans.add(stack.pop());
        }
        return ans;
    }
}
