package Exercises.Second_Medium;
//238 除自身以外数组的乘积
public class product_of_array_except_self {
    public int[] productExceptSelf(int[] nums){
        int len = nums.length;
        int[] answer = new int[len];
        int[] order = new int[len];
        int[] re_order = new int[len];
        order[0] = 1;
        re_order[len - 1] = 1;
        for(int i = 1; i < len; i++){
            order[i] = order[i - 1] * nums[i - 1];
            re_order[len - i - 1] = re_order[len - i] * nums[len - i];
        }
        for(int i = 0;i < len; i++){
            answer[i] = order[i] * re_order[i];
        }
        return answer;
    }
    public int[] productExceptSelf2(int[] nums){
        int len = nums.length;
        int[] ans = new int[len];
        ans[0] = 1;
        for(int i = 1; i < len; i++){
            ans[i] = ans[i - 1] * nums[i - 1];
        }
        int right = nums[len - 1];
        for(int i = len - 2; i >= 0; i--){
            ans[i] = ans[i] * right;
            right *= nums[i];
        }
        return ans;
    }
}
