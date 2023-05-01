package Exercises.Second_Medium;
//80 删除有序数组中的重复项2
public class remove_duplicates_from_sorted_array_2 {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        int right = 1;
        int cur = Integer.MIN_VALUE;
        int count_cur = 1;
        while (right < nums.length) {
            if (nums[right] == cur) {
                if (count_cur == 1) {
                    nums[left++] = cur;
                    count_cur++;
                }
            }else {
                cur = nums[right];
                nums[left++] = cur;
                count_cur = 1;
            }
            right++;
        }
        System.out.println((33 >> 1) << 6);
        return left;
    }
}
