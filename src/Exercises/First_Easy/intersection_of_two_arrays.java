package Exercises.First_Easy;

import java.util.*;

//349 两个数组的交集
public class intersection_of_two_arrays {
    public int[] intersection(int[] nums1, int[] nums2){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i = 0; i < nums1.length; i++){
            set1.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++){
            if(set1.contains(nums2[i])){
                set2.add(nums2[i]);
            }
        }
        int[] nums = new int[set2.size()];
        int index = 0;
        Iterator<Integer> it2 = set2.iterator();
        while (it2.hasNext()){
            nums[index++] = it2.next();
        }
        return nums;
    }
}
