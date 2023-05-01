package Exercises.First_Easy;
//88 合并两个有序数组
public class merge_sorted_array {
    public void merge(int[] nums1, int m, int[] nums2, int n){
        int index1 = m - 1, index2 = n - 1;
        for(int i = m + n - 1; i >= 0 && index2 >=0; i --){
            if(index1 >=0){
                if(nums2[index2] > nums1[index1]){
                    nums1[i] = nums2[index2--];
                }
                else {
                    nums1[i] = nums1[index1--];
                }
            }
            else {
                nums1[i] = nums2[index2--];
            }
        }
    }
}
