package Exercises.First_Easy;
//27 移除元素
public class remove_element {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for(int num : nums) {
            if(num != val) {
                nums[index++] = num;
            }
        }
        return index;
    }
}
