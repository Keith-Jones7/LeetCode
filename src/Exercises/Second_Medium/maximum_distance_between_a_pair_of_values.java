package Exercises.Second_Medium;
//1855 下标对中的最大距离
public class maximum_distance_between_a_pair_of_values {
    public int maxDistance2(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;
        int index1 = 0, index2 = 0;
        while (index1 < len1 && index2 < len2) {
            if(nums1[index1] > nums2[index2]) {
                index1++;
            }
            index2++;
        }
        return Math.max(index2 - index1 - 1, 0);
    }
    public int maxDistance(int[] nums1, int[] nums2) {
        int right = nums2.length - 1;
        int max = 0;
        for(int i = nums1.length - 1; i >= 0; i--) {
            int index = binarySearch(nums2, nums1[i], i, right);
            if(index != -1) {
                max = Math.max(index - i, max);
                right = index;
            }
        }
        return max;
    }
    public int binarySearch(int[] nums, int target, int left, int right) {
        if(left > right) {
            return -1;
        }
        if(nums[left] < target) {
            return -1;
        }
        if(nums[right] >= target) {
            return right;
        }
        int sub_left = left, sub_right = right, mid;
        while (sub_left < sub_right) {
            mid = sub_left + (sub_right - sub_left) / 2;
            if(nums[mid] < target) {
                sub_right = mid - 1;
            }else {
                sub_left = mid;
            }
        }
        while (sub_left >= left && nums[sub_left] < target) {
            sub_left--;
        }
        return sub_left;
    }
}
