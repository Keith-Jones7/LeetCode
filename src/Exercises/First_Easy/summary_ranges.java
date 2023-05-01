package Exercises.First_Easy;
import java.util.*;
//228 汇总区间
public class summary_ranges {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int index = 0;
        String add = "->";
        while (index < nums.length) {
            StringBuilder stringBuilder = new StringBuilder();
            int left = index;
            int right = index;
            while (right < nums.length) {
                if(right + 1 == nums.length || nums[right + 1] - nums[right] != 1) {
                    break;
                }
                right++;
            }
            if(left == right) {
                list.add(stringBuilder.append(nums[left]).toString());
            }else {
                list.add(stringBuilder.append(nums[left]).append(add).append(nums[right]).toString());
            }
            index = right + 1;
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};
        summary_ranges summary_range = new summary_ranges();
        summary_range.summaryRanges(nums);
    }
}
