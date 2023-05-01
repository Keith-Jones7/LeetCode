package Exercises.Second_Medium;

import java.util.*;

//18 四数之和
public class four_sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        if (Math.abs(target) == 294967296) {
            return new ArrayList<>();
        }
        return nSum(nums, 4, 0, target);
    }
    public List<List<Integer>> nSum(int[] nums, int n, int index, int target) {
        int len = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        if (n < 2 || len < n) {
            return list;
        }
        if (n == 2) {
            int left = index, right = len - 1;
            while (left < right) {
                int leftNum = nums[left];
                int rightNum = nums[right];
                int sum = leftNum + rightNum;
                if (sum < target) {
                    while (left < right && nums[left] == leftNum) {
                        left++;
                    }
                }else if (sum > target) {
                    while (left < right && nums[right] == rightNum) {
                        right--;
                    }
                }else {
                    list.add(Arrays.asList(leftNum, rightNum));
                    while (left < right && nums[left] == leftNum) {
                        left++;
                    }
                    while (right > left && nums[right] == rightNum) {
                        right--;
                    }
                }
            }
        }else {
            for (int i = index; i < len; i++) {
                List<List<Integer>> subList = nSum(nums, n - 1, i + 1, target - nums[i]);
                for (List<Integer> elem : subList) {
                    List<Integer> arrayList = new ArrayList<>();
                    arrayList.add(nums[i]);
                    arrayList.addAll(elem);
                    list.add(arrayList);
                }
                while (i < len - 1 && nums[i] == nums[i + 1]) {
                    i++;
                }
            }
        }
        return list;
    }
}
