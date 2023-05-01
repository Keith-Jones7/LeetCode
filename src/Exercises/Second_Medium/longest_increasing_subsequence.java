package Exercises.Second_Medium;

//300 最长递增子序列
public class longest_increasing_subsequence {
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        int[] arr = new int[len];
        arr[0] = nums[0];
        int ans = 1;
        for(int i = 1; i < len; i++) {
            if(nums[i] > arr[ans - 1]) {
                arr[ans++] = nums[i];
            }else {
                int index = ans - 1;
                while (index >= 0 && arr[index] >= nums[i]) {
                    index--;
                }
                arr[index + 1] = nums[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        longest_increasing_subsequence test = new longest_increasing_subsequence();
        int[] nums = {10,9,2,5,3,1,101,18};
        test.lengthOfLIS(nums);
    }
}
