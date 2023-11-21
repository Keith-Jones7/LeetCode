package Exercises.Second_Medium;
//2216 美化数组的最少删除数
public class minimum_deletions_to_make_array_beautiful {
    public int minDeletion(int[] nums) {
        int index = 0, cur = -1;
        for (int num : nums) {
            if (index % 2 == 0) {
                cur = num;
                index++;
            } else if (num != cur){
                index++;
            }
        }
        return nums.length - 2 * (index / 2);
    }
}
