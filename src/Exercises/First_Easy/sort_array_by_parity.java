package Exercises.First_Easy;
//905 按奇偶排序数组
public class sort_array_by_parity {
    public int[] sortArrayByParity(int[] nums) {
        int len = nums.length;
        int[] sorted = new int[len];
        int left = 0, right = len - 1;
        for(int num : nums) {
            if((num & 1) == 1) {
                sorted[right--] = num;
            }else {
                sorted[left++] = num;
            }
        }
        return sorted;
    }
}
