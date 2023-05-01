import Exercises.First_Easy.non_overlapping_intervals;
import java.util.*;
public class Test {
    public Test(){

    }
    public Test(int num1){

    }
    public int run(int num){
        return 0;
    }

    public static void main(String[] args) {
        getclass(new non_overlapping_intervals());
    }
    public static <T> void getclass(T t) {
        System.out.println(t.getClass().getTypeName());
    }

    public int arithmeticTriples(int[] nums, int diff) {
        int count = 0, len = nums.length, min = nums[0], max = nums[len - 1];
        for (int i = 1; i < nums.length - 1; i++) {
            int left = nums[i] - diff;
            int right = nums[i] + diff;
            if (left >= min && right <= max && Arrays.binarySearch(nums, nums[i] - diff) >= 0 &&
                    Arrays.binarySearch(nums, nums[i] + diff) > 0) {
                count++;
            }
        }
        return count;
    }
}
