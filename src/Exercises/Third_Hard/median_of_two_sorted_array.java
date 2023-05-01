package Exercises.Third_Hard;
//4 寻找两个正序数组的中位数
public class median_of_two_sorted_array {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int len = len1 + len2;
        int left = (len1 + len2 + 1) / 2;
        int right = (len1 + len2 + 2) / 2;
        return (findKthSortedArrays(nums1, nums2, 0, 0, left) +
                findKthSortedArrays(nums1, nums2, 0, 0, right)) / 2.0;
    }

    public int findKthSortedArrays(int[] nums1, int[] nums2, int start1, int start2, int k) {
        if(start1 == nums1.length) {
            return nums2[start2 + k - 1];
        }
        if(start2 == nums2.length) {
            return nums1[start1 + k - 1];
        }
        if(k == 1) {
            return Math.min(nums1[start1], nums2[start2]);
        }
        int midVal1 = (start1 + k / 2 - 1 < nums1.length ? nums1[start1 + k / 2 - 1] : Integer.MAX_VALUE);
        int midVal2 = (start2 + k / 2 - 1 < nums2.length ? nums2[start2 + k / 2 - 1] : Integer.MAX_VALUE);
        if(midVal1 < midVal2) {
            return findKthSortedArrays(nums1, nums2, start1 + k /2, start2, k - k / 2);
        }else {
            return findKthSortedArrays(nums1, nums2, start1, start2 + k /2, k - k / 2);
        }
    }

}
