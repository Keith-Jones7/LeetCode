package Exercises.First_Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//350 两个数组的交集2
public class intersection_of_two_arrays_2 {
    public int[] intersect(int[] nums1, int[] nums2){
        HashMap<Integer, Integer> map1 = new HashMap<>();
        List<Integer> list1 = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++){
            if(map1.containsKey(nums1[i])){
                map1.replace(nums1[i],map1.get(nums1[i]) + 1);
            }
            else{
                map1.put(nums1[i], 1);
            }
        }
        for(int i = 0; i < nums2.length; i++){
            if(map1.containsKey(nums2[i]) && map1.get(nums2[i]) != 0){
                list1.add(nums2[i]);
                map1.replace(nums2[i], map1.get(nums2[i]) - 1);
            }
        }
        int[] num = new int[list1.size()];
        int index = 0;
        for(int i: list1){
            num[index++] = i;
        }
        return num;
    }
}
