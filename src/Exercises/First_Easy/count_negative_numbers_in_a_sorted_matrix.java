package Exercises.First_Easy;
//1351 统计有序矩阵的负数
public class count_negative_numbers_in_a_sorted_matrix {
    int size;
    public int countNegatives(int[][] grid) {
        int count = 0;
        size = grid[0].length;
        for(int[] nums : grid) {
            count += binarySearch(nums);
        }
        return count;
    }
    public int binarySearch(int[] nums) {
        if(nums[0] < 0) {
            return size;
        }
        if(nums[size - 1] >= 0) {
            return 0;
        }
        int left = 0, right = size - 1, mid;
        while (left < right) {
            mid = left + (right - left) / 2;
            if(nums[mid] >= 0) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        while (left >= 0 && nums[left] >= 0) {
            left++;
        }
        return size - left;
    }
}
