package Exercises.Second_Medium;
//33 搜索旋转排序数组
public class search_in_rotated_sorted_array {
    public int search(int[] nums, int target) {
        return search(nums, 0, nums.length - 1, target);
    }
    public int search(int[] nums, int left, int right, int target) {
        if(left == right) {
            return nums[left] == target ? left : -1;
        }
        int mid = left + (right - left) / 2;
        int index;
        if(nums[mid] >= nums[left]) {
            index = Math.max(search(nums, mid + 1, right, target), binarySearch(nums, left, mid, target));
        }else {
            index = Math.max(search(nums, left, mid, target), binarySearch(nums, mid + 1, right, target));
        }
        return index;
    }
    public int binarySearch(int[] nums, int left, int right, int target) {
        if(nums[left] > target || nums[right] < target) {
            return -1;
        }
        int L = left, R = right, M;
        while (L < R) {
            M = L + (R - L) / 2;
            if(nums[M] == target) {
                return M;
            }else if(nums[M] < target) {
                L = M + 1;
            }else {
                R = M - 1;
            }
        }
        return nums[L] == target ? L : -1;
    }
}
