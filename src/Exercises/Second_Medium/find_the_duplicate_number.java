package Exercises.Second_Medium;
//287 寻找重复数
public class find_the_duplicate_number {
    public int findDuplicateNumber(int[] nums){
        //快慢指针思想，抽象为寻找链表中的环
        int fast = 0, slow = 0;
        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];
            if(slow == fast) {
                fast = 0;
                while (nums[slow] != nums[fast]) {
                    slow = nums[slow];
                    fast = nums[fast];
                }
                return nums[slow];
            }
        }
    }
}
